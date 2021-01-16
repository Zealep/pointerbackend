package pe.pss.pointer.pointerbackend.model.dto;

public class InstitucionDTO {
    private String idInstitucion;
    private String glsInstitucion;
    private String idTipoInstitucion;

    public String getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(String idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public String getGlsInstitucion() {
        return glsInstitucion;
    }

    public void setGlsInstitucion(String glsInstitucion) {
        this.glsInstitucion = glsInstitucion;
    }

    public String getIdTipoInstitucion() {
        return idTipoInstitucion;
    }

    public void setIdTipoInstitucion(String idTipoInstitucion) {
        this.idTipoInstitucion = idTipoInstitucion;
    }
}
