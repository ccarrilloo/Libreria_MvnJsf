package pe.edu.cibertec.dominio;

public class Clasificacion extends Entidad {
	
	private String descClasificacion;
	
	public Clasificacion() {		
		// TODO Auto-generated constructor stub
	}

	public Clasificacion(int id, String descClasificacion) {		
		this.id = id;
		this.descClasificacion = descClasificacion;
	}
	
	public String getDescClasificacion() {
		return descClasificacion;
	}
	public void setDescClasificacion(String descClasificacion) {
		this.descClasificacion = descClasificacion;
	}
	
	
}
