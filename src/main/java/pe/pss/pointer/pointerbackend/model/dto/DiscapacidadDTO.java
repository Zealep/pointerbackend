package pe.pss.pointer.pointerbackend.model.dto;

public class DiscapacidadDTO {
    private String idDiscapacidadPostulante;
    private String idPostulante;
    private String tipoDiscapacidad;
    private Integer porcentajeDiscapacidad;

    public String getIdDiscapacidadPostulante() {
        return idDiscapacidadPostulante;
    }

    public void setIdDiscapacidadPostulante(String idDiscapacidadPostulante) {
        this.idDiscapacidadPostulante = idDiscapacidadPostulante;
    }

    public String getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(String idPostulante) {
        this.idPostulante = idPostulante;
    }

    public String getTipoDiscapacidad() {
        return tipoDiscapacidad;
    }

    public void setTipoDiscapacidad(String tipoDiscapacidad) {
        this.tipoDiscapacidad = tipoDiscapacidad;
    }

    public Integer getPorcentajeDiscapacidad() {
        return porcentajeDiscapacidad;
    }

    public void setPorcentajeDiscapacidad(Integer porcentajeDiscapacidad) {
        this.porcentajeDiscapacidad = porcentajeDiscapacidad;
    }
}
