package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import pe.edu.cibertec.repositorio.impl.RepositorioAutorMemoriaImpl;
import pe.edu.cibertec.servicio.AutorServicio;

@ManagedBean(eager=true)
@ApplicationScoped
public class ConfiguracionAppBean {

	private AutorServicio autorServicio;
	
	public AutorServicio getAutorServicio() {
		return autorServicio;
	}
	
	public void setAutorServicio(AutorServicio autorServicio) {
		this.autorServicio = autorServicio;
	}
	
	public ConfiguracionAppBean() {		
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		// TODO Auto-generated method stub
		autorServicio = new AutorServicio(new RepositorioAutorMemoriaImpl());
	}
	
}
