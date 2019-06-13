package pe.edu.cibertec.repositorio.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Clasificacion;
import pe.edu.cibertec.repositorio.RepositorioClasificacion;
import pe.edu.cibertec.repositorio.mapper.ClasificacionMapper;

public class RepositorioClasificacionMyBatisImpl implements RepositorioClasificacion {

	private final ClasificacionMapper clasificacionMapper;
	
	public RepositorioClasificacionMyBatisImpl(SqlSession sqlSession) {
		clasificacionMapper = sqlSession.getMapper(ClasificacionMapper.class);
	}

	@Override
	public void agregar(Clasificacion entidad) {
		clasificacionMapper.insertClasificacion(entidad);
	}

	@Override
	public List<Clasificacion> obtenerTodos() {
		return clasificacionMapper.selectTodosClasificacion();
	}

	@Override
	public Clasificacion obtenerPorId(Integer id) {		
		return clasificacionMapper.selectClasificacionPorId(id);
	}

	@Override
	public void actualizar(Clasificacion entidad) {
		clasificacionMapper.updateClasificaion(entidad);
	}

	@Override
	public void eliminar(Integer id) {
		clasificacionMapper.deleteClasificacion(id);
	}

}
