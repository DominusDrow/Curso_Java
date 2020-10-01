import javax.swing.*;

public class Entrada_Numeros {

	public static void main(String[] args) {

		//creamos una ventana y pedimos un nunero
		String num=JOptionPane.showInputDialog("Introdusca un numero:");
		
		Double num_cov= Double.parseDouble(num);   //convertimos el numero a Double
		
		System.out.print("El numero introducido fue: "+num+"  y su raiz cuadrada es: ");
		
		System.out.printf("%.2f",Math.sqrt(num_cov));  //printf da formato al texto de dentro
			
	}

}
