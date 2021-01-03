package pe.pss.pointer.pointerbackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "areas")
public class Area {


    private String idEmpresa;
    private String idArea;
    private String GlsArea;
    private String EstArea;
}
