package pe.edu.cibertec.dominio;

public class Autor {

	private int idAutor;
	private String strNombre;
	private String strPais;
	private String strBiografia;
	
	public Autor(int idAutor, String strNombre, String strPais, String strBiografia) {		
		this.idAutor = idAutor;
		this.strNombre = strNombre;
		this.strPais = strPais;
		this.strBiografia = strBiografia;
	}
	
	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
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
