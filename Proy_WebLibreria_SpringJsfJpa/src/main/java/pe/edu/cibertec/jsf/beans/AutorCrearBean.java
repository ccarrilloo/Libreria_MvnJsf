package pe.edu.cibertec.jsf.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.servicio.ServicioAutor;

@Component
@Scope("request")
public class AutorCrearBean {
	
	private ServicioAutor servicioAutor;
	private Autor autor;	
	
	public AutorCrearBean(ServicioAutor servicioAutor) {
		System.out.println("Creando instancia de AutorCrearBean");
		this.servicioAutor = servicioAutor;
		autor = new Autor();		
	}
	
	public String crearAutor() {
		System.out.println("Entro a crear Autor");
		servicioAutor.crear(autor);
//		EntityManager em = configuracionAppBean.getEntityManager();
//		try {
//			em.getTransaction().begin();
//			RepositorioAutor repoAutor = new RepositorioAutorJpaImpl(em);
//			repoAutor.agregar(autor);
//			em.getTransaction().commit();			
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally{
//			em.close();
//		}
		return "/autor?faces-redirect=true";
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

//	public ConfiguracionAppBean getConfiguracionAppBean() {
//		return configuracionAppBean;
//	}	
//	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
//		this.configuracionAppBean = configuracionAppBean;
//	}
	
}
