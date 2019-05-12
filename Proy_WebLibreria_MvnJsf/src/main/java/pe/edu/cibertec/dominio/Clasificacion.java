package pe.edu.cibertec.dominio;

public class Clasificacion extends Entidad {

	private int idClasificacion;
	private String descClasificacion;
	
	public Clasificacion() {		
		// TODO Auto-generated constructor stub
	}

	public Clasificacion(int idClasificacion, String descClasificacion) {
		super();
		this.idClasificacion = idClasificacion;
		this.descClasificacion = descClasificacion;
	}

	public int getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getDescClasificacion() {
		return descClasificacion;
	}

	public void setDescClasificacion(String descClasificacion) {
		this.descClasificacion = descClasificacion;
	}
	
	
}
