package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class botones2 {

	public static void main(String[] args) {
		
		Marco2 marco = new Marco2();
		
		

	}

}


class Marco2 extends JFrame{
	
	public Marco2() {
		
		setTitle("Mas botones :y");
		setSize(700,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Panel2 panel = new Panel2();
		add(panel);
		
	}

}

class Panel2 extends JPanel{
	
	JButton BAzul = new JButton("Azul");
	JButton BVerde = new JButton("Verde");
	JButton BRojo = new JButton("Rojo");
	
	public Panel2() {
		
		add(BAzul);
		add(BVerde);
		add(BRojo);
		
		ColorFondo Azul= new ColorFondo(Color.BLUE);
		ColorFondo Verde= new ColorFondo(Color.GREEN);
		ColorFondo Rojo= new ColorFondo(Color.RED);
		
		BAzul.addActionListener(Azul);
		BVerde.addActionListener(Verde);
		BRojo.addActionListener(Rojo);
	
	}
	
	private class ColorFondo implements ActionListener{		//creamos una clase interna
		
		Color color;
		
		public ColorFondo(Color color) {
			
			this.color=color;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(color);
		}

	}
	
}







