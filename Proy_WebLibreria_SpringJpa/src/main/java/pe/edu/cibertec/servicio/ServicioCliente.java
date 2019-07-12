package pe.edu.cibertec.servicio;

import java.util.List;

import pe.edu.cibertec.dominio.Cliente;

public interface ServicioCliente {

	void crear(Cliente cliente);
	List<Cliente> obtenerTodos();
	
}
