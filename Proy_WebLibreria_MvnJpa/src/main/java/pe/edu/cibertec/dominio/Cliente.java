package pe.edu.cibertec.dominio;

import javax.persistence.Column;

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

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(int id, String nombre, String apellidoPat, String apellidoMat, String fecNacimiento, String tipoDocumento,
			String documento) {
		this.id = id;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.fecNacimiento = fecNacimiento;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (apellidoMat == null) {
			if (other.apellidoMat != null)
				return false;
		} else if (!apellidoMat.equals(other.apellidoMat))
			return false;
		if (apellidoPat == null) {
			if (other.apellidoPat != null)
				return false;
		} else if (!apellidoPat.equals(other.apellidoPat))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (fecNacimiento == null) {
			if (other.fecNacimiento != null)
				return false;
		} else if (!fecNacimiento.equals(other.fecNacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tipoDocumento == null) {
			if (other.tipoDocumento != null)
				return false;
		} else if (!tipoDocumento.equals(other.tipoDocumento))
			return false;
		return true;
	}

	

}
