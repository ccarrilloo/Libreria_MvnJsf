package pe.edu.cibertec.jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.repositorio.RepositorioCliente;
import pe.edu.cibertec.repositorio.impl.RepositorioClienteMyBatisImpl;


@ManagedBean(name="ClienteCrearBean")
@RequestScoped
public class ClienteCrearBean {
	
	private Cliente cliente;
		
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ClienteCrearBean() {
		System.out.println("Creando instancia de ClienteCrearBean");
		cliente = new Cliente();
	}
	
	public String crearCliente() {	
		
		try (SqlSession session = configuracionAppBean.crearSqlSession()) {
			
			RepositorioCliente repoCliente = new RepositorioClienteMyBatisImpl(session);
			
			try {
				repoCliente.agregar(cliente);
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
