package pe.pss.pointer.pointerbackend.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table (name = "rh_rl_tz_postulante")
public class DatosPersonal {

    @Id
    @Column(name = "idPostulante")
    String idPostulante;

    @Column(name = "idUsuarioWeb")
    String idUsuarioWeb;

    @Column(name = "idEmpresa")
    String idEmpresa;

    @ManyToOne
    @JoinColumn(name = "idTipoDocumentoIdentidad")
    TipoDocumentosIdentidad tipoDocumentosIdentidad;

    @Column(name = "numeroDocumento")
    String numeroDocumento;

    @Column(name = "apellidoPaterno")
    String apellidoPaterno;

    @Column(name = "apellidoMaterno")
    String apellidoMaterno;

    @Column(name = "nombres")
    String nombres;

    @Column(name = "idDatoGenero")
    String idDatoGenero;

    @Column(name = "idDatoEstadoCivil")
    String idDatoEstadoCivil;

    @JsonSerialize(using= ToStringSerializer.class)
    @Column(name = "fechaNacimiento")
    LocalDate fechaNacimiento;

    @Column(name = "idDatoPaisNacimiento")
    String idDatoPaisNacimiento;

    @Column(name = "idDptoNacimiento")
    String idDptoNacimiento;

    @Column(name = "idProvNacimiento")
    String idProvNacimiento;

    @Column(name = "idDistNacimiento")
    String idDistNacimiento;

    @Column(name = "idDatoPaisResidencia")
    String idDatoPaisResidencia;

    @Column(name = "idDptoResidencia")
    String idDptoResidencia;

    @Column(name = "idProvResidencia")
    String idProvResidencia;

    @Column(name = "idDisResidencia")
    String idDisResidencia;

    @Column(name = "iddatoSunatTipoVia")
    String iddatoSunatTipoVia;

    @Column(name = "nombreVia")
    String nombreVia;

    @Column(name = "numeroVia")
    int numeroVia;

    @Column(name = "interior")
    String interior;

    @Column(name = "iddatoSunatTipoZona")
    String iddatoSunatTipoZona;

    @Column(name = "nombreZona")
    String nombreZona;

    @Column(name = "referencia")
    String referencia;

    @Column(name = "telefonoFijo")
    int telefonoFijo;

    @Column(name = "telefonoMovil")
    int telefonoMovil;

    @Column(name = "indAceptoDatosPersonales")
    String indAceptoDatosPersonales;

    @Column(name = "indDispViajarInterior")
    String indDispViajarInterior;

    @Column(name = "indDispViajarExterior")
    String indDispViajarExterior;

    @Column(name = "indDispInmediata")
    String indDispInmediata;

    @Column(name = "tiempoDisponibilidad")
    String tiempoDisponibilidad;

    @Column(name = "idCargo")
    String idCargo;

    @Column(name = "expectativaSalarial")
    double expectativaSalarial;

    @Column(name = "idMedioInformativo")
    String idMedioInformativo;

    @Column(name = "indTieneDiscapacidad")
    String indTieneDiscapacidad;

    @Column(name = "numeroConadis")
    int numeroConadis;

    public String getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(String idPostulante) {
        this.idPostulante = idPostulante;
    }

    public String getIdUsuarioWeb() {
        return idUsuarioWeb;
    }

