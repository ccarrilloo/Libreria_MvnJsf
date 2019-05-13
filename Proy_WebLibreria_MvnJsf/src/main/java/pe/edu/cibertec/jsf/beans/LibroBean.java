package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.servicio.LibroServicio;

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
		LibroServicio libroServicio = configuracionAppBean.getLibroServicio();
		listaLibros = libroServicio.obtenerLibros();		
	}
		
	public List<Libro> getListaLibros() {
		System.out.println("obtener listaLibros");
		return listaLibros;
	}
	
	public void setListaAutores(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}
	
	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
}
