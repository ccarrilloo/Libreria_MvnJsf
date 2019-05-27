package pe.edu.cibertec.dominio;

public class DetalleVenta extends Entidad {

	public DetalleVenta() {		
		// TODO Auto-generated constructor stub
	}

	private int idVenta;	
	private int idLibro;	
	private int cantidad;
	private double monto;
	
	public DetalleVenta(int id, int idVenta,  int idLibro, int cantidad, double monto) {
		this.id = id;
		this.idVenta = idVenta;
		this.idLibro = idLibro;		
		this.cantidad = cantidad;
		this.monto = monto;
	}

	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
}
