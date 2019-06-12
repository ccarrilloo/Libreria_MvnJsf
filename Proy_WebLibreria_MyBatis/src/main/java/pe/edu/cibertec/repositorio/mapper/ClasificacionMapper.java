package pe.edu.cibertec.repositorio.mapper;

import java.util.List;
import pe.edu.cibertec.dominio.Clasificacion;

public interface ClasificacionMapper {

	void insertClasificacion(Clasificacion clasificacion);
	List<Clasificacion> selectTodosClasificacion();
	
}
