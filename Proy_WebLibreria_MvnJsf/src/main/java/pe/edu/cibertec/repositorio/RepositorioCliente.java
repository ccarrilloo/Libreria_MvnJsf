package pe.edu.cibertec.repositorio;

import java.util.List;

import pe.edu.cibertec.dominio.Cliente;

public interface RepositorioCliente {

	void agregar(Cliente cliente);

	List<Cliente> obtenerTodos();
	
	Cliente obtenerPorId(Integer id);
	
}
