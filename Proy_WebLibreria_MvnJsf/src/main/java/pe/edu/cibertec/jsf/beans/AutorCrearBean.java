package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.servicio.AutorServicio;

@ManagedBean(name="AutorCrearBean")
//@ManagedBean
@RequestScoped
public class AutorCrearBean {
	
	public AutorCrearBean() {		
		// TODO Auto-generated constructor stub
		System.out.println("Creando instancia de AutorCrearBean");
		autor = new Autor();		
	}
	private Autor autor;
	private AutorServicio autorServicio;
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;
	
	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		System.out.println("Inicia configuración de AutorCrearBean");
		autorServicio = configuracionAppBean.getAutorServicio();
	}
	
	public String crearAutor() {
		System.out.println("Entro a crear Autor");
		autorServicio.agregar(autor);
		return "/autor?faces-redirect=true";
	}
	
	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}
	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
