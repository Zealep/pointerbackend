package pe.pss.pointer.pointerbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "rh_rl_tz_idioma")
public class Idioma implements Serializable {

    @Id
    @Column(name = "idDatoIdioma")
    private String idDatoIdioma;

    @Column(name = "idEmpresa")
    private String idEmpresa;

    @Column(name = "idPostulante")
    private String idPostulante;

    @Column(name = "idDatoNivelHablaIdioma")
    private String idDatoNivelHablaIdioma;

    @Column(name = "idDatoNivelLeeIdioma")
    private String idDatoNivelLeeIdioma;

    @Column(name = "idDatoNivelEscribeIdioma")
    private String idDatoNivelEscribeIdioma;

    public String getIdDatoIdioma() {
        return idDatoIdioma;
    }

    public void setIdDatoIdioma(String idDatoIdioma) {
        this.idDatoIdioma = idDatoIdioma;
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

    public String getIdDatoNivelHablaIdioma() {
        return idDatoNivelHablaIdioma;
    }

    public void setIdDatoNivelHablaIdioma(String idDatoNivelHablaIdioma) {
        this.idDatoNivelHablaIdioma = idDatoNivelHablaIdioma;
    }

    public String getIdDatoNivelLeeIdioma() {
        return idDatoNivelLeeIdioma;
    }

    public void setIdDatoNivelLeeIdioma(String idDatoNivelLeeIdioma) {
        this.idDatoNivelLeeIdioma = idDatoNivelLeeIdioma;
    }

    public String getIdDatoNivelEscribeIdioma() {
        return idDatoNivelEscribeIdioma;
    }

    public void setIdDatoNivelEscribeIdioma(String idDatoNivelEscribeIdioma) {
        this.idDatoNivelEscribeIdioma = idDatoNivelEscribeIdioma;
    }
}
