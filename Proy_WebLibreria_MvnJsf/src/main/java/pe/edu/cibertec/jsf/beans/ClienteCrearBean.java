package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.servicio.ClienteServicio;

@ManagedBean(name="ClienteCrearBean")
//@ManagedBean
@RequestScoped
public class ClienteCrearBean {
	
	private Cliente cliente;
	private ClienteServicio clienteServicio;
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ClienteCrearBean() {
		cliente = new Cliente();
	}
	
	@PostConstruct
	private void init() {
		System.out.println("Inicia configuración de AutorCrearBean");
		clienteServicio = configuracionAppBean.getClienteServicio();
	}
	
	public String crearCliente() {	
		clienteServicio.agregar(cliente);
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
