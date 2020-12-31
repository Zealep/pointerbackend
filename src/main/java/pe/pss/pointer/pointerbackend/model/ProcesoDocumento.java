package pe.pss.pointer.pointerbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mg_tz_proceso_documento")
public class ProcesoDocumento {

    @Id
    @Column(name = "idProcesoDocumento")
    private String idProcesoDocumento;

    @Column(name = "idProcesoDocumento")
    private String idDocumento;

    @Column(name = "idProcesoDocumento")
    private String idProceso;

    @Column(name = "estado")
    private String estado;



}
