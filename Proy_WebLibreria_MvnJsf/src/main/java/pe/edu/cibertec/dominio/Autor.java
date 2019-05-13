package pe.edu.cibertec.dominio;

public class Autor extends Entidad {

	//private int idAutor;
	private String nombre;
	private String pais;
	private String biografia;
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}

	public Autor(int id, String nombre, String pais, String biografia) {		
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.biografia = biografia;
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}	
	
}
