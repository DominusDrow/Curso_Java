import javax.swing.*;

//programa que verifica si un mail tine @
public class bucles_for {

	public static void main(String[] args) {
		
		boolean arroba=false;
		
		String mail="";
		
		int i=0;
		
		mail=JOptionPane.showInputDialog("Introduce tu mail: ");
		
		for(i=0;i<mail.length();i++) {
			
			if(mail.charAt(i)=='@') 	{
				
				arroba=true;
			}
		}
		
		if(arroba==true) {
			
			System.out.println("TU correo es valido");
		}
		else {
			
			System.out.println("TU correo no es valido");
		}
		

	}

}
