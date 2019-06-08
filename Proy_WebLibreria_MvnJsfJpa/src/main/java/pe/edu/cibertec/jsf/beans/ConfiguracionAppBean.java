package pe.edu.cibertec.jsf.beans;

//import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import pe.edu.cibertec.dominio.Cliente;
//import pe.edu.cibertec.repositorio.impl.RepositorioAutorMemoriaImpl;
//import pe.edu.cibertec.repositorio.impl.RepositorioLibroMemoriaImpl;
//import pe.edu.cibertec.repositorio.impl.RepositorioVentaMemoriaImpl;
//import pe.edu.cibertec.repositorio.impl.RepositorioClienteMemoriaImpl;
//
//import pe.edu.cibertec.servicio.AutorServicio;
//import pe.edu.cibertec.servicio.LibroServicio;
//import pe.edu.cibertec.servicio.VentaServicio;
//import pe.edu.cibertec.servicio.ClienteServicio;

@ManagedBean(eager=true)
@ApplicationScoped
public class ConfiguracionAppBean {

	private EntityManagerFactory emf;
	
//	private AutorServicio autorServicio;
//	private LibroServicio libroServicio;
//	private ClienteServicio clienteServicio;
//	private VentaServicio ventaServicio;
//	
//	public VentaServicio getVentaServicio() {
//		return ventaServicio;
//	}
//	public void setVentaServicio(VentaServicio ventaServicio) {
//		this.ventaServicio = ventaServicio;
//	}
//
//	public ClienteServicio getClienteServicio() {
//		return clienteServicio;
//	}
//	public void setClienteServicio(ClienteServicio clienteServicio) {
//		this.clienteServicio = clienteServicio;
//	}
//
//	public AutorServicio getAutorServicio() {
//		return autorServicio;
//	}	
//	public void setAutorServicio(AutorServicio autorServicio) {
//		this.autorServicio = autorServicio;
//	}
//	
//	public LibroServicio getLibroServicio() {
//		return libroServicio;
//	}
//	public void setLibroServicio(LibroServicio libroServicio) {
//		this.libroServicio = libroServicio;
//	}

	
	public ConfiguracionAppBean() {		
		System.out.println("Creando instancia de ConfiguracionAppBean");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inicio de configuraci�n de ConfiguracionAppBean");
		emf = Persistence.createEntityManagerFactory("bd_libreria");
		
//		autorServicio = new AutorServicio(new RepositorioAutorMemoriaImpl());
//		libroServicio = new LibroServicio(new RepositorioLibroMemoriaImpl());
//		clienteServicio = new ClienteServicio(new RepositorioClienteMemoriaImpl());
//		ventaServicio = new VentaServicio(new RepositorioVentaMemoriaImpl());		
	}
	
	@PreDestroy
	public void finish() {
		emf.close();
	}
		
	public EntityManager getEntityManager() {
		return emf.createEntityManager();		
	}
	
	
}