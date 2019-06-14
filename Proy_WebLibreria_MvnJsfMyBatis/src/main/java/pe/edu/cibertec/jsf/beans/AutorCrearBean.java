package pe.edu.cibertec.jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.repositorio.RepositorioAutor;
import pe.edu.cibertec.repositorio.impl.RepositorioAutorMyBatisImpl;

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
	
	public String crearAutor() {
		System.out.println("Entro a crear Autor");		
		try (SqlSession session = configuracionAppBean.crearSqlSession()) {
			
			RepositorioAutor repoAutor = new RepositorioAutorMyBatisImpl(session);
			
			try {
				repoAutor.agregar(autor);
				session.commit();
			} catch (Exception e) {
				session.rollback();
				e.printStackTrace();
			}		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{			
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
