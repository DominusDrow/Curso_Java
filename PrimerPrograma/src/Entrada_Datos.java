import java.util.*;

public class Entrada_Datos {

	public static void main(String[] args) {
		
		
		Scanner entrada=new Scanner(System.in);   //creamos un objeto de la clase scanner
		
		System.out.println("Ingrese su nombre: ");
		
		String nombre = entrada.nextLine();     //creamos una cadena en donde almacenamos la entrada de datos
		
		System.out.println("Ingrese su edad: ");
		
		int edad = entrada.nextInt();   //usamos la clase nextInt ya que pediremos un entero
		
		System.out.println("\n"+nombre+" tendra  "+(edad+1)+" el proximo año");
		
	}

}
