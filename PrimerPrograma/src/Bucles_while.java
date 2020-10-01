import javax.swing.*;

//progrma que pide una contraseña

public class Bucles_while {

	public static void main(String[] args) {
		
		String key="galactico85gt";
		
		String pass="";
		
		//equals es para COMPRARAR CADENAS !!!!
		
		while(pass.equals(key)==false) {
			
			pass=JOptionPane.showInputDialog("Ingrese la contraseña: ");
			
			if(pass.equals(key)==false) {
				
				System.out.println("Contraseña incorrecta");
			}
		}
		
		System.out.println("ENtraste :u");
	}

}
