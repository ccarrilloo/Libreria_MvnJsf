package pe.edu.cibertec.dominio;

import pe.edu.cibertec.dominio.Clasificacion;

public class Libro {

	private int idIdLibro;
	private int idAutor;
	private String titulo;
	private String strAutor;
	private String strClaBib;
	private String strFecPub;
	private String strDescri;
	private Clasificacion oClasificacion;
	private Autor oAutor;
	private double precio;

	public Libro(int idIdLibro, int idAutor, String titulo, String strAutor, String strClaBib, String strFecPub,
			String strDescri, Clasificacion oClasificacion, Autor oAutor, double precio) {
		super();
		this.idIdLibro = idIdLibro;
		this.idAutor = idAutor;
		this.titulo = titulo;
		this.strAutor = strAutor;
		this.strClaBib = strClaBib;
		this.strFecPub = strFecPub;
		this.strDescri = strDescri;
		this.oClasificacion = oClasificacion;
		this.oAutor = oAutor;
		this.precio = precio;
	}

	public int getIdIdLibro() {
		return idIdLibro;
	}
	public void setIdIdLibro(int idIdLibro) {
		this.idIdLibro = idIdLibro;
	}
	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getStrAutor() {
		return strAutor;
	}
	public void setStrAutor(String strAutor) {
		this.strAutor = strAutor;
	}
	public String getStrClaBib() {
		return strClaBib;
	}
	public void setStrClaBib(String strClaBib) {
		this.strClaBib = strClaBib;
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
	public Clasificacion getoClasificacion() {
		return oClasificacion;
	}
	public void setoClasificacion(Clasificacion oClasificacion) {
		this.oClasificacion = oClasificacion;
	}
	public Autor getoAutor() {
		return oAutor;
	}
	public void setoAutor(Autor oAutor) {
		this.oAutor = oAutor;
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
		result = prime * result + idAutor;
		result = prime * result + idIdLibro;
		result = prime * result + ((strAutor == null) ? 0 : strAutor.hashCode());
		result = prime * result + ((strClaBib == null) ? 0 : strClaBib.hashCode());
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
		if (idAutor != other.idAutor)
			return false;
		if (idIdLibro != other.idIdLibro)
			return false;
		if (strAutor == null) {
			if (other.strAutor != null)
				return false;
		} else if (!strAutor.equals(other.strAutor))
			return false;
		if (strClaBib == null) {
			if (other.strClaBib != null)
				return false;
		} else if (!strClaBib.equals(other.strClaBib))
			return false;
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
