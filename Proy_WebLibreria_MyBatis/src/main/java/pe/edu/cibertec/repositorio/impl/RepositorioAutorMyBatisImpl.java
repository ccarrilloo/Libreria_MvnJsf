package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.repositorio.RepositorioAutor;
import pe.edu.cibertec.repositorio.mapper.AutorMapper;

public class RepositorioAutorMyBatisImpl implements RepositorioAutor {

	private final AutorMapper autorMapper;
		
	public RepositorioAutorMyBatisImpl(SqlSession sqlSession) {
		autorMapper = sqlSession.getMapper(AutorMapper.class);
	}

	@Override
	public void agregar(Autor entidad) {
		autorMapper.insertarAutor(entidad);
	}

	@Override
	public List<Autor> obtenerTodos() {
		return autorMapper.obtenerTodas();
	}

	@Override
	public Autor obtenerPorId(Integer id) {
		return autorMapper.obtenerPorId(id);
	}

	@Override
	public void actualizar(Autor entidad) {
		autorMapper.updateAutor(entidad);
	}

	@Override
	public void eliminar(Integer id) {
		autorMapper.deleteAutor(id);
	}

}
