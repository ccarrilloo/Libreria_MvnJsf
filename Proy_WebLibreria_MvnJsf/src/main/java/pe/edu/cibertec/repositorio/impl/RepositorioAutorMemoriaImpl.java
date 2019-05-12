package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.repositorio.RepositorioAutor;

public class RepositorioAutorMemoriaImpl implements RepositorioAutor {

	private RepositorioMemoria<Autor> datos;
	
	public RepositorioAutorMemoriaImpl() {
		super();
		datos = new RepositorioMemoria<Autor>();
		agregar(new Autor(1,"John Ronald Reuel Tolkien","Sudafrica",""));
		agregar(new Autor(2,"Joane K. Rowling","Inglaterra",""));
		agregar(new Autor(3,"George Raymond Richard Martin","Estados Unidos",""));
		
	}

	@Override
	public void agregar(Autor autor) {
		// TODO Auto-generated method stub
		datos.agregar(autor);
	}

	@Override
	public List<Autor> obtenerTodos() {
		// TODO Auto-generated method stub
		return datos.obtenerTodos();
	}

}
