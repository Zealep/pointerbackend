package pe.pss.pointer.pointerbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "rh_rl_tz_experiencia_laboral")
public class ExperienciaLaboral {

    @Id
    @Column(name = "idExperienciaLboral")
    private String idExperienciaLaboral;

    @Column(name = "idEmpresa")
    private String idEmpresa;

    @Column(name = "idPostulante")
    private String idPostulante;

    @Column(name = "rucEmpresa")
    private String rucEmpresa;

    @Column(name = "rasonSocialEmpresa")
    private String rasonSocialEmpresa;

    @Column(name = "idDatoTipoEmpresa")
    private String idDatoTipoEmpresa;

    @Column(name = "idTipoActividad")
    private String idTipoActividad;

    @Column(name = "idDatoPais")
    private String idDatoPais;

    @Column(name = "idDpto")
    private String idDpto;

    @Column(name = "idProv")
    private String idProv;

    @Column(name = "idDist")
    private String idDist;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "fechaIngreso")
    private LocalDate fechaIngreso;

    @Column(name = "fechaRetiro")
    private LocalDate fechaRetiro;

    @Column(name = "indTrabajaActualmente")
    private String indTrabajaActualmente;

    @Column(name = "añoTrabajados")
    private int añoTrabajados;

    @Column(name = "mesesTrabajados")
    private int mesesTrabajados;

    @Column(name = "diasTrabajados")
    private int diasTrabajados;

    @Column(name = "idDatoTipoDedicacion")
    private String indDatoTipoDedicacion;

    @Column(name = "cargoDesempeñado")
    private String cargoDesempeñado;

    @Column(name = "area")
    private String area;

    @Column(name = "funciones")
    private String funciones;

    @Column(name = "indPersonalCargo")
    private String indPersonalCargo;

    @Column(name = "cantidadPersonalCargo")
    private int cantidadPersonalCargo;

    @Column(name = "sueldo")
    private double sueldo;

    @Column(name = "nombreJefe")
    private String nombreJefe;

    @Column(name = "cargoJefe")
    private String cargoJefe;

    @Column(name = "numeroContactoJefe")
    private String numeroContactoJefe;

    /*
    @Column(name = "numeroFolio")
    private String numeroFolio;
*/
    public String getIndTrabajaActualmente() {
        return indTrabajaActualmente;
    }

    public void setIndTrabajaActualmente(String indTrabajaActualmente) {
        this.indTrabajaActualmente = indTrabajaActualmente;
    }

    public int getAñoTrabajados() {
        return añoTrabajados;
    }

    public void setAñoTrabajados(int añoTrabajados) {
        this.añoTrabajados = añoTrabajados;
    }

    public int getMesesTrabajados() {
        return mesesTrabajados;
    }

    public void setMesesTrabajados(int mesesTrabajados) {
        this.mesesTrabajados = mesesTrabajados;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }
/*
    public String getNumeroFolio() {
        return numeroFolio;
    }

    public void setNumeroFolio(String numeroFolio) {
        this.numeroFolio = numeroFolio;
    }
*/
    public String getIdExperienciaLaboral() {
        return idExperienciaLaboral;
    }

    public void setIdExperienciaLaboral(String idExperienciaLaboral) {
        this.idExperienciaLaboral = idExperienciaLaboral;
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

    public String getRucEmpresa() {
        return rucEmpresa;
    }

    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }

    public String getRasonSocialEmpresa() {
        return rasonSocialEmpresa;
    }

    public void setRasonSocialEmpresa(String rasonSocialEmpresa) {
        this.rasonSocialEmpresa = rasonSocialEmpresa;
    }

    public String getIdDatoTipoEmpresa() {
        return idDatoTipoEmpresa;
    }

    public void setIdDatoTipoEmpresa(String idDatoTipoEmpresa) {
        this.idDatoTipoEmpresa = idDatoTipoEmpresa;
    }

    public String getIdTipoActividad() {
        return idTipoActividad;
    }

    public void setIdTipoActividad(String idTipoActividad) {
        this.idTipoActividad = idTipoActividad;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(LocalDate fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getIndDatoTipoDedicacion() {
        return indDatoTipoDedicacion;
    }

    public void setIndDatoTipoDedicacion(String indDatoTipoDedicacion) {
        this.indDatoTipoDedicacion = indDatoTipoDedicacion;
    }

    public String getCargoDesempeñado() {
        return cargoDesempeñado;
    }

    public void setCargoDesempeñado(String cargoDesempeñado) {
        this.cargoDesempeñado = cargoDesempeñado;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public String getIndPersonalCargo() {
        return indPersonalCargo;
    }

    public void setIndPersonalCargo(String indPersonalCargo) {
        this.indPersonalCargo = indPersonalCargo;
    }

    public int getCantidadPersonalCargo() {
        return cantidadPersonalCargo;
    }

    public void setCantidadPersonalCargo(int cantidadPersonalCargo) {
        this.cantidadPersonalCargo = cantidadPersonalCargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombreJefe() {
        return nombreJefe;
    }

    public void setNombreJefe(String nombreJefe) {
        this.nombreJefe = nombreJefe;
    }

    public String getCargoJefe() {
        return cargoJefe;
    }

    public void setCargoJefe(String cargoJefe) {
        this.cargoJefe = cargoJefe;
    }

    public String getNumeroContactoJefe() {
        return numeroContactoJefe;
    }

    public void setNumeroContactoJefe(String numeroContactoJefe) {
        this.numeroContactoJefe = numeroContactoJefe;
    }
}
