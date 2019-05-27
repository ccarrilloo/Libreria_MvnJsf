package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.dominio.DetalleVenta;
import pe.edu.cibertec.dominio.TipoDocumento;
import pe.edu.cibertec.dominio.Venta;
import pe.edu.cibertec.repositorio.RepositorioVenta;

public class RepositorioVentaMemoriaImpl implements RepositorioVenta {
	
	private RepositorioMemoria<Venta> datos;

	public RepositorioVentaMemoriaImpl() {
		datos = new RepositorioMemoria<Venta>();
		
		agregar(new Venta(1,
						  "03/02/2019",
						  new Cliente(1, "Jose", "Machuca"," Brito","05/05/1990",TipoDocumento.DNI,"47589666"),
						  new DetalleVenta(1,1,2,2,20.00),
						  40.00)
		);
		
		agregar(new Venta(2,
				  "03/03/2019",
				  new Cliente(1, "Jose", "Machuca"," Brito","05/05/1990",TipoDocumento.DNI,"47589666"),
				  new DetalleVenta(1,1,3,25,2.00),
				  50.00)
		);

	}

	@Override
	public void agregar(Venta venta) {
		datos.agregar(venta);
	}

	@Override
	public List<Venta> obtenerTodos() {
		return datos.obtenerTodos();
	}

	@Override
	public Venta obtenerPorId(Integer id) {
		return datos.obtenerPorId(id);		
	}

}
