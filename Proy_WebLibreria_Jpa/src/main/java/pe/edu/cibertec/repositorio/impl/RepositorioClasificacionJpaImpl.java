package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Clasificacion;
import pe.edu.cibertec.repositorio.RepositorioClasificacion;

public class RepositorioClasificacionJpaImpl 
	extends RepositorioBaseJpaImpl<Clasificacion> 
	implements RepositorioClasificacion{

	public RepositorioClasificacionJpaImpl(EntityManager em) {
		super(em);
	}

}
