package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.dominio.Venta;
import pe.edu.cibertec.servicio.ServicioVenta;

@Component
@Scope("view")
public class VentaBean {

	private ServicioVenta servicioVenta;
	private List<Venta> listaVentas;
		
	public VentaBean(ServicioVenta servicioVenta) {		
		// TODO Auto-generated constructor stub
		this.servicioVenta = servicioVenta;
	}
	
	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub		
		System.out.println("Iniciando configuración de LibroBean");
		listaVentas = servicioVenta.obtenerTodos();
		listaVentas.forEach(p -> p.getCliente().getNombre());
		listaVentas.forEach(p -> p.getCliente().getApellidoMat());
		listaVentas.forEach(p -> p.getCliente().getApellidoPat());
		listaVentas.forEach(p -> p.getCliente().getNomCompleto());
//		EntityManager em = configuracionAppBean.getEntityManager();		
//		try {			
//			RepositorioVenta repoVenta = new RepositorioVentaJpaImpl(em);
//			listaVentas = repoVenta.obtenerTodos();
//			listaVentas.forEach(p -> p.getCliente().getNombre());
//			listaVentas.forEach(p -> p.getCliente().getApellidoMat());
//			listaVentas.forEach(p -> p.getCliente().getApellidoPat());
//			listaVentas.forEach(p -> p.getCliente().getNomCompleto());
//		}
//		finally {
//			em.close();
//		}
		
	}

	public List<Venta> getListaVentas() {
		return listaVentas;
	}
	public void setListaVentas(List<Venta> listaVentas) {
		this.listaVentas = listaVentas;
	}

//	public ConfiguracionAppBean getConfiguracionAppBean() {
//		return configuracionAppBean;
//	}
//	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
//		this.configuracionAppBean = configuracionAppBean;
//	}
		
}
