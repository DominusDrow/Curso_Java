package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador_clase_local {
	
	public static void main(String[] args) {
		
		Reloj2 muestra= new Reloj2();
		
		muestra.empezar(3000, false);
		
		JOptionPane.showMessageDialog(null, "Pulse y se termina");  //hace que el programa se mantenga en ejecucion
		
		System.exit(0);
	}

}

class Reloj2{
	
	
	public void empezar(int lapso,boolean sonido) {
		
		class tiempo implements ActionListener{  //esto es una clase local, no lleva modificador de acceso
			 
			public void actionPerformed(ActionEvent event) {    
				
				Date ahora= new Date();
				
				System.out.println(ahora);
				
				if(sonido)         //una clase local puede acceder a las variables de la clase externa, pero no al reves
					Toolkit.getDefaultToolkit().beep();
			}
			//una clase local se ocupa cuando solo se instanciara ua vez esa clase
		}
		
		ActionListener hora = new tiempo();
			
		Timer evento= new Timer(lapso,hora);
		evento.start();
	
	}
	
}