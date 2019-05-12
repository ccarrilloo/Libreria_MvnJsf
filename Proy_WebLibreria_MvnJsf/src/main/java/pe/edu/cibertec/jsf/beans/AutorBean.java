package pe.edu.cibertec.jsf.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.servicio.AutorServicio;

@ManagedBean(name="AutorBean")
@ViewScoped
public class AutorBean{

	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;
	
	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}
	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	private List<Autor> listaAutores;
	public List<Autor> getListaAutores() {
		System.out.println("obtener listaAutores");
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
		AutorServicio autorServicio = configuracionAppBean.getAutorServicio();
		listaAutores = autorServicio.obtenerProductos();		
	}
	
}
