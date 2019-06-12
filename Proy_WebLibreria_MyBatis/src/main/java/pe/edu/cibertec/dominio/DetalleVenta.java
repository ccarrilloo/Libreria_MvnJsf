package pe.edu.cibertec.dominio;

public class DetalleVenta extends Entidad {

	private Venta venta;	
	private Libro libro;		
	private int cantidad;	
	private double monto;

	public DetalleVenta() {
		// TODO Auto-generated constructor stub
	}
	
	public DetalleVenta(int id, Venta venta, Libro libro, int cantidad, double monto) {
		this.id = id;
		this.venta = venta;
		this.libro = libro;
		this.cantidad = cantidad;
		this.monto = monto;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleVenta other = (DetalleVenta) obj;
		if (cantidad != other.cantidad)
			return false;
		if (libro == null) {
			if (other.libro != null)
				return false;
		} else if (!libro.equals(other.libro))
			return false;
		if (Double.doubleToLongBits(monto) != Double.doubleToLongBits(other.monto))
			return false;
		if (venta == null) {
			if (other.venta != null)
				return false;
		} else if (!venta.equals(other.venta))
			return false;
		return true;
	}

	
	
}
