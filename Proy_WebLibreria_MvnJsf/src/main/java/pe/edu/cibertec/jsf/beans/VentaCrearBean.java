package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.dominio.DetalleVenta;
import pe.edu.cibertec.dominio.Venta;
import pe.edu.cibertec.servicio.VentaServicio;

@ManagedBean(name="VentaCrearBean")
@RequestScoped
public class VentaCrearBean {

	private Venta venta;
	private DetalleVenta detalleVenta;
	private Cliente cliente;
	private VentaServicio ventaServicio;
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public VentaCrearBean() {		
		// TODO Auto-generated constructor stub
		venta = new Venta();
		venta.setCliente(new Cliente());
		venta.setDetalleVenta(new DetalleVenta());
	}
	
	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		ventaServicio = configuracionAppBean.getVentaServicio(); 
	}
	
	public String crearVenta() {
		ventaServicio.agregar(venta);
		return "/venta?faces-redirect=true";
	}
	
	
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public DetalleVenta getDetalleVenta() {
		return detalleVenta;
	}
	public void setDetalleVenta(DetalleVenta detalleVenta) {
		this.detalleVenta = detalleVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public VentaServicio getVentaServicio() {
		return ventaServicio;
	}
	public void setVentaServicio(VentaServicio ventaServicio) {
		this.ventaServicio = ventaServicio;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}
	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
	
}
