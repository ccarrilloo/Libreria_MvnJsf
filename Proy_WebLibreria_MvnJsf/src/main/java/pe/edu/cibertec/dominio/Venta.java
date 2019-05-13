package pe.edu.cibertec.dominio;

import java.util.Date;

public class Venta extends Entidad {

	private int idVenta;
	private Date fecVenta;
	private int idCliente;
	private double importe;

	public Venta() {		
		// TODO Auto-generated constructor stub
	}
	
	public Venta(int idVenta, Date fecVenta, int idCliente, double importe) {
		this.idVenta = idVenta;
		this.fecVenta = fecVenta;
		this.idCliente = idCliente;
		this.importe = importe;
	}


	public int getIdVenta() {
		return idVenta;
	}
	
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	
	public Date getFecVenta() {
		return fecVenta;
	}
	
	public void setFecVenta(Date fecVenta) {
		this.fecVenta = fecVenta;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public double getDouImporte() {
		return importe;
	}
	
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
}
