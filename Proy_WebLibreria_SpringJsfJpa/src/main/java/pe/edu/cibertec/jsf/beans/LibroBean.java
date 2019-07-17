package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.servicio.ServicioLibro;

@Component
@Scope("view")
public class LibroBean {

	private ServicioLibro servicioLibro;
	private List<Libro> listaLibros;
	
	public LibroBean(ServicioLibro servicioLibro) {
		System.out.println("Creando instancia de LibroBean");
		this.servicioLibro = servicioLibro;
	}

	@PostConstruct
	private void init() {	
		System.out.println("Iniciando configuración de LibroBean");
		listaLibros = servicioLibro.obtenerTodos();
		listaLibros.forEach(p -> p.getAutor().getNombre());
		listaLibros.forEach(p -> p.getClasificacion().getDescClasificacion());
//		EntityManager em = configuracionAppBean.getEntityManager();
//		try {			
//			RepositorioLibro repoLibro = new RepositorioLibroJpaImpl(em);
//			listaLibros = repoLibro.obtenerTodos();
//			listaLibros.forEach(p -> p.getAutor().getNombre());
//			listaLibros.forEach(p -> p.getClasificacion().getDescClasificacion());
//		}
//		finally {
//			em.close();
//		}		
	}
	
	public List<Libro> getListaLibros() {
		System.out.println("obtener listaLibros");
		return listaLibros;
	}
	
	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	
//	public ConfiguracionAppBean getConfiguracionAppBean() {
//		return configuracionAppBean;
//	}	
//	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
//		this.configuracionAppBean = configuracionAppBean;
//	}
}
