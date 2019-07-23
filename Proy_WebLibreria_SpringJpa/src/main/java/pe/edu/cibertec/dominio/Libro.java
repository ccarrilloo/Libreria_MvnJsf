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
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="id_clasificacion")
	private Clasificacion clasificacion;
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
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


}
