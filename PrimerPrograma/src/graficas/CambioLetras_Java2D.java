package graficas;

import javax.swing.*;
import java.awt.*;

public class CambioLetras_Java2D {

	public static void main(String[] args) {
		
		OtroMarcoxd marco = new OtroMarcoxd();
		
	}

}

class OtroMarcoxd extends JFrame{
	
	public OtroMarcoxd() {
		
		setTitle("Letras");
		setSize(500,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Lamina_letras letras = new Lamina_letras();
		add(letras);
		
		letras.setForeground(Color.DARK_GRAY); //le da color a todo lo que se dibuja en el panel
		letras.setBackground(Color.lightGray);
	}	
}

class Lamina_letras extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2= (Graphics2D) g;
		
		g2.setFont(new Font("Arial",Font.BOLD,20));
		g2.setColor(new Color(133,2,42));
		g2.drawString("NOTAS",50, 50);
		
		g2.setFont(new Font("Arial",Font.ITALIC,24));
		g2.setPaint(Color.DARK_GRAY);
		g2.drawString("No Hay notas xd",50, 150);
		
	}
	
}




