package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.repositorio.RepositorioLibro;
import pe.edu.cibertec.repositorio.impl.RepositorioLibroMyBatisImpl;

@ManagedBean
@ViewScoped
public class LibroBean {

	private List<Libro> listaLibros;
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public LibroBean() {		
		System.out.println("Creando instancia de LibroBean");
	}

	@PostConstruct
	private void init() {	
		System.out.println("Iniciando configuración de LibroBean");
		
		try(SqlSession session = configuracionAppBean.crearSqlSession()) {	
			RepositorioLibro repoLibro = new RepositorioLibroMyBatisImpl(session);
			listaLibros = repoLibro.obtenerTodos();
			listaLibros.forEach(p -> p.getAutor().getNombre());
			listaLibros.forEach(p -> p.getClasificacion().getDescClasificacion());
		}
	
	}
	
	public List<Libro> getListaLibros() {
		System.out.println("obtener listaLibros");
		return listaLibros;
	}	
	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	
	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}	
	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
}
