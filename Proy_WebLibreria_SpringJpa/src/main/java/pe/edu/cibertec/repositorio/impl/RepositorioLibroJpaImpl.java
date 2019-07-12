package pe.edu.cibertec.repositorio.impl;

import org.springframework.stereotype.Repository;

import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.repositorio.RepositorioLibro;

@Repository
public class RepositorioLibroJpaImpl extends RepositorioBaseJpaImpl<Libro> implements RepositorioLibro{

	public RepositorioLibroJpaImpl() {
		
	}
	
}
