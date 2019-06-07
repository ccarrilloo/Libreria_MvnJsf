package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.repositorio.RepositorioCliente;
import pe.edu.cibertec.repositorio.impl.RepositorioClienteJpaImpl;

@ManagedBean(name="ClienteCrearBean")
@RequestScoped
public class ClienteCrearBean {
	
	private Cliente cliente;
		
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ClienteCrearBean() {
		cliente = new Cliente();
	}
	
//	@PostConstruct
//	private void init() {
//		System.out.println("Inicia configuración de AutorCrearBean");
//		clienteServicio = configuracionAppBean.getClienteServicio();
//	}
	
	public String crearCliente() {	
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			em.getTransaction().begin();
			RepositorioCliente repoCliente = new RepositorioClienteJpaImpl(em);
			repoCliente.agregar(cliente);
			em.getTransaction().commit();			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			em.close();
		}
		return "/cliente?faces-redirect=true";
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}	
	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
}
