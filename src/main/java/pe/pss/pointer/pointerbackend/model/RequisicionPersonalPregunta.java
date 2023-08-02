package pe.pss.pointer.pointerbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "rh_rl_tz_reqper_pregunta")
public class RequisicionPersonalPregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReqPerPregunta")
    private Integer idRequisicionpersonalPregunta;

    @ManyToOne
    @JoinColumn(name = "idPregunta")
    private Pregunta pregunta;

    @ManyToOne
    @JoinColumn(name = "idRequisicionPersonal")
    private RequisicionPersonal requisicionPersonal;

    @Column(name = "estado")
    private String estado;

    public Integer getIdRequisicionpersonalPregunta() {
        return idRequisicionpersonalPregunta;
    }

    public void setIdRequisicionpersonalPregunta(Integer idRequisicionpersonalPregunta) {
        this.idRequisicionpersonalPregunta = idRequisicionpersonalPregunta;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public RequisicionPersonal getRequisicionPersonal() {
        return requisicionPersonal;
    }

    public void setRequisicionPersonal(RequisicionPersonal requisicionPersonal) {
        this.requisicionPersonal = requisicionPersonal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
