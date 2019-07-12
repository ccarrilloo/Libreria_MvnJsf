package pe.edu.cibertec.servicio;

import java.util.List;

import pe.edu.cibertec.dominio.Venta;

public interface ServicioVenta {

	void crear(Venta venta);
	List<Venta> obtenerTodos();
	
}
