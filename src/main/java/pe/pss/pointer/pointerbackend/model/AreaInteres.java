package pe.pss.pointer.pointerbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "rh_rl_tz_postulante_area_interes")
public class AreaInteres {

    @Id
    @Column(name = "idPostulanteAreas")
    private String idPostulanteAreas;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="idPostulante")
    private DatosPersonal datosPersonal;

    @Column(name = "idAreaAspira")
    private String idAreaAspira;

    public String getIdPostulanteAreas() {
        return idPostulanteAreas;
    }

    public void setIdPostulanteAreas(String idPostulanteAreas) {
        this.idPostulanteAreas = idPostulanteAreas;
    }

    public DatosPersonal getDatosPersonal() {
        return datosPersonal;
    }

    public void setDatosPersonal(DatosPersonal datosPersonal) {
        this.datosPersonal = datosPersonal;
    }

    public String getIdAreaAspira() {
        return idAreaAspira;
    }

    public void setIdAreaAspira(String idAreaAspira) {
        this.idAreaAspira = idAreaAspira;
    }
}
