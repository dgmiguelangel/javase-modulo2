package clase7.laboratorio;

public class Documento {
	
	private String tipoDocumento;
	private int numeroDocumento;
	
	
	Documento(String tipoDocumento, int numeroDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public int getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

}
