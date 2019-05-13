package pe.edu.cibertec.dominio;

import pe.edu.cibertec.dominio.TipoDocumento;

public class Cliente extends Entidad {
	
	private  String nombre;
	private  String apellidoPat;
	private  String apellidoMat;
	private  String fecNacimiento;
	private  TipoDocumento tipoDocumento;
	private  String documento;
	
	public Cliente(int id, String nombre, String apellidoPat, String apellidoMat, String fecNacimiento,
			TipoDocumento tipoDocumento, String documento) {

		this.id = id;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.fecNacimiento = fecNacimiento;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
	}
	

	public Cliente() {
		// TODO Auto-generated constructor stub
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
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	
	
	
}
