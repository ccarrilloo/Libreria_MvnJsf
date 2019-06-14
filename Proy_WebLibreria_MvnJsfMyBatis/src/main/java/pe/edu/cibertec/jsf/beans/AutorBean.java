package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.repositorio.RepositorioAutor;
import pe.edu.cibertec.repositorio.impl.RepositorioAutorMyBatisImpl;

@ManagedBean(name="AutorBean")
@ViewScoped
public class AutorBean{
	
	private List<Autor> listaAutores;

	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public AutorBean() {		
		System.out.println("Creando instancia de AutorBean");
	}

	@PostConstruct
	private void init() {	
		System.out.println("Iniciando configuración de AutorBean");
		
		try(SqlSession session = configuracionAppBean.crearSqlSession()) {
			RepositorioAutor repositorioAutor = new RepositorioAutorMyBatisImpl(session);
			listaAutores = repositorioAutor.obtenerTodos();
		}
		
	}
		
	public List<Autor> getListaAutores() {
		System.out.println("obtener listaAutores");
		return listaAutores;
	}	
	public void setListaAutores(List<Autor> listaAutores) {
		this.listaAutores = listaAutores;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}	
	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
}
