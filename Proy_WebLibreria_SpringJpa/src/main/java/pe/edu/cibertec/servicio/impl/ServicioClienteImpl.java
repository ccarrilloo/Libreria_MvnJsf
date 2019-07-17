package pe.edu.cibertec.servicio.impl;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.repositorio.RepositorioCliente;
import pe.edu.cibertec.servicio.ServicioCliente;

public class ServicioClienteImpl implements ServicioCliente {

	private final RepositorioCliente repositorioCliente;
	
	public ServicioClienteImpl(RepositorioCliente repositorioCliente) {
		// TODO Auto-generated constructor stub
		this.repositorioCliente = repositorioCliente;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void crear(Cliente cliente) {
		// TODO Auto-generated method stub
		repositorioCliente.agregar(cliente);
	}

	@Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.REQUIRES_NEW, readOnly = true)
	@Override
	public List<Cliente> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositorioCliente.obtenerTodos();
	}

}
