package pe.edu.cibertec.jsf.beans;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;


import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.dominio.DetalleVenta;
import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.dominio.Venta;
import pe.edu.cibertec.repositorio.RepositorioCliente;
import pe.edu.cibertec.repositorio.RepositorioLibro;
import pe.edu.cibertec.repositorio.RepositorioVenta;
import pe.edu.cibertec.repositorio.impl.RepositorioClienteJpaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioLibroJpaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioVentaJpaImpl;

@ManagedBean(name="VentaCrearBean")
@ViewScoped
public class VentaCrearBean {
		
	private Venta venta;
	private Cliente cliente;	
	private List<Cliente> listaCliente;
	private Libro libro;	
	private List<Libro> listaLibro;
	private double precio;
	private int cantidad;
	//private List<DetalleVenta> listaDetalleVenta;
	private	int codLibro;
	
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;
		
	public VentaCrearBean() {		

		venta = new Venta();
		venta.setCliente(new Cliente());			
		venta.setFecVenta(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		//venta.setListaDetalleVenta(listaDetalleVenta);
	}
	
	public void multiplicar() {				
		if ( getPrecio() != 0.0 && getCantidad() != 0) {
			venta.setImporte(new Double(getPrecio() * getCantidad()));
		}	
	}
	
	public void cargarPrecio() {
		EntityManager em = configuracionAppBean.getEntityManager();
		RepositorioLibro repoLibro = new RepositorioLibroJpaImpl(em);	
		libro = repoLibro.obtenerPorId(getCodLibro());
		setPrecio(libro.getPrecio());
		
	}
	
	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			
			RepositorioCliente repoCliente = new RepositorioClienteJpaImpl(em);
			listaCliente = repoCliente.obtenerTodos();
			
			RepositorioLibro repoLibro = new RepositorioLibroJpaImpl(em);
			listaLibro = repoLibro.obtenerTodos();
		}
		finally {
			em.close();
		}
	}
	
	public String crearVenta() {
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			
			RepositorioVenta repoVenta = new RepositorioVentaJpaImpl(em);	
			RepositorioLibro repoLibro = new RepositorioLibroJpaImpl(em);
			
			DetalleVenta detalleVenta = new DetalleVenta();
			detalleVenta.setLibro(repoLibro.obtenerPorId(getCodLibro()));
			detalleVenta.setCantidad(getCantidad());
			detalleVenta.setMonto(venta.getImporte());
			detalleVenta.setVenta(venta);
						
			List<DetalleVenta> listaDetalleVenta = new ArrayList<>();
			listaDetalleVenta.add(detalleVenta);
			
			venta.setListaDetalleVenta(listaDetalleVenta);
			venta.setImporte(venta.getImporte());
			
			em.getTransaction().begin();
			repoVenta.agregar(venta);
			em.getTransaction().commit();			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			em.close();
		}
		return "/venta?faces-redirect=true";
	}
		
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}
	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
	public List<Cliente> getListaCliente() {
		return listaCliente;
	}
	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public List<Libro> getListaLibro() {
		return listaLibro;
	}
	public void setListaLibro(List<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}

	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

//	public List<DetalleVenta> getListaDetalleVenta() {
//		return listaDetalleVenta;
//	}
//	public void setListaDetalleVenta(List<DetalleVenta> listaDetalleVenta) {
//		this.listaDetalleVenta = listaDetalleVenta;
//	}

	public int getCodLibro() {
		return codLibro;
	}

	public void setCodLibro(int codLibro) {
		this.codLibro = codLibro;
	}
	
	
}
