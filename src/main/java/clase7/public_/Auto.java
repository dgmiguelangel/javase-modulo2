package clase7.public_;

public class Auto {
	
	private String color;
	private String marca;
	private String patente;
	private boolean encendido;		
	
	public Auto() {
		super();
	}

	public Auto(String color, String marca, String patente, boolean encendido) {
		super();
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.encendido = encendido;
	}

	public void encender() {
		encendido = true;
	}
	
	public void apagar() {
		encendido = false;
	}
	
	//SOBRECARGA DE METODOS
	public void cambiarEstado(boolean encendido) {
		this.encendido = encendido;
	}
	
	public void cambiarEstado() {
		encendido = !encendido;
	}
	
	
	public String mostrarDatos() {
		return "auto[color= " + color + ", patente= " + patente + "]";
	}

}
