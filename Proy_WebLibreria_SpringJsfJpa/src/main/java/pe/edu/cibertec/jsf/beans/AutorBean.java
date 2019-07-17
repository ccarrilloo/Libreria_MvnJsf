package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.servicio.ServicioAutor;

@Component
@Scope("view")
public class AutorBean{
	
	private ServicioAutor servicioAutor;
	private List<Autor> listaAutores;
	
	public AutorBean(ServicioAutor servicioAutor) {
		System.out.println("Creando instancia de AutorBean");
		this.servicioAutor = servicioAutor;
	}

	@PostConstruct
	private void init() {	
		System.out.println("Iniciando configuración de AutorBean");
		listaAutores = servicioAutor.obtenerTodos();		
	}
		
	public List<Autor> getListaAutores() {
		System.out.println("obtener listaAutores");
		return listaAutores;
	}	
	public void setListaAutores(List<Autor> listaAutores) {
		this.listaAutores = listaAutores;
	}

//	public ConfiguracionAppBean getConfiguracionAppBean() {
//		return configuracionAppBean;
//	}	
//	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
//		this.configuracionAppBean = configuracionAppBean;
//	}
	
}
