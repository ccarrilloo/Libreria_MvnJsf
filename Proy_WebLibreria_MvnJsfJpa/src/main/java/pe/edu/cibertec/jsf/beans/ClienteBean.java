package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.repositorio.RepositorioCliente;
import pe.edu.cibertec.repositorio.impl.RepositorioClienteJpaImpl;


@ManagedBean
@ViewScoped
public class ClienteBean {

	private List<Cliente> listaClientes;
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ClienteBean() {		
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando configuración de TiendaBean");
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			
			RepositorioCliente repoCliente = new RepositorioClienteJpaImpl(em);
			listaClientes = repoCliente.obtenerTodos();
		}
		finally {
			em.close();
		}		
	}
	
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}
	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
}
