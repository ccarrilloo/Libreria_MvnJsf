package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.repositorio.RepositorioAutor;

public class RepositorioAutorJpaImpl extends RepositorioBaseJpaImpl<Autor> implements RepositorioAutor{

	public RepositorioAutorJpaImpl(EntityManager em) {
		super(em);
	}

	
	
}
