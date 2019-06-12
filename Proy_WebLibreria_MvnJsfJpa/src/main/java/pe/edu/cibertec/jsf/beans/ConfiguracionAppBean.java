package pe.edu.cibertec.jsf.beans;

//import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import pe.edu.cibertec.dominio.Cliente;
//import pe.edu.cibertec.repositorio.impl.RepositorioAutorMemoriaImpl;
//import pe.edu.cibertec.repositorio.impl.RepositorioLibroMemoriaImpl;
//import pe.edu.cibertec.repositorio.impl.RepositorioVentaMemoriaImpl;
//import pe.edu.cibertec.repositorio.impl.RepositorioClienteMemoriaImpl;
//
//import pe.edu.cibertec.servicio.AutorServicio;
//import pe.edu.cibertec.servicio.LibroServicio;
//import pe.edu.cibertec.servicio.VentaServicio;
//import pe.edu.cibertec.servicio.ClienteServicio;

@ManagedBean(eager=true)
@ApplicationScoped
public class ConfiguracionAppBean {

	private EntityManagerFactory emf;
	
	public ConfiguracionAppBean() {		
		System.out.println("Creando instancia de ConfiguracionAppBean");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inicio de configuración de ConfiguracionAppBean");
		emf = Persistence.createEntityManagerFactory("bd_libreria");	
	}
	
	@PreDestroy
	public void finish() {
		emf.close();
	}
		
	public EntityManager getEntityManager() {
		return emf.createEntityManager();		
	}
	
	
}
