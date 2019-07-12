package pe.edu.cibertec.dominio;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Venta extends Entidad {

	@Column(name="fecha_venta")
	private String fecVenta;
	
	@ManyToOne(optional=false, fetch=FetchType.LAZY)
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy="venta", cascade=CascadeType.ALL)
	private List<DetalleVenta> listaDetalleVenta;
		
	private double importe;

	public Venta() {
		// TODO Auto-generated constructor stub
	}
		
	//public Venta(int id,String fecVenta, Cliente cliente, double importe) {
	//public Venta(int id,String fecVenta, Cliente cliente, double importe, DetalleVenta detalleVenta) {
	public Venta(int id,String fecVenta, Cliente cliente, double importe, List<DetalleVenta> listaDetalleVenta) {	
		this.id = id;
		this.fecVenta = fecVenta;
		this.cliente = cliente;
		this.listaDetalleVenta = listaDetalleVenta;
		//this.DetalleVenta = detalleVenta;
		this.importe = importe;
	}

	public List<DetalleVenta> getListaDetalleVenta() {
		return listaDetalleVenta;
	}
	public void setListaDetalleVenta(List<DetalleVenta> listaDetalleVenta) {
		this.listaDetalleVenta = listaDetalleVenta;
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

	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
//	public DetalleVenta getDetalleVenta() {
//		return DetalleVenta;
//	}
//	public void setDetalleVenta(DetalleVenta detalleVenta) {
//		DetalleVenta = detalleVenta;
//	}
	
}
