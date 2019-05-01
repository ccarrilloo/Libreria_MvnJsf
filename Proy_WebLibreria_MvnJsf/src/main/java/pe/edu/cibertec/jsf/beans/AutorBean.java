package pe.edu.cibertec.jsf.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.servicio.AutorServicio;

@ManagedBean
@ViewScoped
public class AutorBean {

	private List<Autor> listaAutores;		
	public List<Autor> getListaAutores() {
		return listaAutores;
	}
	public void setListaAutores(List<Autor> listaAutores) {
		this.listaAutores = listaAutores;
	}

	public AutorBean() {		
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		AutorServicio autorServicio = new AutorServicio(); 
		listaAutores = autorServicio.obtenerAutor();
		

	}
	
}
