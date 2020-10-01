import java.util.*;
import javax.swing.*;

public class Condicionales_switch {

	public static void main(String[] args) {
		
		//programa para calcular el area de algunas fiuras
		
		int caso=0,b=0,h=0;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Ingrese de que figura desea calccular el area\n"
				+ "1.-Cuadrado  2.-Rectangulo  3.-Triangulo  4.-Circulo");
		
		caso=entrada.nextInt();
		
		
		if(caso==1 || caso==2 || caso==3) {	    //convertmos la cadena a un entero
																	
			b= Integer.parseInt( JOptionPane.showInputDialog("Ingrese la base de la figura"));
		}
		if(caso==2 || caso==3) {
		
			h= Integer.parseInt( JOptionPane.showInputDialog("Ingrese la altura de la figura"));
		}
		
		switch(caso) {
		
		case 1:
			
			System.out.println("El area del cuadrado es: "+(b*b));
			break;
			
		case 2:
			
			System.out.println("El area del rectangulo es: "+(b*h));
			break;
			
		case 3:
			
			System.out.println("El area del triangulo es: "+(b*h)/2);
			break;
			
		case 4:
			
			b= Integer.parseInt( JOptionPane.showInputDialog("Ingrese el radio: "));
				
			System.out.printf("EL area del circulo es: %.3f",Math.PI*(b*b));
			break;
			
		default: 
			
			System.out.println("Opcion no reconocida");
		}
	}

}
