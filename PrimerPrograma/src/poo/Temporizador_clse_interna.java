package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador_clse_interna {

	public static void main(String[] args) {
		
		Reloj hora = new Reloj(3000,false);
		
		hora.empezar();
		
		JOptionPane.showMessageDialog(null, "Pulsa para terminar");
		
		System.exit(0);

	}

}


class Reloj{
	
	public Reloj(int lapso,boolean sonido) {
		
		this.lapso=lapso;
		this.sonido=sonido;
	}
	
	public void empezar() {
		
		ActionListener oyente= new temp();
		
		Timer espera= new Timer(lapso,oyente);
		
		espera.start();
		
	}
	
	private int lapso;
	private boolean sonido;
	
	
	private class temp implements ActionListener{  //esto es una clase interna, siempre son "private"
		
		public void actionPerformed(ActionEvent evento) {
			
			Date ahora = new Date();
			
			System.out.println(ahora);
			
			if(sonido)                          //puede acceder a las variables de la clase principal
				Toolkit.getDefaultToolkit().beep();
		}
		
	}
	
	
	
}