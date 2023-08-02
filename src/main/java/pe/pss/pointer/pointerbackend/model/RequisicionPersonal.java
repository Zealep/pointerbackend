package pe.pss.pointer.pointerbackend.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "rh_rl_tz_requisicion_personal")
public class RequisicionPersonal {

    @Id
    @Column(name = "idRequisicionPersonal")
    private String idRequisicionPersonal;

    @Column(name = "idEmpresa")
    private String idEmpresa;

    @ManyToOne
    @JoinColumn(name="idDatoGrupoSeleccion",referencedColumnName="idDato")
    private Datos idDatoGrupoSeleccion;

    @ManyToOne
    @JoinColumn(name="idDatoFormaCobertura",referencedColumnName="idDato")
    private Datos idDatoFormaCobertura;

    @Column(name = "fechaSolicitud")
    private Date fechaSolicitud;

    @Column(name = "fechaPosibleIngreso")
    private Date fechaPosibleIngreso;

    @ManyToOne
    @JoinColumn(name = "idCargo")
    private Cargo idCargo;

    @Column(name = "numeroVacantes")
    private Integer numeroVacantes;

    @Column(name = "sueldoPropuesto")
    private BigDecimal sueldoPropuesto;

    @Column(name = "indVisualizarSueldo")
    private String indVisualizarSueldo;

    @ManyToOne
    @JoinColumn(name="idDatoPaisTrabajo",referencedColumnName="idDato")
    private Datos idDatoPaisTrabajo;

    @Column(name = "idDpto")
    private String idDpto;

    @Column(name = "idProv")
    private String idProv;

    @Column(name = "idDist")
    private String idDist;

    @ManyToOne
    @JoinColumn(name="idCentroCostoSolicitante",referencedColumnName="idCentroCosto")
    private CentrosCosto idCentroCostoSolicitante;

    @ManyToOne
    @JoinColumn(name="idAreaSolicitante",referencedColumnName="IdArea")
    private Areas idAreaSolicitante;

    @Column(name = "idTrabajadorSolicitante")
    private String idTrabajadorSolicitante;

    @ManyToOne
    @JoinColumn(name="idDatoMotivoSolicitud",referencedColumnName="idDato")
    private Datos idDatoMotivoSolicitud;

    @ManyToOne
    @JoinColumn(name="idDatoSunatCategoria",referencedColumnName="idDato")
    private DatosSunat idDatoSunatCategoria;

    @ManyToOne
    @JoinColumn(name="idDatoSunatTipoContrato",referencedColumnName="idDato")
    private DatosSunat idDatoSunatTipoContrato;

    @Column(name = "idTrabajadorAprobador")
    private String idTrabajadorAprobador;

    @Column(name = "estAprobacion")
    private String estAprobacion;

    @Column(name = "fechaAprobacion")
    private Date fechaAprobacion;

    @Column(name = "indPublicarRequisicion")
    private String indPublicarRequisicion;

    @Column(name = "fechaDesdePublicacion")
    private Date fechaDesdePublicacion;

