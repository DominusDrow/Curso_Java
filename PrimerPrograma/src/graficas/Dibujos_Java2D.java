package graficas;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

public class Dibujos_Java2D {

	public static void main(String[] args) {
		
		MarcoDibujos mar1= new MarcoDibujos();
		
		mar1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoDibujos extends JFrame{
	
	public MarcoDibujos() {
		
		setTitle("Dibujitos Java2D");
		setLocation(200,300);
		setSize(800,500);		
		setVisible(true);
		
		PanelDibujos panel=new PanelDibujos();
		add(panel);
		
	}
	
}

class PanelDibujos extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo= new Rectangle2D.Double(300,100,200,250);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse= new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(300,100,500,350));
		
		Ellipse2D circulo= new Ellipse2D.Double();
		
		double centroX= rectangulo.getCenterX();
		double centroY= rectangulo.getCenterY();
		
		circulo.setFrameFromCenter(centroX, centroX, centroX+100, centroY+100);
		
		g2.draw(circulo);
		
		
	}
	
}





