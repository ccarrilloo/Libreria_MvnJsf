package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import pe.edu.cibertec.repositorio.impl.RepositorioAutorMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioLibroMemoriaImpl;
import pe.edu.cibertec.servicio.AutorServicio;
import pe.edu.cibertec.servicio.LibroServicio;

@ManagedBean(eager=true)
@ApplicationScoped
public class ConfiguracionAppBean {

	private AutorServicio autorServicio;
	private LibroServicio libroServicio;
	
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
	}
	
}
