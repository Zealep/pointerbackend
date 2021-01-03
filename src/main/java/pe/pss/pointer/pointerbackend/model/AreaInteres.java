package pe.pss.pointer.pointerbackend.model;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "rh_rl_tz_postulante_area_interes")
public class AreaInteres implements Serializable {

    @Id
    @Column(name = "idPostulanteAreas")
    private String idPostulanteAreas;

    @Column(name="idPostulante")
    private String idPostulante;

    @Column(name = "idAreaAspira")
    private String idAreaAspira;

    @Column(name = "idEmpresa")
    private String idEmpresa;

    public String getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(String idPostulante) {
        this.idPostulante = idPostulante;
    }

    public String getIdPostulanteAreas() {
        return idPostulanteAreas;
    }

    public void setIdPostulanteAreas(String idPostulanteAreas) {
        this.idPostulanteAreas = idPostulanteAreas;
    }

    public String getIdAreaAspira() {
        return idAreaAspira;
    }

    public void setIdAreaAspira(String idAreaAspira) {
        this.idAreaAspira = idAreaAspira;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

}
