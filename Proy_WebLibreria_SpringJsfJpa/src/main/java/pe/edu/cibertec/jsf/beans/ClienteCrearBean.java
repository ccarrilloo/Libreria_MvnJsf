package pe.edu.cibertec.jsf.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.servicio.ServicioCliente;

@Component
@Scope("request")
public class ClienteCrearBean {
	
	private ServicioCliente servicioCliente;
	private Cliente cliente;		
	
	public ClienteCrearBean(ServicioCliente servicioCliente) {
		this.servicioCliente = servicioCliente;
		cliente = new Cliente();
	}
		
	public String crearCliente() {
		servicioCliente.crear(cliente);
//		EntityManager em = configuracionAppBean.getEntityManager();
//		try {
//			em.getTransaction().begin();
//			RepositorioCliente repoCliente = new RepositorioClienteJpaImpl(em);
//			repoCliente.agregar(cliente);
//			em.getTransaction().commit();			
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally{
//			em.close();
//		}
		return "/cliente?faces-redirect=true";
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

//	public ConfiguracionAppBean getConfiguracionAppBean() {
//		return configuracionAppBean;
//	}	
//	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
//		this.configuracionAppBean = configuracionAppBean;
//	}
	
}
