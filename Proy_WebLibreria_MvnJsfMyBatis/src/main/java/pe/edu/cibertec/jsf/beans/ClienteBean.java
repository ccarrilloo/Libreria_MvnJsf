package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.repositorio.RepositorioCliente;
import pe.edu.cibertec.repositorio.impl.RepositorioClienteMyBatisImpl;

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
		
		try(SqlSession session = configuracionAppBean.crearSqlSession()) {			
			RepositorioCliente repoCliente = new RepositorioClienteMyBatisImpl(session);
			listaClientes = repoCliente.obtenerTodos();
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
