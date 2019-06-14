package pe.edu.cibertec.dominio;

public class Libro extends Entidad {

	private String titulo;	
	private String strDescri;
	private String strFecPub;
	private Clasificacion clasificacion;
	private Autor autor;
	private double precio;

	public Libro() {
		// TODO Auto-generated constructor stub
	}
	
	public Libro(Integer id, String titulo, String strDescri, String strFecPub, Clasificacion clasificacion, Autor autor,
			double precio) {
		this.id = id;
		this.titulo = titulo;
		this.strDescri = strDescri;
		this.strFecPub = strFecPub;		
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
