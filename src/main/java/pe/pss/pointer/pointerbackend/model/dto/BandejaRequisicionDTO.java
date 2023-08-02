package pe.pss.pointer.pointerbackend.model.dto;

import java.util.Date;

public class BandejaRequisicionDTO {

    private String idRequisicionPersonal;
    private Date fechaSolicitud;
    private String idCargo;
    private String glsCargo;
    private String estRequisicion;
    private String idAreaSolicitante;
    private String idModalidadTrabajo;
    private String idDist;

    public String getIdAreaSolicitante() {
        return idAreaSolicitante;
    }

    public void setIdAreaSolicitante(String idAreaSolicitante) {
        this.idAreaSolicitante = idAreaSolicitante;
    }

    public String getIdModalidadTrabajo() {
        return idModalidadTrabajo;
    }

    public void setIdModalidadTrabajo(String idModalidadTrabajo) {
        this.idModalidadTrabajo = idModalidadTrabajo;
    }

    public String getIdDist() {
        return idDist;
    }

    public void setIdDist(String idDist) {
        this.idDist = idDist;
    }

    public String getIdRequisicionPersonal() {
        return idRequisicionPersonal;
    }

    public void setIdRequisicionPersonal(String idRequisicionPersonal) {
        this.idRequisicionPersonal = idRequisicionPersonal;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(String idCargo) {
        this.idCargo = idCargo;
    }

    public String getGlsCargo() {
        return glsCargo;
    }

    public void setGlsCargo(String glsCargo) {
        this.glsCargo = glsCargo;
    }

    public String getEstRequisicion() {
        return estRequisicion;
    }

    public void setEstRequisicion(String estRequisicion) {
        this.estRequisicion = estRequisicion;
    }
}
