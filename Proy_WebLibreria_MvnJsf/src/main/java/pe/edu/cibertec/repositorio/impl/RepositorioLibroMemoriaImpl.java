package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import pe.edu.cibertec.dominio.Clasificacion;
import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.repositorio.RepositorioLibro;

public class RepositorioLibroMemoriaImpl implements RepositorioLibro {

	private RepositorioMemoria<Libro> datos;
	
	public RepositorioLibroMemoriaImpl() {
		datos = new RepositorioMemoria<Libro>();
		agregar(new Libro(1, 1, "El regreso de Beorhtnoth, hijo de Beorhthelm",
				"John Ronald Reuel Tolkien","","","",new Clasificacion(1,"Ficción histórica"),10));
		agregar(new Libro(1, 1, "El Hobbit",
				"John Ronald Reuel Tolkien","","","",new Clasificacion(2,"Épico"),10));
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
