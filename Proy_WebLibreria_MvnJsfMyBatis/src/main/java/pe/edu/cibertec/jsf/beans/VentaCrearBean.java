package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.dominio.Venta;
import pe.edu.cibertec.repositorio.RepositorioAutor;
import pe.edu.cibertec.repositorio.RepositorioClasificacion;
import pe.edu.cibertec.repositorio.RepositorioCliente;
import pe.edu.cibertec.repositorio.RepositorioVenta;
import pe.edu.cibertec.repositorio.impl.RepositorioAutorMyBatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioClasificacionMyBatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioClienteMyBatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioVentaMyBatisImpl;

@ManagedBean(name="VentaCrearBean")
@RequestScoped
public class VentaCrearBean {

	private Venta venta;
	//private DetalleVenta detalleVenta;
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
		System.out.println("Iniciando configuración de AutorBean");
		
		try(SqlSession session = configuracionAppBean.crearSqlSession()) {
			RepositorioCliente repoCliente = new RepositorioClienteMyBatisImpl(session);
			listaCliente = repoCliente.obtenerTodos();
			
		}
		
	}
	
	public String crearVenta() {
		try (SqlSession session = configuracionAppBean.crearSqlSession()) {
			
			RepositorioVenta repoVenta = new RepositorioVentaMyBatisImpl(session);
			try {
				repoVenta.agregar(venta);
				session.commit();
			} catch (Exception e) {
				session.rollback();
				e.printStackTrace();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{			
		}
		return "/venta?faces-redirect=true";
	}
		
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}

//	public DetalleVenta getDetalleVenta() {
//		return detalleVenta;
//	}
//	public void setDetalleVenta(DetalleVenta detalleVenta) {
//		this.detalleVenta = detalleVenta;
//	}

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
