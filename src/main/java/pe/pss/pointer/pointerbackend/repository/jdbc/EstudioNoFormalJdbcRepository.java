package pe.pss.pointer.pointerbackend.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import pe.pss.pointer.pointerbackend.model.dto.EstudioFormalDTO;
import pe.pss.pointer.pointerbackend.model.dto.EstudioNoFormalDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class EstudioNoFormalJdbcRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<EstudioNoFormalDTO> getNoFormalesByPostulante(String id){

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("idPostulante",id);

        String sql = "select e.idEstudioNoFormal," +
                "(select GlsDato from datos where idTipoDatos = 'MA' AND valorDato = 'F' AND idDato = e.idDatoModalidadAcademica) as modalidad," +
                "(select glsCarreraEducativ from pllcarreraeducativa where idInstitucion = e.idTipoInstitucion and idCarreraEducativa = e.idCarreraEducativa)as titulo," +
                "(select glsInstitucion from pllinstitucion where idInstitucion = e.idTipoInstitucion)as institucion," +
                "e.fechaInicio," +
                "e.fechaFin " +
                "from rh_rl_tz_estudio_no_formal e where e.idPostulante = :idPostulante";

        return (List<EstudioNoFormalDTO>)jdbcTemplate.query(sql, parameters, new EstudioNoFormalDTODTOMapper());

    }

    private static final class EstudioNoFormalDTODTOMapper implements RowMapper<EstudioNoFormalDTO> {

        @Override
        public EstudioNoFormalDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

            EstudioNoFormalDTO estudioNoFormalDTO = new EstudioNoFormalDTO();
            estudioNoFormalDTO.setIdEstudio(rs.getString("idEstudioNoFormal"));
            estudioNoFormalDTO.setNombreCurso(rs.getString("titulo"));
            estudioNoFormalDTO.setInstitucion(rs.getString("institucion"));
            estudioNoFormalDTO.setFechaInicio(rs.getDate("fechaInicio"));
            estudioNoFormalDTO.setFechaFin(rs.getDate("fechaFin"));
            return estudioNoFormalDTO;

        }
    }
}
