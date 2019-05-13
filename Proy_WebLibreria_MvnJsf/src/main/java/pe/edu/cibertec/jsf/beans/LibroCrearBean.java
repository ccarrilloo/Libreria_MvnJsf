package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.dominio.Clasificacion;
import pe.edu.cibertec.servicio.LibroServicio;

@ManagedBean(name="LibroCrearBean")
//@ManagedBean
@RequestScoped
public class LibroCrearBean {
	
	private Libro libro;
	private Clasificacion clasificacion;
	private Autor autor;
	private LibroServicio libroServicio;
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public LibroCrearBean() {
		libro = new Libro();
		libro.setclasificacion(new Clasificacion());
		libro.setAutor(new Autor());		
	}
	
	@PostConstruct
	private void init() {		
		libroServicio = configuracionAppBean.getLibroServicio();
	}
	
	public String crearLibro() {		
		libroServicio.agregar(libro);
		return "/libro?faces-redirect=true";
	}
	
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public LibroServicio getLibroServicio() {
		return libroServicio;
	}
	public void setLibroServicio(LibroServicio libroServicio) {
		this.libroServicio = libroServicio;
	}

	public Clasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}
	
	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
}
