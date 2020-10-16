package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class boton_cambiaColor {

	public static void main(String[] args) {
	
		Marco marco = new Marco();
		
	}

}

class Marco extends JFrame{
	
	public Marco() {
		
		setTitle("Bton magicoxd");
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Panel panel = new Panel();
		add(panel);
	
	}
	
}


class Panel extends JPanel implements ActionListener{	//la interfaz permite que la clase este
														//pendiente, como ollente
	JButton botonVerde = new JButton("Verde");
	JButton botonAzul = new JButton("Azul");	//recibe como parametro el nombre del boton
	JButton botonGris= new JButton("Gris");
	
	public Panel() {		
		
		add(botonVerde);	// se le pueden añadir elementos
		add(botonAzul);
		add(botonGris);
		
		botonVerde.addActionListener(this);		//quien es el que recibe el evento
		botonAzul.addActionListener(this);
		botonGris.addActionListener(this);
	}
	

	public void actionPerformed(ActionEvent e) {	//sobreEscribimos el metodo
		
		Object color = e.getSource();		//comprueba de donde se desencadeno el evento
		
		if(color==botonVerde) {
			setBackground(Color.GREEN);
		}
		else if(color==botonAzul){
			setBackground(Color.BLUE);
		}
		else {
			setBackground(Color.GRAY);
		}
		
	}
	
	
	
}




