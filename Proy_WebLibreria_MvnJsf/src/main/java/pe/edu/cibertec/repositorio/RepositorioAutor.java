package pe.edu.cibertec.repositorio;

import java.util.List;
import pe.edu.cibertec.dominio.Autor;

public interface RepositorioAutor {

	void agregar(Autor autor);

	List<Autor> obtenerTodos();
	
	Autor obtenerPorId(Integer id);
	
}
