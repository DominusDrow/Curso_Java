package graficas;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.awt.geom.*;
import java.io.*;

public class Imagenes {

	public static void main(String[] args) {
	
		Marco_imagen marco = new Marco_imagen();
		
	}

}

class Marco_imagen extends JFrame{
	
	public Marco_imagen() {
		
		setTitle("Imagenes");
		setSize(500,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Panel_imagen panel= new Panel_imagen();
		add(panel);
		
		panel.setBackground(Color.PINK);
		
	}
	
}

class Panel_imagen extends JPanel{
	
	private Image imagen;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g); 		//Y LOS OTROS METODOS!!!
		
		try {
			imagen= ImageIO.read(new File("src/graficas/anime1.png"));
		}
		catch(IOException e){
			System.out.println("Imagen no encontrada");
		}
		
		
		
		
		g.drawImage(imagen, 100, 100,null);
		
		
		
	}
	
	
}








