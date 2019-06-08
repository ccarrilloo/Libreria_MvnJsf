package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.repositorio.RepositorioAutor;
import pe.edu.cibertec.repositorio.RepositorioClasificacion;
import pe.edu.cibertec.repositorio.RepositorioLibro;
import pe.edu.cibertec.repositorio.impl.RepositorioAutorJpaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioClasificacionJpaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioLibroJpaImpl;
import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.dominio.Clasificacion;


@ManagedBean(name="LibroCrearBean")
@RequestScoped
public class LibroCrearBean {
	
	private Libro libro;	
	private Clasificacion clasificacion;
	private Autor autor;
	private List<Clasificacion> listaClasificacion;
	private List<Autor> listaAutor;
	
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

	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public LibroCrearBean() {
		libro = new Libro();
		libro.setClasificacion(new Clasificacion());		
		libro.setAutor(new Autor());		
	}
	
	@PostConstruct
	private void init() {		
		
		System.out.println("Iniciando configuración de LibroBean");
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			
			RepositorioClasificacion repoClasi = new RepositorioClasificacionJpaImpl(em);
			listaClasificacion = repoClasi.obtenerTodos();
			
			RepositorioAutor repoAutor = new RepositorioAutorJpaImpl(em);
			listaAutor = repoAutor.obtenerTodos();
		}
		finally {
			em.close();
		}
		
		
	}
	
	public String crearLibro() {		
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			em.getTransaction().begin();
			RepositorioLibro repoLibro = new RepositorioLibroJpaImpl(em);
			repoLibro.agregar(libro);
			em.getTransaction().commit();			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			em.close();
		}
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
	
	
	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}
	
	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
}
