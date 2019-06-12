package pe.edu.cibertec.principal;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.repositorio.mapper.AutorMapper;

public class PrincipalInterfaces {

	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		try (InputStream inputStream = Resources.getResourceAsStream(resource)) {
			
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			try( SqlSession session = sqlSessionFactory.openSession() ){
				
				AutorMapper am = session.getMapper(AutorMapper.class);
				
//				Autor autor = am.obtenerPorId(2);
//				System.out.println(autor.getNombre());
				
//				Autor autorInsert = new Autor(5,"Julia Navarro","España","buena escritora");
//				am.insertarAutor(autorInsert);
//				session.commit();
//				System.out.println(autorInsert.getId());
				
//				List<Autor> listaAutor = am.obtenerTodas();
//				listaAutor.forEach(p -> System.out.println(p.getNombre()));
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
