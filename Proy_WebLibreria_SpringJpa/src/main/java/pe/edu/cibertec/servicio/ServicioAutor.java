package pe.edu.cibertec.servicio;

import java.util.List;

import pe.edu.cibertec.dominio.Autor;

public interface ServicioAutor {

	void crear(Autor autor);
	List<Autor> obtenerTodos();
	
}
