package pe.pss.pointer.pointerbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "rh_rl_tz_familia")
public class Familia implements Serializable {

    @Id
    @Column(name = "idDatoFamilia")
    private String idDatoFamilia;

    @Column(name = "idEmpresa")
    private String idEmpresa;

    @Column(name = "idPostulante")
    private String idPostulante;

    @Column(name = "idTipoDocumentoIdentidad")
    private String idTipoDocumentoIdentidad;

    @Column(name = "numeroDocumento")
    private String numeroDocumento;

    @Column(name = "apellidoPaterno")
    private String apellidoPaterno;

    @Column(name = "apellidoMaterno")
    private String apellidoMaterno;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "idDatoGenero")
    private String idDatoGenero;

    @Column(name = "idDatoTipoParentesco")
    private String idDatoTipoParentesco;

    @Column(name = "idDatoGradoInstruccion")
    private String idDatoGradoInstruccion;

    @Column(name = "ocupacion")
    private String ocupacion;

    @Column(name = "fechaNacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "idDatoPaisNacimiento")
    private String idDatoPaisNacimiento;

    @Column(name = "idDptoNacimiento")
    private String idDptoNacimiento;

    @Column(name = "idProvNacimiento")
    private String idProvNacimiento;

    public String getIdDatoFamilia() {
        return idDatoFamilia;
    }

    public void setIdDatoFamilia(String idDatoFamilia) {
        this.idDatoFamilia = idDatoFamilia;
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

    public String getIdTipoDocumentoIdentidad() {
        return idTipoDocumentoIdentidad;
    }

    public void setIdTipoDocumentoIdentidad(String idTipoDocumentoIdentidad) {
        this.idTipoDocumentoIdentidad = idTipoDocumentoIdentidad;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getIdDatoGenero() {
        return idDatoGenero;
    }

    public void setIdDatoGenero(String idDatoGenero) {
        this.idDatoGenero = idDatoGenero;
    }

    public String getIdDatoTipoParentesco() {
        return idDatoTipoParentesco;
    }

    public void setIdDatoTipoParentesco(String idDatoTipoParentesco) {
        this.idDatoTipoParentesco = idDatoTipoParentesco;
    }

    public String getIdDatoGradoInstruccion() {
        return idDatoGradoInstruccion;
    }

    public void setIdDatoGradoInstruccion(String idDatoGradoInstruccion) {
        this.idDatoGradoInstruccion = idDatoGradoInstruccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdDatoPaisNacimiento() {
        return idDatoPaisNacimiento;
    }

    public void setIdDatoPaisNacimiento(String idDatoPaisNacimiento) {
        this.idDatoPaisNacimiento = idDatoPaisNacimiento;
    }

    public String getIdDptoNacimiento() {
        return idDptoNacimiento;
    }

    public void setIdDptoNacimiento(String idDptoNacimiento) {
        this.idDptoNacimiento = idDptoNacimiento;
    }

    public String getIdProvNacimiento() {
        return idProvNacimiento;
    }

    public void setIdProvNacimiento(String idProvNacimiento) {
        this.idProvNacimiento = idProvNacimiento;
    }
}
