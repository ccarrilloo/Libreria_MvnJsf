package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.dominio.TipoDocumento;
import pe.edu.cibertec.repositorio.RepositorioCliente;

public class RepositorioClienteMemoriaImpl implements RepositorioCliente {

	private RepositorioMemoria<Cliente> datos;
	
	public RepositorioClienteMemoriaImpl() {		
		// TODO Auto-generated constructor stub
		datos = new RepositorioMemoria<Cliente>();
		agregar(new Cliente(1, "Jose", "Machuca"," Brito","05/05/1990",TipoDocumento.DNI,"47589666"));
		agregar(new Cliente(2,"Daniel","Sanchez","Rojas","06/06/1993",TipoDocumento.DNI,"41526369"));
		agregar(new Cliente(3,"Raymon","Vasquez","Sosa","20/07/1995",TipoDocumento.DNI,"45965411"));
	}

	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		datos.agregar(cliente);
	}

	@Override
	public List<Cliente> obtenerTodos() {
		// TODO Auto-generated method stub
		return datos.obtenerTodos();
	}

	@Override
	public Cliente obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return datos.obtenerPorId(id);
	}

}
