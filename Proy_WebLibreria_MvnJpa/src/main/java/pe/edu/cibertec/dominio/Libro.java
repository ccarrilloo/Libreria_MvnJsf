package pe.edu.cibertec.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Libro extends Entidad {

	private String titulo;
	
	@Column(name="fecha_pub")
	private String strFecPub;
	
	@Column(name="descripcion")
	private String strDescri;
	
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumn(name="id_clasificacion")
	private Clasificacion clasificacion;
	
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumn(name="id_autor")
	private Autor autor;
	
	@Column(name="PRECIO")
	private double precio;

	public Libro() {
		// TODO Auto-generated constructor stub
	}
	
	public Libro(Integer id, String titulo, String strFecPub, String strDescri, Clasificacion clasificacion, Autor autor,
			double precio) {
		this.id = id;
		this.titulo = titulo;
		this.strFecPub = strFecPub;
		this.strDescri = strDescri;
		this.clasificacion = clasificacion;
		this.autor = autor;
		this.precio = precio;
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

	public Clasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
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
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (clasificacion == null) {
			if (other.clasificacion != null)
				return false;
		} else if (!clasificacion.equals(other.clasificacion))
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
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
