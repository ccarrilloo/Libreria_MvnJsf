package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.servicio.ServicioAutor;
import pe.edu.cibertec.servicio.ServicioClasificacion;
import pe.edu.cibertec.servicio.ServicioLibro;
import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.dominio.Clasificacion;
import pe.edu.cibertec.dominio.Libro;

@Component
@Scope("request")
public class LibroCrearBean {
	
	private Libro libro;	
	private Clasificacion clasificacion;
	private Autor autor;
	private List<Clasificacion> listaClasificacion;
	private List<Autor> listaAutor;

	private ServicioLibro servicioLibro;
	private ServicioAutor servicioAutor;
	private ServicioClasificacion servicioClasificacion; 

	public LibroCrearBean(ServicioLibro servicioLibro, ServicioAutor servicioAutor, ServicioClasificacion servicioClasificacion) {
		this.servicioLibro = servicioLibro;
		this.servicioAutor = servicioAutor;
		this.servicioClasificacion = servicioClasificacion;
		libro = new Libro();
		libro.setClasificacion(new Clasificacion());		
		libro.setAutor(new Autor());		
	}
	
	@PostConstruct
	private void init() {
		System.out.println("Iniciando configuración de LibroBean");
		listaClasificacion = servicioClasificacion.obtenerTodos();
		listaAutor = servicioAutor.obtenerTodos();
//		EntityManager em = configuracionAppBean.getEntityManager();
//		try {			
//			RepositorioClasificacion repoClasi = new RepositorioClasificacionJpaImpl(em);
//			listaClasificacion = repoClasi.obtenerTodos();
//			
//			RepositorioAutor repoAutor = new RepositorioAutorJpaImpl(em);
//			listaAutor = repoAutor.obtenerTodos();
//		}
//		finally {
//			em.close();
//		}
				
	}
	
	public String crearLibro() {
		servicioLibro.crear(libro);
//		EntityManager em = configuracionAppBean.getEntityManager();
//		try {
//			em.getTransaction().begin();
//			RepositorioLibro repoLibro = new RepositorioLibroJpaImpl(em);
//			repoLibro.agregar(libro);
//			em.getTransaction().commit();			
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally{
//			em.close();
//		}
		return "/libro?faces-redirect=true";
	}
	
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
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

	public List<Autor> getListaAutor() {
		return listaAutor;
	}
	public void setListaAutor(List<Autor> listaAutor) {
		this.listaAutor = listaAutor;
	}
	
	public List<Clasificacion> getListaClasificacion() {
		return listaClasificacion;
	}
	public void setListaClasificacion(List<Clasificacion> listaClasificacion) {
		this.listaClasificacion = listaClasificacion;
	}
	
//	public ConfiguracionAppBean getConfiguracionAppBean() {
//		return configuracionAppBean;
//	}	
//	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
//		this.configuracionAppBean = configuracionAppBean;
//	}
	
}
