package pe.edu.cibertec.repositorio.impl;

import org.springframework.stereotype.Repository;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.repositorio.RepositorioAutor;

@Repository
public class RepositorioAutorJpaImpl extends RepositorioBaseJpaImpl<Autor> implements RepositorioAutor{

	public RepositorioAutorJpaImpl() {
		
	}
	
}
