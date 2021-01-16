package pe.pss.pointer.pointerbackend.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import pe.pss.pointer.pointerbackend.model.dto.IdiomaDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class IdiomaJdbcRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<IdiomaDTO> getIdiomasByPostulante(String id){

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("idPostulante",id);

        String sql = "select i.idIdioma as idIdioma,i.nombreIdioma as nombre," +
                "(select GlsDato from datos where idTipoDatos= 'NI' and idDato = i.idDatoNivelEscribeIdioma)as nivelEscribe," +
                "(select GlsDato from datos where idTipoDatos= 'NI' and idDato = i.idDatoNivelHablaIdioma)as nivelHabla," +
                "(select GlsDato from datos where idTipoDatos= 'NI' and idDato = i.idDatoNivelLeeIdioma)as nivelLee " +
                "from rh_rl_tz_idioma i where i.idPostulante = :idPostulante";

        return (List<IdiomaDTO>)jdbcTemplate.query(sql, parameters, new IdiomaDTOMapper());

    }

    private static final class IdiomaDTOMapper implements RowMapper<IdiomaDTO> {

        @Override
        public IdiomaDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

            IdiomaDTO idiomaDTO = new IdiomaDTO();
            idiomaDTO.setIdIdioma(rs.getString("idIdioma"));
            idiomaDTO.setNombre(rs.getString("nombre"));
            idiomaDTO.setNivelEscribe(rs.getString("nivelEscribe"));
            idiomaDTO.setNivelHabla(rs.getString("nivelHabla"));
            idiomaDTO.setNivelLee(rs.getString("nivelLee"));
            return idiomaDTO;

        }
    }
}
