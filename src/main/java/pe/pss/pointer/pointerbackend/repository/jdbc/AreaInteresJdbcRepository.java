package pe.pss.pointer.pointerbackend.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import pe.pss.pointer.pointerbackend.model.dto.AreaInteresDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class AreaInteresJdbcRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<AreaInteresDTO> getAreasByPostulante(String id){

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("idPostulante",id);

        String sql = "select  a.idPostulanteAreas,a.idPostulante," +
                "(select GlsArea from areas where idArea = a.idAreaAspira) as area " +
                "from rh_rl_tz_postulante_area_interes a where a.idPostulante = :idPostulante";
        return (List<AreaInteresDTO>)jdbcTemplate.query(sql, parameters, new AreaInteresDTOMapper());

    }

    private static final class AreaInteresDTOMapper implements RowMapper<AreaInteresDTO> {

        @Override
        public AreaInteresDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

            AreaInteresDTO areaInteresDTO = new AreaInteresDTO();
            areaInteresDTO.setIdPostulanteAreas(rs.getString("idPostulanteAreas"));
            areaInteresDTO.setIdPostulante(rs.getString("idPostulante"));
            areaInteresDTO.setArea(rs.getString("area"));
            return areaInteresDTO;

        }
    }
}
