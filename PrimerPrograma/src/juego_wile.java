import java.util.*;

//programa que hace un juego con ciclo while
public class juego_wile {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*100);
		//usamos refundicion para convertir el numero a un entero
		//usamos el metodo ramdom que nos devuleve un numero aleatorio entre 0 y 1
		
		int intentos=0,numU=0;
		
		System.out.println("ADIVINA EL NUMERO\n");
		
		Scanner entrada= new Scanner(System.in);
		
		while(numU!=num) {
			
			System.out.println("Aproximese al numero:");
			numU = entrada.nextInt();
			
			if(num>numU) {
				
				System.out.println("Mas arriba :b");
			}
			else if(num<numU) {
				
				System.out.println("Abajo, abajo...");
			}
			
			intentos++;
		}
		
		System.out.println("LOgrado :D, en "+intentos+" intentos");

	}

}
