package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.dominio.Clasificacion;
import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.repositorio.RepositorioLibro;

public class RepositorioLibroMemoriaImpl implements RepositorioLibro {

	private RepositorioMemoria<Libro> datos;
	
	public RepositorioLibroMemoriaImpl() {
		datos = new RepositorioMemoria<Libro>();

		agregar(new Libro(1, 
				 		  "El regreso de Beorhtnoth, hijo de Beorhthelm",						  
						  "07/05/1970","",
						  new Clasificacion(1,"Ficción histórica"),
						  new Autor(1, "John Ronald Reuel Tolkien", "SudAfrica",""),
						  10.00));
		agregar(new Libro(2,
						  "El Hobbit",						 
						  "08/08/1960","",
						  new Clasificacion(2,"Épico"),
						  new Autor(1, "John Ronald Reuel Tolkien", "SudAfrica",""),
						  50.00));
	}

	@Override
	public void agregar(Libro libro) {
		datos.agregar(libro);
	}

	@Override
	public List<Libro> obtenerTodos() {
		return datos.obtenerTodos();
	}
	
	@Override
	public Libro obtenerPorId(Integer id) {
		return datos.obtenerPorId(id);
	}

}
