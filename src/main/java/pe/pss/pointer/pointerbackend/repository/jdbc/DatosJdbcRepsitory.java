package pe.pss.pointer.pointerbackend.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import pe.pss.pointer.pointerbackend.model.dto.CarreraEducativaDTO;
import pe.pss.pointer.pointerbackend.model.dto.FamiliaDTO;
import pe.pss.pointer.pointerbackend.model.dto.InstitucionDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class DatosJdbcRepsitory {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<InstitucionDTO> getInstituciones(){
        String sql = "select idInstitucion,glsInstitucion,idTipoInstitucion from pllinstitucion where idTipoInstitucion in (4,6)";
        return (List<InstitucionDTO>)jdbcTemplate.query(sql,new DatosJdbcRepsitory.InstitucionDTOMapper());
    }

    public List<CarreraEducativaDTO> getCarreras(String id){
        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("idInstitucion",id);
        String sql = "    select idCarreraEducativa,glsCarreraEducativ,idInstitucion from pllcarreraeducativa where idInstitucion = :idInstitucion";
        return (List<CarreraEducativaDTO>)jdbcTemplate.query(sql,parameters,new DatosJdbcRepsitory.CarreraEducativaDTOMapper());
    }



    private static final class InstitucionDTOMapper implements RowMapper<InstitucionDTO> {

        @Override
        public InstitucionDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

            InstitucionDTO institucionDTO = new InstitucionDTO();
            institucionDTO.setIdInstitucion(rs.getString("idInstitucion"));
            institucionDTO.setGlsInstitucion(rs.getString("glsInstitucion"));
            institucionDTO.setIdTipoInstitucion(rs.getString("idTipoInstitucion"));

            return institucionDTO;

        }
    }

    private static final class CarreraEducativaDTOMapper implements RowMapper<CarreraEducativaDTO> {

        @Override
        public CarreraEducativaDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

            CarreraEducativaDTO carreraEducativaDTO = new CarreraEducativaDTO();
            carreraEducativaDTO.setIdCarreraEducativa(rs.getString("idCarreraEducativa"));
            carreraEducativaDTO.setGlsCarreraEducativ(rs.getString("glsCarreraEducativ"));
            carreraEducativaDTO.setIdInstitucion(rs.getString("idInstitucion"));

            return carreraEducativaDTO;

        }
    }
}
