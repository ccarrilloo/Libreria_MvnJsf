package pe.edu.cibertec.repositorio.mapper;

import java.util.List;

import pe.edu.cibertec.dominio.Venta;

public interface VentaMapper {

	void insertVenta(Venta venta);
	List<Venta> selectTodosVenta();
	void updateVenta(Venta venta);
	void deleteVenta(int id);
	Venta selectVentaPorId(int id);
	
}
