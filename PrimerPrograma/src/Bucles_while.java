import javax.swing.*;

//progrma que pide una contraseņa

public class Bucles_while {

	public static void main(String[] args) {
		
		String key="galactico85gt";
		
		String pass="";
		
		//equals es para COMPRARAR CADENAS !!!!
		
		while(pass.equals(key)==false) {
			
			pass=JOptionPane.showInputDialog("Ingrese la contraseņa: ");
			
			if(pass.equals(key)==false) {
				
				System.out.println("Contraseņa incorrecta");
			}
		}
		
		System.out.println("ENtraste :u");
	}

}
