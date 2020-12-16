package pe.pss.pointer.pointerbackend.model.dto;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.SqlResultSetMapping;


public class Combo {

    private String cod;
    private String des;

    public Combo(String cod, String des) {
        this.cod = cod;
        this.des = des;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
