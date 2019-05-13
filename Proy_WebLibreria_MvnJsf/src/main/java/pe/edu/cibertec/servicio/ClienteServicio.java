package pe.edu.cibertec.servicio;

import java.util.List;
import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.repositorio.RepositorioCliente;

public class ClienteServicio {

	private final RepositorioCliente repositorioCliente;
	
	public ClienteServicio(RepositorioCliente repositorioCliente) {		
		this.repositorioCliente = repositorioCliente;
	}
	
	public List<Cliente> obtenerClientes() {
		return repositorioCliente.obtenerTodos();
	}

	public void agregar(Cliente cliente) {
		repositorioCliente.agregar(cliente);
	}
	
	
	
}
