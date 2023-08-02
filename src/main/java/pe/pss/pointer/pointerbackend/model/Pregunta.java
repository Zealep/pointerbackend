package pe.pss.pointer.pointerbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "rh_rl_tm_pregunta")
public class Pregunta {

    @Id
    @Column(name = "idPregunta")
    private String idPregunta;

    @Lob
    @Column(name = "enunciado")
    private String  enunciado;

    @Column(name = "estado")
    private String estado;

    public String getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(String idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
