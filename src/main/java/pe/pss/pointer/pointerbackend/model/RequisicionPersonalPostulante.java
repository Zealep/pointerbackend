package pe.pss.pointer.pointerbackend.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "rh_rl_tz_reqper_postulante")
public class RequisicionPersonalPostulante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReqPerPostulante")
    private Long idReqPerPostulante;

    @ManyToOne
    @JoinColumn(name = "idRequisicionPersonal")
    private RequisicionPersonal requisicionPersonal;

    @Column(name = "idPostulante")
    private String idPostulante;

    @Column(name = "estado")
    private String estado;

    @CreatedBy
    @Column(name = "usCreacion",nullable = false, updatable = false)
    private String createdBy;

    @CreatedDate
    @Column(name = "feCreacion",nullable = false, updatable = false)
    private Date created;

    @LastModifiedBy
    @Column(name = "usModificacion",nullable = false)
    private String modifiedBy;

    @LastModifiedDate
    @Column(name = "feModificacion",nullable = false)
    private Date modified;

    public Long getIdReqPerPostulante() {
        return idReqPerPostulante;
    }

    public void setIdReqPerPostulante(Long idReqPerPostulante) {
        this.idReqPerPostulante = idReqPerPostulante;
    }

    public RequisicionPersonal getRequisicionPersonal() {
        return requisicionPersonal;
    }

    public void setRequisicionPersonal(RequisicionPersonal requisicionPersonal) {
        this.requisicionPersonal = requisicionPersonal;
    }

    public String getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(String idPostulante) {
        this.idPostulante = idPostulante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