    @Column(name = "fechaHastaPublicacion")
    private Date fechaHastaPublicacion;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "estRequisicion")
    private String estRequisicion;

    @Column(name = "usCreacion")
    private String usCreacion;

    @Column(name = "feCreacion")
    private Date feCreacion;

    @Column(name = "ipCreacion")
    private String ipCreacion;

    @ManyToOne
    @JoinColumn(name="idModalidadTrabajo",referencedColumnName="idDato")
    private Datos idModalidadTrabajo;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "requisitos",length=100000)
    private byte[] detalleRequisitos;


    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "beneficios",length=100000)
    private byte[] detalleBeneficios;


    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "funciones",length=100000)
    private byte[] detalleFunciones;

    @Transient
    private String detalleRequisitosHtml;

    @Transient
    private String detalleBeneficiosHtml;

    @Transient
    private String detalleFuncionesHtml;

    public String getIdRequisicionPersonal() {
        return idRequisicionPersonal;
    }

    public void setIdRequisicionPersonal(String idRequisicionPersonal) {
        this.idRequisicionPersonal = idRequisicionPersonal;
    }

    public byte[] getDetalleRequisitos() {
        return detalleRequisitos;
    }

    public void setDetalleRequisitos(byte[] detalleRequisitos) {
        this.detalleRequisitos = detalleRequisitos;
    }

    public byte[] getDetalleBeneficios() {
        return detalleBeneficios;
    }

    public void setDetalleBeneficios(byte[] detalleBeneficios) {
        this.detalleBeneficios = detalleBeneficios;
    }

    public byte[] getDetalleFunciones() {
        return detalleFunciones;
    }

    public void setDetalleFunciones(byte[] detalleFunciones) {
        this.detalleFunciones = detalleFunciones;
    }

    public String getDetalleRequisitosHtml() {
        return detalleRequisitosHtml;
    }

    public void setDetalleRequisitosHtml(String detalleRequisitosHtml) {
        this.detalleRequisitosHtml = detalleRequisitosHtml;
    }

    public String getDetalleBeneficiosHtml() {
        return detalleBeneficiosHtml;
    }

    public void setDetalleBeneficiosHtml(String detalleBeneficiosHtml) {
        this.detalleBeneficiosHtml = detalleBeneficiosHtml;
    }

    public String getDetalleFuncionesHtml() {
        return detalleFuncionesHtml;
    }

    public void setDetalleFuncionesHtml(String detalleFuncionesHtml) {
        this.detalleFuncionesHtml = detalleFuncionesHtml;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Datos getIdDatoGrupoSeleccion() {
        return idDatoGrupoSeleccion;
    }

    public void setIdDatoGrupoSeleccion(Datos idDatoGrupoSeleccion) {
        this.idDatoGrupoSeleccion = idDatoGrupoSeleccion;
    }

    public Datos getIdDatoFormaCobertura() {
        return idDatoFormaCobertura;
    }

    public void setIdDatoFormaCobertura(Datos idDatoFormaCobertura) {
        this.idDatoFormaCobertura = idDatoFormaCobertura;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaPosibleIngreso() {
        return fechaPosibleIngreso;
    }

    public void setFechaPosibleIngreso(Date fechaPosibleIngreso) {
        this.fechaPosibleIngreso = fechaPosibleIngreso;
    }

    public Cargo getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Cargo idCargo) {
        this.idCargo = idCargo;
    }

    public Integer getNumeroVacantes() {
        return numeroVacantes;
    }

    public void setNumeroVacantes(Integer numeroVacantes) {
        this.numeroVacantes = numeroVacantes;
    }

    public BigDecimal getSueldoPropuesto() {
        return sueldoPropuesto;
    }

    public void setSueldoPropuesto(BigDecimal sueldoPropuesto) {
        this.sueldoPropuesto = sueldoPropuesto;
    }

    public String getIndVisualizarSueldo() {
        return indVisualizarSueldo;
    }

    public void setIndVisualizarSueldo(String indVisualizarSueldo) {
        this.indVisualizarSueldo = indVisualizarSueldo;
    }

    public Datos getIdDatoPaisTrabajo() {
        return idDatoPaisTrabajo;
    }

    public void setIdDatoPaisTrabajo(Datos idDatoPaisTrabajo) {
        this.idDatoPaisTrabajo = idDatoPaisTrabajo;
    }

    public String getIdDpto() {
        return idDpto;
    }

    public void setIdDpto(String idDpto) {
        this.idDpto = idDpto;
    }

    public String getIdProv() {
        return idProv;
    }

    public void setIdProv(String idProv) {
        this.idProv = idProv;
    }

    public String getIdDist() {
        return idDist;
    }

    public void setIdDist(String idDist) {
        this.idDist = idDist;
    }

    public CentrosCosto getIdCentroCostoSolicitante() {
        return idCentroCostoSolicitante;
    }

    public void setIdCentroCostoSolicitante(CentrosCosto idCentroCostoSolicitante) {
        this.idCentroCostoSolicitante = idCentroCostoSolicitante;
    }

    public Areas getIdAreaSolicitante() {
        return idAreaSolicitante;
    }

    public void setIdAreaSolicitante(Areas idAreaSolicitante) {
        this.idAreaSolicitante = idAreaSolicitante;
    }

    public String getIdTrabajadorSolicitante() {
        return idTrabajadorSolicitante;
    }

    public void setIdTrabajadorSolicitante(String idTrabajadorSolicitante) {
        this.idTrabajadorSolicitante = idTrabajadorSolicitante;
    }

    public Datos getIdDatoMotivoSolicitud() {
        return idDatoMotivoSolicitud;
    }

    public void setIdDatoMotivoSolicitud(Datos idDatoMotivoSolicitud) {
        this.idDatoMotivoSolicitud = idDatoMotivoSolicitud;
    }

    public DatosSunat getIdDatoSunatCategoria() {
        return idDatoSunatCategoria;
    }

    public void setIdDatoSunatCategoria(DatosSunat idDatoSunatCategoria) {
        this.idDatoSunatCategoria = idDatoSunatCategoria;
    }

    public DatosSunat getIdDatoSunatTipoContrato() {
        return idDatoSunatTipoContrato;
    }

    public void setIdDatoSunatTipoContrato(DatosSunat idDatoSunatTipoContrato) {
        this.idDatoSunatTipoContrato = idDatoSunatTipoContrato;
    }

    public String getIdTrabajadorAprobador() {
        return idTrabajadorAprobador;
    }

    public void setIdTrabajadorAprobador(String idTrabajadorAprobador) {
        this.idTrabajadorAprobador = idTrabajadorAprobador;
    }

    public String getEstAprobacion() {
        return estAprobacion;
    }

    public void setEstAprobacion(String estAprobacion) {
        this.estAprobacion = estAprobacion;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public String getIndPublicarRequisicion() {
        return indPublicarRequisicion;
    }

    public void setIndPublicarRequisicion(String indPublicarRequisicion) {
        this.indPublicarRequisicion = indPublicarRequisicion;
    }

    public Date getFechaDesdePublicacion() {
        return fechaDesdePublicacion;
    }

    public void setFechaDesdePublicacion(Date fechaDesdePublicacion) {
        this.fechaDesdePublicacion = fechaDesdePublicacion;
    }

    public Date getFechaHastaPublicacion() {
        return fechaHastaPublicacion;
    }

    public void setFechaHastaPublicacion(Date fechaHastaPublicacion) {
        this.fechaHastaPublicacion = fechaHastaPublicacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstRequisicion() {
        return estRequisicion;
    }

    public void setEstRequisicion(String estRequisicion) {
        this.estRequisicion = estRequisicion;
    }

    public String getUsCreacion() {
        return usCreacion;
    }

    public void setUsCreacion(String usCreacion) {
        this.usCreacion = usCreacion;
    }

    public Date getFeCreacion() {
        return feCreacion;
    }

    public void setFeCreacion(Date feCreacion) {
        this.feCreacion = feCreacion;
    }

    public String getIpCreacion() {
        return ipCreacion;
    }

    public void setIpCreacion(String ipCreacion) {
        this.ipCreacion = ipCreacion;
    }

    public Datos getIdModalidadTrabajo() {
        return idModalidadTrabajo;
    }

    public void setIdModalidadTrabajo(Datos idModalidadTrabajo) {
        this.idModalidadTrabajo = idModalidadTrabajo;
    }
}
