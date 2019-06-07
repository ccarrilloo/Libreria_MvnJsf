package pe.edu.cibertec.repositorio.impl;

import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.repositorio.RepositorioCliente;

public class RepositorioClienteJpaImpl extends RepositorioBaseJpaImpl<Cliente> implements RepositorioCliente{

	public RepositorioClienteJpaImpl(EntityManager em) {
		super(em);		
	}

}
