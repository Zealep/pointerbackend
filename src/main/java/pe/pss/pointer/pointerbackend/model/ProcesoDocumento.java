package pe.pss.pointer.pointerbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "mg_tz_proceso_documento")
public class ProcesoDocumento {

    @Id
    @Column(name = "idProcesoDocumento")
    private String idProcesoDocumento;

    @ManyToOne
    @JoinColumn(name = "idDocumento")
    private Documentos documentos;

    @Column(name = "idProceso")
    private String idProceso;

    @Column(name = "estado")
    private String estado;

    public String getIdProcesoDocumento() {
        return idProcesoDocumento;
    }

    public void setIdProcesoDocumento(String idProcesoDocumento) {
        this.idProcesoDocumento = idProcesoDocumento;
    }

    public Documentos getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Documentos documentos) {
        this.documentos = documentos;
    }

    public String getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(String idProceso) {
        this.idProceso = idProceso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
