package pe.edu.cibertec.repositorio.mapper;

import java.util.List;

import pe.edu.cibertec.dominio.Clasificacion;

public interface ClasificacionMapper {

	void insertClasificacion(Clasificacion clasificacion);
	List<Clasificacion> selectTodosClasificacion();
	void updateClasificaion(Clasificacion clasificacion);	
	void deleteClasificacion(int id);
	Clasificacion selectClasificacionPorId(int id);
}
