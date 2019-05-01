package pe.edu.cibertec.servicio;

import java.util.Arrays;
import java.util.List;
import pe.edu.cibertec.dominio.Autor;

public class AutorServicio {

	public List<Autor> obtenerAutor() {
		
		return Arrays.asList(
				new Autor(1, "John Ronald Reuel Tolkien", "SudAfrica",""),
				new Autor(2, "Joane K. Rowling", "Inglaterra",""),
				new Autor(3, "George Raymond Richard Martin", "Estados Unidos","")
				);
		
	}
	
	
}
