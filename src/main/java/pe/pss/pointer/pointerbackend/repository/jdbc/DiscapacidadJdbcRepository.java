package pe.pss.pointer.pointerbackend.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import pe.pss.pointer.pointerbackend.model.dto.AreaInteresDTO;
import pe.pss.pointer.pointerbackend.model.dto.DiscapacidadDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class DiscapacidadJdbcRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<DiscapacidadDTO> getDiscapacidadesByPostulante(String id){

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("idPostulante",id);

        String sql = "select  a.idDiscapacidadPostulante,a.idPostulante," +
                "(select GlsDato from datos where idDato = a.idTipoDiscapacidad) as tipoDiscapacidad," +
                "a.porcentajeDiscapacidad " +
                "from rh_rl_tz_postulante_discapacidad a where a.idPostulante = :idPostulante";

        return (List<DiscapacidadDTO>)jdbcTemplate.query(sql, parameters, new DiscapacidadDTOMapper());

    }

    private static final class DiscapacidadDTOMapper implements RowMapper<DiscapacidadDTO> {

        @Override
        public DiscapacidadDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

            DiscapacidadDTO discapacidadDTO = new DiscapacidadDTO();
            discapacidadDTO.setIdDiscapacidadPostulante(rs.getString("idDiscapacidadPostulante"));
            discapacidadDTO.setIdPostulante(rs.getString("idPostulante"));
            discapacidadDTO.setTipoDiscapacidad(rs.getString("tipoDiscapacidad"));
            discapacidadDTO.setPorcentajeDiscapacidad(rs.getInt("porcentajeDiscapacidad"));
            return discapacidadDTO;

        }
    }
}
