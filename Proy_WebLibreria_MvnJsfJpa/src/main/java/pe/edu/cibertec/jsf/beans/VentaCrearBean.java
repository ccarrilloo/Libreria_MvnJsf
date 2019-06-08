package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
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
@RequestScoped
public class VentaCrearBean {

	private Venta venta;
	private DetalleVenta detalleVenta;
	private Cliente cliente;	
	private List<Cliente> listaCliente;
	private Libro libro;	
	private List<Libro> listaLibro;
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public VentaCrearBean() {		
		// TODO Auto-generated constructor stub
		venta = new Venta();
		venta.setCliente(new Cliente());		
		//venta.setDetalleVenta(new DetalleVenta());		
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
			em.getTransaction().begin();
			RepositorioVenta repoVenta = new RepositorioVentaJpaImpl(em);
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

	public DetalleVenta getDetalleVenta() {
		return detalleVenta;
	}
	public void setDetalleVenta(DetalleVenta detalleVenta) {
		this.detalleVenta = detalleVenta;
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
	
}
