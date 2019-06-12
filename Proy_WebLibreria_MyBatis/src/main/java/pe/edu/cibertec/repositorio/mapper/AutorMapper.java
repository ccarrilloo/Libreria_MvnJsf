package pe.edu.cibertec.repositorio.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import pe.edu.cibertec.dominio.Autor;

public interface AutorMapper {

	@Select("SELECT id, nombre, pais, biografia FROM autor WHERE id = #{id}")
	Autor obtenerPorId(int id);
	
	@Insert("INSERT INTO autor (nombre, pais, biografia) VALUES (#{nombre}, #{pais}, #{biografia})")
	void insertarAutor(Autor autor);
	
	@Select("SELECT id, nombre, pais, biografia FROM autor")
	List<Autor> obtenerTodas();
	
}
