package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.repositorio.RepositorioAutor;
import pe.edu.cibertec.repositorio.impl.RepositorioAutorJpaImpl;

@ManagedBean(name="AutorCrearBean")
@RequestScoped
public class AutorCrearBean {
	
	private Autor autor;	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public AutorCrearBean() {		
		System.out.println("Creando instancia de AutorCrearBean");
		autor = new Autor();		
	}
	
//	@PostConstruct
//	private void init() {
//		System.out.println("Inicia configuración de AutorCrearBean");
//		autorServicio = configuracionAppBean.getAutorServicio();
//	}
	
	public String crearAutor() {
		System.out.println("Entro a crear Autor");
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			em.getTransaction().begin();
			RepositorioAutor repoAutor = new RepositorioAutorJpaImpl(em);
			repoAutor.agregar(autor);
			em.getTransaction().commit();			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			em.close();
		}
		return "/autor?faces-redirect=true";
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
