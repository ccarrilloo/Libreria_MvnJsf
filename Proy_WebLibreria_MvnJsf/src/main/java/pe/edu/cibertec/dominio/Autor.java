package pe.edu.cibertec.dominio;

public class Autor extends Entidad {

	//private int idAutor;
	private String strNombre;
	private String strPais;
	private String strBiografia;
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}

	public Autor(int id, String strNombre, String strPais, String strBiografia) {		
		this.id = id;
		this.strNombre = strNombre;
		this.strPais = strPais;
		this.strBiografia = strBiografia;
	}
		
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public String getStrPais() {
		return strPais;
	}
	public void setStrPais(String strPais) {
		this.strPais = strPais;
	}
	public String getStrBiografia() {
		return strBiografia;
	}
	public void setStrBiografia(String strBiografia) {
		this.strBiografia = strBiografia;
	}
	
}
