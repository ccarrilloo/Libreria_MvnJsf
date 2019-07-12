package pe.edu.cibertec.repositorio.impl;

import org.springframework.stereotype.Repository;

import pe.edu.cibertec.dominio.Clasificacion;
import pe.edu.cibertec.repositorio.RepositorioClasificacion;

@Repository
public class RepositorioClasificacionJpaImpl 
	extends RepositorioBaseJpaImpl<Clasificacion> 
	implements RepositorioClasificacion{

	public RepositorioClasificacionJpaImpl() {
		
	}

}
