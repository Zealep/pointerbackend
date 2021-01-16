package pe.pss.pointer.pointerbackend.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import pe.pss.pointer.pointerbackend.model.dto.EstudioFormalDTO;
import pe.pss.pointer.pointerbackend.model.dto.FamiliaDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class EstudioFormalJdbcRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<EstudioFormalDTO> getFormalesByPostulante(String id){

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("idPostulante",id);

        String sql = "select e.idEstudioFormal," +
                "    (select GlsDato from datos where idTipoDatos = 'MA' AND valorDato = 'F' AND idDato = e.idDatoModalidadAcademica) as modalidad," +
                "    (select glsCarreraEducativ from pllcarreraeducativa where idInstitucion = e.idTipoInstitucion and idCarreraEducativa = e.idCarreraEducativa)as titulo," +
                "    (select glsInstitucion from pllinstitucion where idInstitucion = e.idTipoInstitucion)as institucion," +
                "    e.fechaInicio," +
                "    e.fechaFin " +
                "    from rh_rl_tz_estudio_formal e where e.idPostulante = :idPostulante";

        return (List<EstudioFormalDTO>)jdbcTemplate.query(sql, parameters, new EstudioFormalDTOMapper());

    }

    private static final class EstudioFormalDTOMapper implements RowMapper<EstudioFormalDTO> {

        @Override
        public EstudioFormalDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

            EstudioFormalDTO estudioFormalDTO = new EstudioFormalDTO();
            estudioFormalDTO.setIdEstudio(rs.getString("idEstudioFormal"));
            estudioFormalDTO.setModalidad(rs.getString("modalidad"));
            estudioFormalDTO.setTitulo(rs.getString("titulo"));
            estudioFormalDTO.setInstitucion(rs.getString("institucion"));
            estudioFormalDTO.setFechaInicio(rs.getDate("fechaInicio"));
            estudioFormalDTO.setFechaFin(rs.getDate("fechaFin"));
            return estudioFormalDTO;

        }
    }
}
