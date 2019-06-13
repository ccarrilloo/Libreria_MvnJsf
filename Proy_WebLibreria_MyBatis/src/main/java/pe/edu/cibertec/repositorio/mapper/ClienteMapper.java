package pe.edu.cibertec.repositorio.mapper;

import java.util.List;
import pe.edu.cibertec.dominio.Cliente;

public interface ClienteMapper {

	void insertCliente(Cliente cliente);
	List<Cliente> selectTodosCliente();
	void updateCliente(Cliente cliente);
	void deleteCliente(int id);
	Cliente selectClientePorId(int id);
	
}
