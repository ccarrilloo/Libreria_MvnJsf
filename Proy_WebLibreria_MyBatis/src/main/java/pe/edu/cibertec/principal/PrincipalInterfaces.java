package pe.edu.cibertec.principal;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pe.edu.cibertec.dominio.Autor;
import pe.edu.cibertec.dominio.Clasificacion;
import pe.edu.cibertec.dominio.Cliente;
import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.repositorio.mapper.AutorMapper;
import pe.edu.cibertec.repositorio.mapper.ClasificacionMapper;
import pe.edu.cibertec.repositorio.mapper.ClienteMapper;
import pe.edu.cibertec.repositorio.mapper.LibroMapper;

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
				
				ClasificacionMapper cm = session.getMapper(ClasificacionMapper.class);
//				Clasificacion claInsert = new Clasificacion(4,"Historietas");
//				cm.insertClasificacion(claInsert);
//				session.commit();				
//				List<Clasificacion> listaCla = cm.selectTodosClasificacion();
//				listaCla.forEach(p -> System.out.println(p.getDescClasificacion()));
				
				ClienteMapper clm = session.getMapper(ClienteMapper.class);
//				Cliente cliInsert = new Cliente(1,"VICTO","BECKER","DOBOREL","05/05/2000","1","45859352");
//				clm.insertCliente(cliInsert);
//				session.commit();				
//				List<Cliente> listaCliente = clm.selectTodosCliente();
//				listaCliente.forEach(p -> System.out.println(p.getNombre()));
				
				//Libro libro = new Libro(1,"Usted SA","Empresarial","03/02/2010",5,1,new Double("60.00"));
				
				
				LibroMapper lm = session.getMapper(LibroMapper.class);
				List<Libro> listaLibro = lm.selectTodosLibros();
				listaLibro.forEach(p -> System.out.println(String.format(
						"titulo: %s, Autor: %s, Clasificacion: %s",
						p.getTitulo(),p.getAutor().getNombre(), p.getClasificacion().getDescClasificacion())));
								
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
