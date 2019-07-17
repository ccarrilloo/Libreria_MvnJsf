package pe.edu.cibertec.servicio;

import java.util.List;

import pe.edu.cibertec.dominio.Libro;

public interface ServicioLibro {

	void crear(Libro libro);
	List<Libro> obtenerTodos();
	Libro obtenerPorId(Integer id);
	
}
