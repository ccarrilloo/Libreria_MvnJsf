package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.servicio.ClienteServicio;

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
		ClienteServicio clienteServicio = configuracionAppBean.getClienteServicio();
		listaClientes = clienteServicio.obtenerClientes();
		//AutorServicio autorServicio = configuracionAppBean.getAutorServicio();
//		listaAutores = autorServicio.obtenerAutores();
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
