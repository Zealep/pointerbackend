package pe.pss.pointer.pointerbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "rh_rl_tm_postulante_respuesta")
public class PostulanteRespuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPostulanteRespuesta")
    private Integer idPostulanteRespuesta;

    @ManyToOne
    @JoinColumn(name="idRequisicionpersonalPregunta")
    private RequisicionPersonalPregunta requisicionPersonalPregunta;

    @Column(name = "idPostulante")
    private String idPostulante;

    @Lob
    @Column(name = "respuesta")
    private String  respuesta;

    public Integer getIdPostulanteRespuesta() {
        return idPostulanteRespuesta;
    }

    public void setIdPostulanteRespuesta(Integer idPostulanteRespuesta) {
        this.idPostulanteRespuesta = idPostulanteRespuesta;
    }

    public RequisicionPersonalPregunta getRequisicionPersonalPregunta() {
        return requisicionPersonalPregunta;
    }

    public void setRequisicionPersonalPregunta(RequisicionPersonalPregunta requisicionPersonalPregunta) {
        this.requisicionPersonalPregunta = requisicionPersonalPregunta;
    }

    public String getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(String idPostulante) {
        this.idPostulante = idPostulante;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
