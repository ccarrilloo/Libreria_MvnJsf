package pe.edu.cibertec.repositorio.mapper;

import java.util.List;

import pe.edu.cibertec.dominio.Libro;

public interface LibroMapper {

	void insertLibro(Libro libro);	
	List<Libro> selectTodosLibros();	
	void updateLibro(Libro libro);
	void deleteLibro(int id);
	Libro selectLibroPorId(int id);
	
}
