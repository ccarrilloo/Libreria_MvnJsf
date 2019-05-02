package pe.edu.cibertec.dominio;

import java.util.Date;

public class Venta {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(douImporte);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dtFecVen == null) ? 0 : dtFecVen.hashCode());
		result = prime * result + idCliente;
		result = prime * result + idVenta;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		if (Double.doubleToLongBits(douImporte) != Double.doubleToLongBits(other.douImporte))
			return false;
		if (dtFecVen == null) {
			if (other.dtFecVen != null)
				return false;
		} else if (!dtFecVen.equals(other.dtFecVen))
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (idVenta != other.idVenta)
			return false;
		return true;
	}
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public Date getDtFecVen() {
		return dtFecVen;
	}
	public void setDtFecVen(Date dtFecVen) {
		this.dtFecVen = dtFecVen;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public double getDouImporte() {
		return douImporte;
	}
	public void setDouImporte(double douImporte) {
		this.douImporte = douImporte;
	}
	private int idVenta;
	private Date dtFecVen;
	private int idCliente;
	private double douImporte;
	
	public Venta(int idVenta, Date dtFecVen, int idCliente, double douImporte) {
		super();
		this.idVenta = idVenta;
		this.dtFecVen = dtFecVen;
		this.idCliente = idCliente;
		this.douImporte = douImporte;
	}
	
}
