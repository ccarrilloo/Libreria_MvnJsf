package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.repositorio.RepositorioLibro;

public class RepositorioLibroJpaImpl extends RepositorioBaseJpaImpl<Libro> implements RepositorioLibro{

	public RepositorioLibroJpaImpl(EntityManager em) {
		super(em);
	}
	
}
