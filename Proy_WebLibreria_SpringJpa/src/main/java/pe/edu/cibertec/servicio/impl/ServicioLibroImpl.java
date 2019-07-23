package pe.edu.cibertec.servicio.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.repositorio.RepositorioLibro;
import pe.edu.cibertec.servicio.ServicioLibro;

@Service
public class ServicioLibroImpl implements ServicioLibro {

	private final RepositorioLibro repositorioLibro;
	
	public ServicioLibroImpl(RepositorioLibro repositorioLibro) {
		// TODO Auto-generated constructor stub
		this.repositorioLibro = repositorioLibro;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void crear(Libro libro) {
		// TODO Auto-generated method stub
		repositorioLibro.agregar(libro);
	}

	@Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.REQUIRES_NEW, readOnly = true)
	@Override
	public List<Libro> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositorioLibro.obtenerTodos();
	}

	@Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.REQUIRES_NEW, readOnly = true)
	@Override
	public Libro obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return repositorioLibro.obtenerPorId(id);
	}
	
	
}
