package pe.pss.pointer.pointerbackend.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "areas")
public class Area implements Serializable {

    @EmbeddedId
    private CompositePKArea id;

    @Column(name = "GlsArea")
    private String GlsArea;

    @Column(name = "EstArea")
    private String EstArea;

    public CompositePKArea getId() {
        return id;
    }

    public void setId(CompositePKArea id) {
        this.id = id;
    }

    public String getGlsArea() {
        return GlsArea;
    }

    public void setGlsArea(String glsArea) {
        GlsArea = glsArea;
    }

    public String getEstArea() {
        return EstArea;
    }

    public void setEstArea(String estArea) {
        EstArea = estArea;
    }
}
