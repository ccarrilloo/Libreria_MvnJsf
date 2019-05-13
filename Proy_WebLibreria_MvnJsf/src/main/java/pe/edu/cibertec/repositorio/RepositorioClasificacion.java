package pe.edu.cibertec.repositorio;

import java.util.List;

import pe.edu.cibertec.dominio.Clasificacion;

public interface RepositorioClasificacion {

	void agregar(Clasificacion clasificacion);

	List<Clasificacion> obtenerTodos();

	Clasificacion obtenerPorId(Integer id);

}
