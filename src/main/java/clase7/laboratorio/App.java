package clase7.laboratorio;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Persona[] personas;
		byte cp = 0;
		Persona p;
		String nombre, apellido;
		Documento documento;
		String tipoDocumento;
		int numeroDocumento;
		LocalDate fechaNacimiento;
		
		System.out.println("Ingrese cantidad de personas");
		cp = sc.nextByte();
		
		personas = new Persona[cp];
		
		for(byte i = 0; i < personas.length; i++) {
			
			p = new Persona();
			
			System.out.println("Ingrese su nombre");
			nombre = sc.next();
			
		}
		
		sc.close();

	}

}
