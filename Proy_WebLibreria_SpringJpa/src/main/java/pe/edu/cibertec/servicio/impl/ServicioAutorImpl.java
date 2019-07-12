package pe.edu.cibertec.servicio.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.repositorio.RepositorioAutor;
import pe.edu.cibertec.servicio.ServicioAutor;

@Service
public class ServicioAutorImpl implements ServicioAutor {

	private final RepositorioAutor repositorioAutor;
	
	public ServicioAutorImpl(RepositorioAutor repositorioAutor) {
		// TODO Auto-generated constructor stub
		this.repositorioAutor = repositorioAutor; 
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void crear(Autor autor) {
		// TODO Auto-generated method stub
		repositorioAutor.agregar(autor);
	}

	@Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.REQUIRES_NEW, readOnly = true)
	@Override	
	public List<Autor> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositorioAutor.obtenerTodos();
	}

}
