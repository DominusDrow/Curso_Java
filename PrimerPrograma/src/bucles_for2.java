import javax.script.*;
import javax.swing.JOptionPane;

//progrma que clacula el factorial de un numero
public class bucles_for2 {

	public static void main(String[] args) {
		
		int i=0,num=0;
		Long reslt=1L;   //long permite trabajar con numeros muy grandes
		
		num= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a calcular factorial"));
		
		for(i=num;i>1;i--) {
			
			reslt=reslt*i;
		}
	
		System.out.println("El facorial de "+num+" es "+reslt);
	
	}

}
