package pe.edu.cibertec.repositorio;

import java.util.List;
import pe.edu.cibertec.dominio.Libro;

public interface RepositorioLibro {

	void agregar(Libro libro);

	List<Libro> obtenerTodos();
	
	Libro obtenerPorId(Integer id);
	
}
