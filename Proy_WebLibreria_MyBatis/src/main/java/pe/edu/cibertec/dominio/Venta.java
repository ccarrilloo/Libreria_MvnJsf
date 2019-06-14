package pe.edu.cibertec.dominio;

import java.util.List;

public class Venta extends Entidad {

	private String fecVenta;
//	private List<DetalleVenta> listaDetalleVenta;	
	private double importe;
	private Cliente cliente;
	
	public Venta() {
		// TODO Auto-generated constructor stub
	}
		
	
	//public Venta(int id,String fecVenta, Cliente cliente, List<DetalleVenta> listaDetalleVenta, double importe) {
	public Venta(int id,String fecVenta, double importe, Cliente cliente) {
		this.id = id;
		this.fecVenta = fecVenta;
		this.cliente = cliente;
		//this.listaDetalleVenta = listaDetalleVenta;
		this.importe = importe;
	}

//	public List<DetalleVenta> getListaDetalleVenta() {
//		return listaDetalleVenta;
//	}
//	public void setListaDetalleVenta(List<DetalleVenta> listaDetalleVenta) {
//		this.listaDetalleVenta = listaDetalleVenta;
//	}

	public String getFecVenta() {
		return fecVenta;
	}
	public void setFecVenta(String fecVenta) {
		this.fecVenta = fecVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	

}
