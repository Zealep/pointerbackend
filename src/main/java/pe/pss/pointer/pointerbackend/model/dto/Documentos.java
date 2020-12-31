package pe.pss.pointer.pointerbackend.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documentos")
public class Documentos {

    @Id
    @Column(name = "idDocumento")
    private String idDocumento;

    @Column(name = "GlsDocumento")
    private String GlsDocumento;

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getGlsDocumento() {
        return GlsDocumento;
    }

    public void setGlsDocumento(String glsDocumento) {
        GlsDocumento = glsDocumento;
    }
}
