package pe.edu.cibertec.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Cliente extends Entidad {

	private String nombre;
	
	@Column(name="apellido_pat")
	private String apellidoPat;
	
	@Column(name="apellido_mat")
	private String apellidoMat;
	
	@Column(name="fec_nacimiento")
	private String fecNacimiento;
	
	@Column(name="tipo_documento")
	private String tipoDocumento;
	
	@Column(name="num_documento")
	private String documento;

	@Transient
	private String nomCompleto;
	
	public String getNomCompleto() {
		return getNombre() + " " + getApellidoPat() + " " + getApellidoMat();
	}

	public void setNomCompleto(String nomCompleto) {
		this.nomCompleto = nomCompleto;		
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(int id, String nombre, String apellidoPat, String apellidoMat, String fecNacimiento, String tipoDocumento,
			String documento, String nomCompleto) {
		this.id = id;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.fecNacimiento = fecNacimiento;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.nomCompleto = nomCompleto;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPat() {
		return apellidoPat;
	}
	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}

	public String getApellidoMat() {
		return apellidoMat;
	}
	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}

	public String getFecNacimiento() {
		return fecNacimiento;
	}
	public void setFecNacimiento(String fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}

		

}
