package pe.edu.cibertec.principal;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.edu.cibertec.dominio.Libro;
import pe.edu.cibertec.repositorio.RepositorioLibro;
import pe.edu.cibertec.repositorio.impl.RepositorioLibroJpaImpl;

public class Principal {
	

	static final Logger logger = LoggerFactory.getLogger(
			Principal.class);

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("bd_libreria");
		EntityManager em = emf.createEntityManager();

//		RepositorioLibro repositorioLibro
//		= new RepositorioLibroJpaImpl(em);
//		Libro libro = repositorioLibro.obtenerPorId(1);
//		
//		logger.info("Producto id: {}, nombre: {}",
//				libro.getId(), libro.getTitulo());
		
		
//		List<Libro> libro2 = repositorioLibro.obtenerTodos();
//		libro2.forEach(p -> System.out.println(
//				String.format("id: %s, Precio: %s", 
//						       p.getId(),p.getPrecio())));
		
		
		em.close();
		emf.close();
	}
}
