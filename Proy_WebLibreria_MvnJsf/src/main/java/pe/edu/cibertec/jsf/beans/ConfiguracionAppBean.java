package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import pe.edu.cibertec.repositorio.impl.RepositorioAutorMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioLibroMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioClienteMemoriaImpl;

import pe.edu.cibertec.servicio.AutorServicio;
import pe.edu.cibertec.servicio.LibroServicio;
import pe.edu.cibertec.servicio.ClienteServicio;

@ManagedBean(eager=true)
@ApplicationScoped
public class ConfiguracionAppBean {

	private AutorServicio autorServicio;
	private LibroServicio libroServicio;
	private ClienteServicio clienteServicio;
	
	public ClienteServicio getClienteServicio() {
		return clienteServicio;
	}

	public void setClienteServicio(ClienteServicio clienteServicio) {
		this.clienteServicio = clienteServicio;
	}

	public AutorServicio getAutorServicio() {
		return autorServicio;
	}
	
	public void setAutorServicio(AutorServicio autorServicio) {
		this.autorServicio = autorServicio;
	}
	
	public LibroServicio getLibroServicio() {
		return libroServicio;
	}

	public void setLibroServicio(LibroServicio libroServicio) {
		this.libroServicio = libroServicio;
	}

	public ConfiguracionAppBean() {		
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		autorServicio = new AutorServicio(new RepositorioAutorMemoriaImpl());
		libroServicio = new LibroServicio(new RepositorioLibroMemoriaImpl());
		clienteServicio = new ClienteServicio(new RepositorioClienteMemoriaImpl());
	}
	
}
