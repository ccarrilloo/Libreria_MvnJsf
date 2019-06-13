package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.repositorio.RepositorioLibro;
import pe.edu.cibertec.repositorio.mapper.LibroMapper;

public class RepositorioLibroMyBatisImpl implements RepositorioLibro {

	private final LibroMapper libroMapper;
	
	public RepositorioLibroMyBatisImpl(SqlSession sqlSession) {
		// TODO Auto-generated constructor stub
		libroMapper = sqlSession.getMapper(LibroMapper.class);
	}

	@Override
	public void agregar(Libro entidad) {
		// TODO Auto-generated method stub
		libroMapper.insertLibro(entidad);
	}

	@Override
	public List<Libro> obtenerTodos() {
		// TODO Auto-generated method stub
		return libroMapper.selectTodosLibros();
	}

	@Override
	public Libro obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return libroMapper.selectLibroPorId(id);
	}

	@Override
	public void actualizar(Libro entidad) {
		// TODO Auto-generated method stub
		libroMapper.updateLibro(entidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		libroMapper.deleteLibro(id);
	}

}
