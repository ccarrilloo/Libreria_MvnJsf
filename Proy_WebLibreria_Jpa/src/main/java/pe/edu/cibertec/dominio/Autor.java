package pe.edu.cibertec.dominio;

import javax.persistence.Entity;

@Entity
public class Autor extends Entidad{

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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (biografia == null) {
			if (other.biografia != null)
				return false;
		} else if (!biografia.equals(other.biografia))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		return true;
	}
	
		
	
}
