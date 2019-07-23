package pe.edu.cibertec.servicio.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.cibertec.dominio.Clasificacion;
import pe.edu.cibertec.repositorio.RepositorioClasificacion;
import pe.edu.cibertec.servicio.ServicioClasificacion;

@Service
public class ServicioClasificacionImpl implements ServicioClasificacion {

	private final RepositorioClasificacion repositorioClasificacion; 
	
	public ServicioClasificacionImpl(RepositorioClasificacion repositorioClasificacion) {
		// TODO Auto-generated constructor stub
		this.repositorioClasificacion = repositorioClasificacion;
	}

	@Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.REQUIRES_NEW, readOnly = true)
	@Override
	public List<Clasificacion> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositorioClasificacion.obtenerTodos();
	}

}
