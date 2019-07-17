package pe.edu.cibertec.servicio.impl;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.cibertec.dominio.Venta;
import pe.edu.cibertec.repositorio.RepositorioVenta;
import pe.edu.cibertec.servicio.ServicioVenta;

public class ServicioVentaImpl implements ServicioVenta {

	private final RepositorioVenta repositorioVenta;
	
	public ServicioVentaImpl(RepositorioVenta repositorioVenta) {
		// TODO Auto-generated constructor stub
		this.repositorioVenta = repositorioVenta;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void crear(Venta venta) {
		// TODO Auto-generated method stub
		repositorioVenta.agregar(venta);
	}

	@Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.REQUIRES_NEW, readOnly = true)
	@Override
	public List<Venta> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositorioVenta.obtenerTodos();
	}

}
