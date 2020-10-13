package graficas;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Colores_Java2D {

	public static void main(String[] args) {
		
		OtraLamina lamina= new OtraLamina();
		
		lamina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class OtraLamina extends JFrame{
	
	public OtraLamina() {
		
		setTitle("Colorcitos");
		setSize(700,400);
		setLocation(300,200);
		setVisible(true);
		
		PanelColores panel =new PanelColores();
		add(panel);
		
		panel.setBackground(Color.GRAY);
		

	}
	
	
}

class PanelColores extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2= (Graphics2D) g;
		
		Rectangle2D rectangulo2 = new Rectangle2D.Double(200,50,100,100);
		
		g2.setPaint(Color.BLUE);
		g2.fill(rectangulo2);
		
		Rectangle2D rectangulo3 = new Rectangle2D.Double(400,50,100,100);
		
		g2.setPaint(Color.BLACK);
		g2.fill(rectangulo3);
		
		Rectangle2D rectangulo4 = new Rectangle2D.Double(200,250,300,70);
		
		g2.setPaint(new Color(32,30,10));		//intanciamos un nuevo color ahi mismo 
		g2.fill(rectangulo4);
		
	}
	
	
	
	
}
