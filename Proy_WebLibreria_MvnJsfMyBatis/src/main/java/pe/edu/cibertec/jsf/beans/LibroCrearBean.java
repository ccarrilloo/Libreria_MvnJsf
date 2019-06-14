package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.repositorio.RepositorioAutor;
import pe.edu.cibertec.repositorio.RepositorioClasificacion;
import pe.edu.cibertec.repositorio.RepositorioLibro;
import pe.edu.cibertec.repositorio.impl.RepositorioAutorMyBatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioClasificacionMyBatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioLibroMyBatisImpl;
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
	
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public LibroCrearBean() {
		libro = new Libro();
		libro.setClasificacion(new Clasificacion());		
		libro.setAutor(new Autor());		
	}
	
	@PostConstruct
	private void init() {	
		System.out.println("Iniciando configuración de AutorBean");
		
		try(SqlSession session = configuracionAppBean.crearSqlSession()) {
			RepositorioAutor repositorioAutor = new RepositorioAutorMyBatisImpl(session);
			listaAutor = repositorioAutor.obtenerTodos();
			
			RepositorioClasificacion repoClasi = new RepositorioClasificacionMyBatisImpl(session);
			listaClasificacion = repoClasi.obtenerTodos();
			
		}
		
	}
	
	public String crearLibro() {		
		
		try (SqlSession session = configuracionAppBean.crearSqlSession()) {
			
			RepositorioLibro repoLibro = new RepositorioLibroMyBatisImpl(session);
			
			try {
				repoLibro.agregar(libro);
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
		return "/libro?faces-redirect=true";
	}
	
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
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
