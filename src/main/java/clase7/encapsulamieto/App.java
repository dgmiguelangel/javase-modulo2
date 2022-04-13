package clase7.encapsulamieto;

public class App {

	public static void main(String[] args) {
		
		Auto a1 = new Auto();
		a1.setColor("negro");
		a1.setEncendido(true);
		a1.setMarca("peugeot");
		a1.setPatente("amm874");
		
		System.out.println("patente= " + a1.getPatente());
		
		Auto a2 = new Auto("rojo", "renault", "omc896", false);

	}

}
