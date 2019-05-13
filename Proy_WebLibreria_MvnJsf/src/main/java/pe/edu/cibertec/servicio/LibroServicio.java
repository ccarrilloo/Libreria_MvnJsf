package pe.edu.cibertec.servicio;

import java.util.List;
import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.repositorio.RepositorioLibro;

public class LibroServicio {

	private final RepositorioLibro repositorioLibro;
	
	public LibroServicio(RepositorioLibro repositorioLibro) {		
		this.repositorioLibro = repositorioLibro;
	}
	
	public List<Libro> obtenerLibros() {
		return repositorioLibro.obtenerTodos();
	}

	public void agregar(Libro libro) {
		repositorioLibro.agregar(libro);
	}
	
	
	
}
