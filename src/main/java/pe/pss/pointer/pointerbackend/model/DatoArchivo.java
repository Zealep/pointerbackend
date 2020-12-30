package pe.pss.pointer.pointerbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rh_tz_dato_archivo")
public class DatoArchivo {

    @Id
    @Column(name = "idDatoArchivo")
    private String idDatoArchivo;

    @Column(name = "idPostulante")
    private String idPostulante;

    @Column(name = "idEmpresa")
    private String idEmpresa;

    @Column(name = "idCodigoRelacional")
    private String idCodigoRelacional;

    @Column(name = "idProceso")
    private String idProceso;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "peso")
    private String peso;

    public String getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(String idPostulante) {
        this.idPostulante = idPostulante;
    }

    public String getIdDatoArchivo() {
        return idDatoArchivo;
    }

    public void setIdDatoArchivo(String idDatoArchivo) {
        this.idDatoArchivo = idDatoArchivo;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getIdCodigoRelacional() {
        return idCodigoRelacional;
    }

    public void setIdCodigoRelacional(String idCodigoRelacional) {
        this.idCodigoRelacional = idCodigoRelacional;
    }

    public String getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(String idProceso) {
        this.idProceso = idProceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
