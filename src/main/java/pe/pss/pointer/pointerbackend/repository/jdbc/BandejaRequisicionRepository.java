package pe.pss.pointer.pointerbackend.repository.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import pe.pss.pointer.pointerbackend.model.dto.BandejaRequisicionDTO;
import pe.pss.pointer.pointerbackend.model.dto.BandejaRequisicionInDTO;
import pe.pss.pointer.pointerbackend.util.Utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class BandejaRequisicionRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    private StringBuilder buildSqlRequisicion(BandejaRequisicionInDTO params){
        StringBuilder sql = new StringBuilder();
        sql.append("select rp.idRequisicionPersonal,rp.fechaSolicitud,rp.idCargo,c.GlsCargo,rp.estRequisicion,m.GlsDato as modalidad,(select GlsUbigeo from ubigeo ub where ub.idDpto = rp.idDpto and ub.idProv = rp.idProv and ub.idDist = rp.idDist) as ubigeo ,a.GlsArea from rh_rl_tz_requisicion_personal rp " +
                "inner join cargo c on rp.idCargo = c.idCargo " +
                "inner join areas a on rp.idAreaSolicitante =  a.IdArea " +
                "left join (select da.idDato,da.GlsDato from datos da where da.idTipoDatos = 'MT') m on rp.idModalidadTrabajo = m.idDato " +
                "where 1=1;");

        if(params.getFechaSolicitudDesde()!=null && params.getFechaSolicitudHasta()!=null){
            sql.append(" and date_format(rp.fechaSolicitud,'%Y-%m-%d') >='"+ Utils.convertDateToStringFormatyyyyMMdd(params.getFechaSolicitudDesde()) + "' and date_format(rp.fechaSolicitud,'%Y-%m-%d')<='"+ Utils.convertDateToStringFormatyyyyMMdd(params.getFechaSolicitudHasta())+"'");
        }

        if(params.getCodigoRequisicion()!=null && !params.getCodigoRequisicion().equals("")){
            sql.append(" and rp.idRequisicionPersonal ='"+params.getCodigoRequisicion() +"'");
        }

        if(params.getIdCargo()!=null && !params.getIdCargo().equals("")){
            sql.append(" and rp.idCargo ='"+params.getIdCargo() +"'");
        }

        if(params.getIdCentroCostoSolicitante()!=null && !params.getIdCentroCostoSolicitante().equals("")){
            sql.append(" and rp.idCentroCostoSolicitante ='"+params.getIdCentroCostoSolicitante() +"'");
        }

        if(params.getIdAreaSolicitante()!=null && !params.getIdAreaSolicitante().equals("")){
            sql.append(" and rp.idAreaSolicitante ='"+params.getIdAreaSolicitante() +"'");
        }

        return sql;
    }

    public List<BandejaRequisicionDTO> listRequisicion(BandejaRequisicionInDTO params){

        StringBuilder sql = buildSqlRequisicion(params);
        return jdbcTemplate.query(sql.toString(),new BandejaRequisicionMapper());

    }


    private static final class BandejaRequisicionMapper implements RowMapper<BandejaRequisicionDTO> {

        @Override
        public BandejaRequisicionDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

            BandejaRequisicionDTO t = new BandejaRequisicionDTO();
            t.setIdRequisicionPersonal(rs.getString("idRequisicionPersonal"));
            t.setFechaSolicitud(rs.getDate("fechaSolicitud"));
            t.setGlsCargo(rs.getString("GlsCargo"));
            t.setEstRequisicion(rs.getString("estRequisicion"));
            t.setIdAreaSolicitante(rs.getString("GlsArea"));
            t.setIdModalidadTrabajo(rs.getString("modalidad"));
            t.setIdDist(rs.getString("ubigeo"));

            return t;

        }
    }

}
