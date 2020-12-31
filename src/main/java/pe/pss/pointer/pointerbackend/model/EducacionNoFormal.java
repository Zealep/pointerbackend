package pe.pss.pointer.pointerbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "rh_rl_tz_estudio_no_formal")
public class EducacionNoFormal {

    @Id
    @Column(name = "idEstudioNoFormal")
    private String idEstudioNoFormal;

    @Column(name = "idEmpresa")
    private String idEmpresa;

    @Column(name = "idPostulante")
    private String idPostulante;

    @Column(name = "idDatoModalidadAcademica")
    private String idDatoModalidadAcademica;

    @Column(name = "idDatoNombreEstudio")
    private String idDatoNombreEstudio;

    @Column(name = "nombreEstudioEspecifico")
    private String nombreEstudioEspecifico;

    @Column(name = "idDatoCentroEstudio")
    private String idDatoCentroEstudio;

    @Column(name = "nombreCentroEstudio")
    private String nombreCentroEstudio;

    @Column(name = "idDatoPais")
    private String idDatoPais;

    @Column(name = "idDpto")
    private String idDpto;

    @Column(name = "idProv")
    private String idProv;

    @Column(name = "idDist")
    private String idDist;

    @Column(name = "tiempoEstudiado")
    private Double tiempoEstudiado;

    @Column(name = "idDatoUnidadTiempo")
    private String idDatoUnidadTiempo;

    @Column(name = "promedioPonderado")
    private Double promedioPonderado;

    @Column(name = "fechaInicio")
    private LocalDate fechaInicio;

    @Column(name = "fechaFin")
    private LocalDate fechaFin;

    @Column(name = "numeroFolio")
    private Integer numeroFolio;

    public String getIdEstudioNoFormal() {
        return idEstudioNoFormal;
    }

    public String getIdDatoCentroEstudio() {
        return idDatoCentroEstudio;
    }

    public void setIdDatoCentroEstudio(String idDatoCentroEstudio) {
        this.idDatoCentroEstudio = idDatoCentroEstudio;
    }

    public void setIdEstudioNoFormal(String idEstudioNoFormal) {
        this.idEstudioNoFormal = idEstudioNoFormal;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(String idPostulante) {
        this.idPostulante = idPostulante;
    }

    public String getIdDatoModalidadAcademica() {
        return idDatoModalidadAcademica;
    }

    public void setIdDatoModalidadAcademica(String idDatoModalidadAcademica) {
        this.idDatoModalidadAcademica = idDatoModalidadAcademica;
    }

    public String getIdDatoNombreEstudio() {
        return idDatoNombreEstudio;
    }

    public void setIdDatoNombreEstudio(String idDatoNombreEstudio) {
        this.idDatoNombreEstudio = idDatoNombreEstudio;
    }

    public String getNombreEstudioEspecifico() {
        return nombreEstudioEspecifico;
    }

    public void setNombreEstudioEspecifico(String nombreEstudioEspecifico) {
        this.nombreEstudioEspecifico = nombreEstudioEspecifico;
    }

    public String getNombreCentroEstudio() {
        return nombreCentroEstudio;
    }

    public void setNombreCentroEstudio(String nombreCentroEstudio) {
        this.nombreCentroEstudio = nombreCentroEstudio;
    }

    public String getIdDatoPais() {
        return idDatoPais;
    }

    public void setIdDatoPais(String idDatoPais) {
        this.idDatoPais = idDatoPais;
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

    public Double getTiempoEstudiado() {
        return tiempoEstudiado;
    }

    public void setTiempoEstudiado(Double tiempoEstudiado) {
        this.tiempoEstudiado = tiempoEstudiado;
    }

    public String getIdDatoUnidadTiempo() {
        return idDatoUnidadTiempo;
    }

    public void setIdDatoUnidadTiempo(String idDatoUnidadTiempo) {
        this.idDatoUnidadTiempo = idDatoUnidadTiempo;
    }

    public Double getPromedioPonderado() {
        return promedioPonderado;
    }

    public void setPromedioPonderado(Double promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getNumeroFolio() {
        return numeroFolio;
    }

    public void setNumeroFolio(Integer numeroFolio) {
        this.numeroFolio = numeroFolio;
    }
}
