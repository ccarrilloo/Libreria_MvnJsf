package pe.edu.cibertec.dominio;

import java.util.Date;

import pe.edu.cibertec.dominio.TipoDocumento;

public class Cliente extends Entidad {
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	private  int idCliente;
	private  String nombre;
	private  String apellidoPat;
	private  String apellidoMat;
	private  Date fecNacimiento;
	private  TipoDocumento tipoDocumento;
	private  String documento;
	
	public Cliente(int idCliente, String nombre, String apellidoPat, String apellidoMat, Date fecNacimiento,
			TipoDocumento tipoDocumento, String documento) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidoPat = apellidoPat;
		this.apellidoMat = apellidoMat;
		this.fecNacimiento = fecNacimiento;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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

	public Date getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(Date fecNacimiento) {
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
