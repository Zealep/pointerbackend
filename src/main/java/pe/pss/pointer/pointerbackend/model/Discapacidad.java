package pe.pss.pointer.pointerbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rh_rl_tz_postulante_discapacidad")
public class Discapacidad {

    @Id
    @Column (name = "idDiscapacidadPostulante")
    private String idDiscapacidadPostulante;

    @Column (name = "idPostulante")
    private String idPostulante;

    @Column (name = "idTipoDiscapacidad")
    private String idTipoDiscapacidad;

    @Column (name = "porcentajeDiscapacidad")
    private Integer porcentajeDiscapacidad;

    @Column (name = "idEmpresa")
    private String idEmpresa;

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

    public String getIdTipoDiscapacidad() {
        return idTipoDiscapacidad;
    }

    public void setIdTipoDiscapacidad(String idTipoDiscapacidad) {
        this.idTipoDiscapacidad = idTipoDiscapacidad;
    }

    public Integer getPorcentajeDiscapacidad() {
        return porcentajeDiscapacidad;
    }

    public void setPorcentajeDiscapacidad(Integer porcentajeDiscapacidad) {
        this.porcentajeDiscapacidad = porcentajeDiscapacidad;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}
