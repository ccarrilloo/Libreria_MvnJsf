package pe.edu.cibertec.dominio;

import pe.edu.cibertec.dominio.Clasificacion;

public class Libro extends Entidad {

	public Libro() {		
		// TODO Auto-generated constructor stub
	}

	private String titulo;
	private String strFecPub;
	private String strDescri;
	private Clasificacion clasificacion;
	private Autor autor;
	private double precio;
	
	public Libro(int id,String titulo, String strFecPub, String strDescri, Clasificacion clasificacion,
			Autor autor, double precio) {

		this.id = id;
		this.titulo = titulo;	
		this.strFecPub = strFecPub;
		this.strDescri = strDescri;
		this.clasificacion = clasificacion;
		this.autor = autor;
		this.precio = precio;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}	
	public String getStrFecPub() {
		return strFecPub;
	}
	public void setStrFecPub(String strFecPub) {
		this.strFecPub = strFecPub;
	}
	public String getStrDescri() {
		return strDescri;
	}
	public void setStrDescri(String strDescri) {
		this.strDescri = strDescri;
	}
	public Clasificacion getclasificacion() {
		return clasificacion;
	}
	public void setclasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;		
		result = prime * result + ((strDescri == null) ? 0 : strDescri.hashCode());
		result = prime * result + ((strFecPub == null) ? 0 : strFecPub.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;				
		if (strDescri == null) {
			if (other.strDescri != null)
				return false;
		} else if (!strDescri.equals(other.strDescri))
			return false;
		if (strFecPub == null) {
			if (other.strFecPub != null)
				return false;
		} else if (!strFecPub.equals(other.strFecPub))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	
	
}
