package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import pe.edu.cibertec.dominio.Clasificacion;
import pe.edu.cibertec.repositorio.RepositorioClasificacion;

public class RepositorioClasificacionMemoriaImpl
	implements RepositorioClasificacion {

	private RepositorioMemoria<Clasificacion> datos;

	public RepositorioClasificacionMemoriaImpl() {
		datos = new RepositorioMemoria<Clasificacion>();
		agregar(new Clasificacion(1, "Ficción histórica"));
		agregar(new Clasificacion(2, "Épico"));
		agregar(new Clasificacion(3, ""));
	}

	@Override
	public void agregar(Clasificacion clasificacion) {
		datos.agregar(clasificacion);
	}

	@Override
	public List<Clasificacion> obtenerTodos() {
		return datos.obtenerTodos();
	}

	@Override
	public Clasificacion obtenerPorId(Integer id) {
		return datos.obtenerPorId(id);
	}
}
