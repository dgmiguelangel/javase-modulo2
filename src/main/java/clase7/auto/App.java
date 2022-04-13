package clase7.auto;

public class App {

	public static void main(String[] args) {
		
		Auto a1 = new Auto();
		a1.color = "amarillo";
		a1.patente = "ama874";
		a1.marca = "fiat";
		a1.encendido = true;
		
		System.out.println( a1.mostrarDatos() );
		System.out.println(a1.encendido);
		a1.cambiarEstado(false);
		System.out.println(a1.encendido);
		
		a1.cambiarEstado();
		a1.cambiarEstado(true);
		
		Auto a2 = new Auto("rojo", "renault", "omc896", false);
		System.out.println(a2.mostrarDatos());

	}

}
