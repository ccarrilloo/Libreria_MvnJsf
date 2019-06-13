package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Venta;
import pe.edu.cibertec.repositorio.RepositorioVenta;
import pe.edu.cibertec.repositorio.mapper.VentaMapper;

public class RepositorioVentaMyBatisImpl implements RepositorioVenta {

	private final VentaMapper ventaMapper;
	
	public RepositorioVentaMyBatisImpl(SqlSession sqlSession) {
		ventaMapper = sqlSession.getMapper(VentaMapper.class);
	}

	@Override
	public void agregar(Venta entidad) {
		// TODO Auto-generated method stub
		ventaMapper.insertVenta(entidad);
	}

	@Override
	public List<Venta> obtenerTodos() {
		// TODO Auto-generated method stub
		return ventaMapper.selectTodosVenta();
	}

	@Override
	public Venta obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return ventaMapper.selectVentaPorId(id);
	}

	@Override
	public void actualizar(Venta entidad) {
		// TODO Auto-generated method stub
		ventaMapper.updateVenta(entidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		ventaMapper.deleteVenta(id);
	}

}
