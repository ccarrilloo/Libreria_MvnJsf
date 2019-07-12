package pe.edu.cibertec.dominio;

public enum TipoDocumento {

	DNI("dni"), RUC("ruc"), Pasaporte("pasaporte");

	private final String tipoDocumento;
	
	private TipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}
	
}