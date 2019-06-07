package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Venta;
import pe.edu.cibertec.repositorio.RepositorioVenta;

public class RepositorioVentaJpaImpl extends RepositorioBaseJpaImpl<Venta> implements RepositorioVenta  {

	public RepositorioVentaJpaImpl(EntityManager em) {
		super(em);		
	}
	
}
