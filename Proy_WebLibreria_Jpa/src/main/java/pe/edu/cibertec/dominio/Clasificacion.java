package pe.edu.cibertec.dominio;

import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
public class Clasificacion extends Entidad{

	@Column(name="descripcion")
	private String descClasificacion;

	public Clasificacion(int id, String descClasificacion) {
		this.id = id;
		this.descClasificacion = descClasificacion;
	}

	public Clasificacion() {
		// TODO Auto-generated constructor stub
	}

	public String getDescClasificacion() {
		return descClasificacion;
	}

	public void setDescClasificacion(String descClasificacion) {
		this.descClasificacion = descClasificacion;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clasificacion other = (Clasificacion) obj;
		if (descClasificacion == null) {
			if (other.descClasificacion != null)
				return false;
		} else if (!descClasificacion.equals(other.descClasificacion))
			return false;
		return true;
	}
	
		
}
