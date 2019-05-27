package pe.edu.cibertec.dominio;

public class Venta extends Entidad {
	
	private String fecVenta;
	private Cliente cliente;	
	private DetalleVenta detalleVenta; 
	private double importe;
	
	public Venta() {		
		// TODO Auto-generated constructor stub
	}
		
	public Venta(int id, String fecVenta, Cliente cliente, DetalleVenta detalleVenta, double importe) {
		this.id = id;
		this.fecVenta = fecVenta;
		this.cliente = cliente;
		this.detalleVenta = detalleVenta;
		this.importe = importe;
		
	}

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

	public DetalleVenta getDetalleVenta() {
		return detalleVenta;
	}
	public void setDetalleVenta(DetalleVenta detalleVenta) {
		this.detalleVenta = detalleVenta;
	}

	public double getImporte() {
		return importe;
	}		
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
}
