package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.servicio.ServicioCliente;

@Component
@Scope("view")
public class ClienteBean {

	private ServicioCliente servicioCliente;
	private List<Cliente> listaClientes;
		
	public ClienteBean(ServicioCliente servicioCliente) {		
		// TODO Auto-generated constructor stub
		this.servicioCliente = servicioCliente;
	}
	
	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando configuración de TiendaBean");
		listaClientes =servicioCliente.obtenerTodos(); 
//		EntityManager em = configuracionAppBean.getEntityManager();
//		try {
//			
//			RepositorioCliente repoCliente = new RepositorioClienteJpaImpl(em);
//			listaClientes = repoCliente.obtenerTodos();
//		}
//		finally {
//			em.close();
//		}		
	}
	
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

//	public ConfiguracionAppBean getConfiguracionAppBean() {
//		return configuracionAppBean;
//	}
//	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
//		this.configuracionAppBean = configuracionAppBean;
//	}
	
}