    public void setIdUsuarioWeb(String idUsuarioWeb) {
        this.idUsuarioWeb = idUsuarioWeb;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public TipoDocumentosIdentidad getTipoDocumentosIdentidad() {
        return tipoDocumentosIdentidad;
    }

    public void setTipoDocumentosIdentidad(TipoDocumentosIdentidad tipoDocumentosIdentidad) {
        this.tipoDocumentosIdentidad = tipoDocumentosIdentidad;
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

    public String getIdDatoEstadoCivil() {
        return idDatoEstadoCivil;
    }

    public void setIdDatoEstadoCivil(String idDatoEstadoCivil) {
        this.idDatoEstadoCivil = idDatoEstadoCivil;
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

    public String getIdDistNacimiento() {
        return idDistNacimiento;
    }

    public void setIdDistNacimiento(String idDistNacimiento) {
        this.idDistNacimiento = idDistNacimiento;
    }

    public String getIdDatoPaisResidencia() {
        return idDatoPaisResidencia;
    }

    public void setIdDatoPaisResidencia(String idDatoPaisResidencia) {
        this.idDatoPaisResidencia = idDatoPaisResidencia;
    }

    public String getIdDptoResidencia() {
        return idDptoResidencia;
    }

    public void setIdDptoResidencia(String idDptoResidencia) {
        this.idDptoResidencia = idDptoResidencia;
    }

    public String getIdProvResidencia() {
        return idProvResidencia;
    }

    public void setIdProvResidencia(String idProvResidencia) {
        this.idProvResidencia = idProvResidencia;
    }

    public String getIdDisResidencia() {
        return idDisResidencia;
    }

    public void setIdDisResidencia(String idDisResidencia) {
        this.idDisResidencia = idDisResidencia;
    }

    public String getIddatoSunatTipoVia() {
        return iddatoSunatTipoVia;
    }

    public void setIddatoSunatTipoVia(String iddatoSunatTipoVia) {
        this.iddatoSunatTipoVia = iddatoSunatTipoVia;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public int getNumeroVia() {
        return numeroVia;
    }

    public void setNumeroVia(int numeroVia) {
        this.numeroVia = numeroVia;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getIddatoSunatTipoZona() {
        return iddatoSunatTipoZona;
    }

    public void setIddatoSunatTipoZona(String iddatoSunatTipoZona) {
        this.iddatoSunatTipoZona = iddatoSunatTipoZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(int telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public int getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(int telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getIndAceptoDatosPersonales() {
        return indAceptoDatosPersonales;
    }

    public void setIndAceptoDatosPersonales(String indAceptoDatosPersonales) {
        this.indAceptoDatosPersonales = indAceptoDatosPersonales;
    }

    public String getIndDispViajarInterior() {
        return indDispViajarInterior;
    }

    public void setIndDispViajarInterior(String indDispViajarInterior) {
        this.indDispViajarInterior = indDispViajarInterior;
    }

    public String getIndDispViajarExterior() {
        return indDispViajarExterior;
    }

    public void setIndDispViajarExterior(String indDispViajarExterior) {
        this.indDispViajarExterior = indDispViajarExterior;
    }

    public String getIndDispInmediata() {
        return indDispInmediata;
    }

    public void setIndDispInmediata(String indDispInmediata) {
        this.indDispInmediata = indDispInmediata;
    }

    public String getTiempoDisponibilidad() {
        return tiempoDisponibilidad;
    }

    public void setTiempoDisponibilidad(String tiempoDisponibilidad) {
        this.tiempoDisponibilidad = tiempoDisponibilidad;
    }

    public String getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(String idCargo) {
        this.idCargo = idCargo;
    }

    public double getExpectativaSalarial() {
        return expectativaSalarial;
    }

    public void setExpectativaSalarial(double expectativaSalarial) {
        this.expectativaSalarial = expectativaSalarial;
    }

    public String getIdMedioInformativo() {
        return idMedioInformativo;
    }

    public void setIdMedioInformativo(String idMedioInformativo) {
        this.idMedioInformativo = idMedioInformativo;
    }

    public String getIndTieneDiscapacidad() {
        return indTieneDiscapacidad;
    }

    public void setIndTieneDiscapacidad(String indTieneDiscapacidad) {
        this.indTieneDiscapacidad = indTieneDiscapacidad;
    }

    public int getNumeroConadis() {
        return numeroConadis;
    }

    public void setNumeroConadis(int numeroConadis) {
        this.numeroConadis = numeroConadis;
    }

}
