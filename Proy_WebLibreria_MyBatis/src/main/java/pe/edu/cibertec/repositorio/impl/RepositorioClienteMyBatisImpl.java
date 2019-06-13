package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.repositorio.RepositorioCliente;
import pe.edu.cibertec.repositorio.mapper.ClienteMapper;

public class RepositorioClienteMyBatisImpl implements RepositorioCliente {

	private final ClienteMapper clienteMapper;
		
	public RepositorioClienteMyBatisImpl(SqlSession sqlSession) {
		clienteMapper = sqlSession.getMapper(ClienteMapper.class);
	}

	@Override
	public void agregar(Cliente entidad) {
		clienteMapper.insertCliente(entidad);
	}

	@Override
	public List<Cliente> obtenerTodos() {
		// TODO Auto-generated method stub
		return clienteMapper.selectTodosCliente();
	}

	@Override
	public Cliente obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return clienteMapper.selectClientePorId(id);
	}

	@Override
	public void actualizar(Cliente entidad) {
		// TODO Auto-generated method stub
		clienteMapper.updateCliente(entidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		clienteMapper.deleteCliente(id);
	}

}
