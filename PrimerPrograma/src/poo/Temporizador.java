package poo;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class Temporizador {

	public static void main(String[] args) {
		
		daHora oyente= new daHora();
		
		Timer temp=new Timer(3000,oyente);
		
		temp.start();
		
		JOptionPane.showMessageDialog(null, "hasta terminar");  //muestra un mensaje en ventana
		
		System.exit(0);          // termina la ejecucion del programa

	}

}


class daHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date hora= new Date();  // crea un objeto de tipo fecha 
		
		System.out.println(hora);
		
		Toolkit.getDefaultToolkit().beep();     // crea un sonido, no usar en LINUX si no quieres quedar sin timpanos
		
		/*Toolkit es un paquete que se cominica con los recursos del sistema
		 * sirve para poner sonidos, ajustar resolucion etc.
		 */
		
	}
}
