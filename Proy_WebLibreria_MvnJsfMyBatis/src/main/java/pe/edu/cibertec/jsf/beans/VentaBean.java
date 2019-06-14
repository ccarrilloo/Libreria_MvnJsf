package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Venta;
import pe.edu.cibertec.repositorio.RepositorioVenta;
import pe.edu.cibertec.repositorio.impl.RepositorioVentaMyBatisImpl;

@ManagedBean
@ViewScoped
public class VentaBean {

	private List<Venta> listaVentas;
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public VentaBean() {		
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub		
		System.out.println("Iniciando configuración de LibroBean");
				
		try(SqlSession session = configuracionAppBean.crearSqlSession()) {			
			RepositorioVenta repoVenta = new RepositorioVentaMyBatisImpl(session);
			listaVentas = repoVenta.obtenerTodos();
			listaVentas.forEach(p -> p.getCliente().getNombre());
			listaVentas.forEach(p -> p.getCliente().getApellidoMat());
			listaVentas.forEach(p -> p.getCliente().getApellidoPat());			
		}
				
	}

	public List<Venta> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentas(List<Venta> listaVentas) {
		this.listaVentas = listaVentas;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
	
}
