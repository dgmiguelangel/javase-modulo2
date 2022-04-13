package clase7.auto;

class Auto {
	
	String color;
	String marca;
	String patente;
	boolean encendido;		
	
	Auto() {
		super();
	}

	Auto(String color, String marca, String patente, boolean encendido) {
		super();
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.encendido = encendido;
	}

	void encender() {
		encendido = true;
	}
	
	void apagar() {
		encendido = false;
	}
	
	//SOBRECARGA DE METODOS
	void cambiarEstado(boolean encendido) {
		this.encendido = encendido;
	}
	
	void cambiarEstado() {
		encendido = !encendido;
	}
	
	
	String mostrarDatos() {
		return "auto[color= " + color + ", patente= " + patente + "]";
	}

}
