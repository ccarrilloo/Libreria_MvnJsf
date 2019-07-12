package pe.edu.cibertec.repositorio.impl;

import org.springframework.stereotype.Repository;

import pe.edu.cibertec.dominio.Venta;
import pe.edu.cibertec.repositorio.RepositorioVenta;

@Repository
public class RepositorioVentaJpaImpl extends RepositorioBaseJpaImpl<Venta> implements RepositorioVenta  {

	public RepositorioVentaJpaImpl() {
		
	}
	
}
