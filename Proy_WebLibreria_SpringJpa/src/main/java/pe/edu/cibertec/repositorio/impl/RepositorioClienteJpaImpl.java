package pe.edu.cibertec.repositorio.impl;

import org.springframework.stereotype.Repository;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.repositorio.RepositorioCliente;

@Repository
public class RepositorioClienteJpaImpl extends RepositorioBaseJpaImpl<Cliente> implements RepositorioCliente{

	public RepositorioClienteJpaImpl() {
				
	}

}
