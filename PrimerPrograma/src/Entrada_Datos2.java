import javax.swing.*;

public class Entrada_Datos2 {

	public static void main(String[] args) {
	
		//creamos una ventana de dialogo
		String nombre= JOptionPane.showInputDialog("Ingresa tu nombre");
		
		String edad= JOptionPane.showInputDialog("Ahora Ingresa tu edad");
		
		int edad_conv= Integer.parseInt(edad);    //convertimos la edad a un entero
		
		
		System.out.println("eres "+nombre+" y el proximo año tendras "+(edad_conv+1)+" :D :{");
		
		
	}

}
