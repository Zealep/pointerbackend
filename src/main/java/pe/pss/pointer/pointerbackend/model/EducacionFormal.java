package pe.pss.pointer.pointerbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "rh_rl_tz_estudio_formal")
public class EducacionFormal {

    @Id
    @Column(name = "idEstudioFormal")
    private String idEstudioFormal;

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

    @Column(name = "idDatoSituacionEstudio")
    private String idDatoSituacionEstudio;

    @Column(name = "tiempoEstudiado")
    private Double tiempoEstudiado;

    @Column(name = "idDatoUnidadTiempo")
    private String idDatoUnidadTiempo;

    @Column(name = "promedioPonderado")
    private Double promedioPonderado;

    @Column(name = "fechaInicio")
    private LocalDate fechaInicio;

    @Column(name = "fechaFin")
    private LocalDate  fechaFin;

    @Column(name = "indGraduado")
    private String indGraduado;

    @Column(name = "fechaGrado")
    private LocalDate fechaGrado;

    @Column(name = "indTieneColegiatura")
    private String indTieneColegiatura;

    @Column(name = "numeroColegiatura")
    private String numeroColegiatura;

    @Column(name = "fechaExpedicion")
    private LocalDate fechaExpedicion;

    public String getIdEstudioFormal() {
        return idEstudioFormal;
    }

    public void setIdEstudioFormal(String idEstudioFormal) {
        this.idEstudioFormal = idEstudioFormal;
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

    public String getIdDatoCentroEstudio() {
        return idDatoCentroEstudio;
    }

    public void setIdDatoCentroEstudio(String idDatoCentroEstudio) {
        this.idDatoCentroEstudio = idDatoCentroEstudio;
    }

    public String getIdDatoSituacionEstudio() {
        return idDatoSituacionEstudio;
    }

    public void setIdDatoSituacionEstudio(String idDatoSituacionEstudio) {
        this.idDatoSituacionEstudio = idDatoSituacionEstudio;
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

    public String getIndGraduado() {
        return indGraduado;
    }

    public void setIndGraduado(String indGraduado) {
        this.indGraduado = indGraduado;
    }

    public LocalDate getFechaGrado() {
        return fechaGrado;
    }

    public void setFechaGrado(LocalDate fechaGrado) {
        this.fechaGrado = fechaGrado;
    }

    public String getIndTieneColegiatura() {
        return indTieneColegiatura;
    }

    public void setIndTieneColegiatura(String indTieneColegiatura) {
        this.indTieneColegiatura = indTieneColegiatura;
    }

    public String getNumeroColegiatura() {
        return numeroColegiatura;
    }

    public void setNumeroColegiatura(String numeroColegiatura) {
        this.numeroColegiatura = numeroColegiatura;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }
}
