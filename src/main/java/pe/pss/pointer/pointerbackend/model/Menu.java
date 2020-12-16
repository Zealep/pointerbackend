package pe.pss.pointer.pointerbackend.model;

import pe.pss.pointer.pointerbackend.model.dto.Combo;

import javax.persistence.*;

@Entity
@Table(name = "rh_tm_menu_web")
@SqlResultSetMapping(
		name="getComboSelectMapping",
		classes={
				@ConstructorResult(
						targetClass= Combo.class,
						columns={
								@ColumnResult(name="cod",type = String.class),
								@ColumnResult(name="des",type = String.class)
						}
				)
		}
)
@NamedNativeQuery(name="Menu.getComboSelect", query="CALL spu_SelBusqueda(:empresa,'',:valor,'',:dato,'','')", resultSetMapping="getComboSelectMapping")
public class Menu {
	
	@Id
	@Column(name = "idMenuWeb")
	private String idMenuWeb;
	
	@Column(name = "idModulo")
	private String idModulo;
	
	@Column(name = "nombreMenuWeb")
	private String nombreMenuWeb;
	
	@Column(name = "urlOperacion")
	private String urlOperacion;
	
	@Column(name = "ordenMostrar")
	private int ordenMostrar;
	
	@Column(name = "estado")
	private String estado;
	
	public String getIdMenuWeb() {
		return idMenuWeb;
	}
	public void setIdMenuWeb(String idMenuWeb) {
		this.idMenuWeb = idMenuWeb;
	}
	public String getIdModulo() {
		return idModulo;
	}
	public void setIdModulo(String idModulo) {
		this.idModulo = idModulo;
	}
	public String getNombreMenuWeb() {
		return nombreMenuWeb;
	}
	public void setNombreMenuWeb(String nombreMenuWeb) {
		this.nombreMenuWeb = nombreMenuWeb;
	}
	public String getUrlOperacion() {
		return urlOperacion;
	}
	public void setUrlOperacion(String urlOperacion) {
		this.urlOperacion = urlOperacion;
	}
	public int getOrdenMostrar() {
		return ordenMostrar;
	}
	public void setOrdenMostrar(int ordenMostrar) {
		this.ordenMostrar = ordenMostrar;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
