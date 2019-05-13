package pe.edu.cibertec.servicio;

import java.util.List;
import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.repositorio.RepositorioAutor;

public class AutorServicio {

	private final RepositorioAutor repositorioAutor;
	
	public AutorServicio(RepositorioAutor repositorioAutor) {		
		this.repositorioAutor = repositorioAutor;
	}
	
	public List<Autor> obtenerAutores() {
		return repositorioAutor.obtenerTodos();
	}

	public void agregar(Autor autor) {
		repositorioAutor.agregar(autor);
	}
	
	
	
}
