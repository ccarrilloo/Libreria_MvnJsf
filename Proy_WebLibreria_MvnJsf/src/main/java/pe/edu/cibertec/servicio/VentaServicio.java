package pe.edu.cibertec.servicio;

import java.util.List;

import pe.edu.cibertec.dominio.Venta;
import pe.edu.cibertec.repositorio.RepositorioVenta;

public class VentaServicio {

	private final RepositorioVenta repositorioVenta;

	public VentaServicio(RepositorioVenta repositorioVenta) {		
		this.repositorioVenta = repositorioVenta;
	}

	public List<Venta> obtenerVentas() {
		return repositorioVenta.obtenerTodos();
	}
	
	public void agregar(Venta venta) {
		repositorioVenta.agregar(venta);		
	}
	
	
}
