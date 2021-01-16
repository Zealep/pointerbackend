package pe.pss.pointer.pointerbackend.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import pe.pss.pointer.pointerbackend.model.dto.FamiliaDTO;
import pe.pss.pointer.pointerbackend.model.dto.IdiomaDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class FamiliaJdbcRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<FamiliaDTO> getFamiliasByPostulante(String id){

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("idPostulante",id);

        String sql = "select f.idFamilia,t.GlsTipoDocumentoIdentidad as tipoDocumento," +
                "    f.numeroDocumento,f.nombres," +
                "    (select concat(f.apellidoPaterno,'',f.apellidoMaterno)) as apellidos," +
                "    (select GlsDato from datos where idTipoDatos= '97' and idDato = f.idDatoTipoParentesco)as vinculo " +
                "     from rh_rl_tz_familia f " +
                "    inner join tipodocumentosidentidad t on f.idTipoDocumentoIdentidad = t.idTipoDocumentoIdentidad where f.idPostulante = :idPostulante";

        return (List<FamiliaDTO>)jdbcTemplate.query(sql, parameters, new FamiliaDTOMapper());

    }

    private static final class FamiliaDTOMapper implements RowMapper<FamiliaDTO> {

        @Override
        public FamiliaDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

            FamiliaDTO familiaDTO = new FamiliaDTO();
            familiaDTO.setIdFamilia(rs.getString("idFamilia"));
            familiaDTO.setTipoDocumento(rs.getString("tipoDocumento"));
            familiaDTO.setNumeroDocumento(rs.getString("numeroDocumento"));
            familiaDTO.setNombres(rs.getString("nombres"));
            familiaDTO.setApellidos(rs.getString("apellidos"));
            familiaDTO.setVinculo(rs.getString("vinculo"));
            return familiaDTO;

        }
    }
}
