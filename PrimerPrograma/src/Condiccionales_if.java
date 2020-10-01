import java.util.*;
	
public class Condiccionales_if {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);  //creamos un objeto de la clase scanner
		
		System.out.println("PAra pasar, ingrese su edad: ");
		
		int edad = entrada.nextInt();    //usamos el metodo nextInt del objeto creado
		
		if(edad<18) {
			
			System.out.println("No podemos dejarte pasar, :(");
		}
		else if(edad>60) {
			
			System.out.println("Esta muy joven :V");
		}
		else if(edad>=18) {
			
			System.out.println("Pasale xd");
		}
		else {
			
			System.out.println("No reconocido :0");
		}

	}

}
