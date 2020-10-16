package graficas;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Imagenes2 {

	public static void main(String[] args) {
		
		Marco_ImgR marco = new Marco_ImgR();

	}

}

class Marco_ImgR extends JFrame{
	
	public Marco_ImgR() {
		
		setTitle("Imagen Rep");
		setSize(700,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Panel_ImgR panel = new Panel_ImgR();
		add(panel);
		
		panel.setBackground(new Color(167,123,37));
		
	}
}

class Panel_ImgR extends JPanel{
	
	private Image imagen;

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		try {
			imagen= ImageIO.read(new File("src/graficas/ico2.png"));
		}									
		catch(IOException e) {
			System.out.println("No se encontro la imagen");
		} 
		
		g.drawImage(imagen, 0, 0, 100, 100, null);

		for(int i=0; i<70;i++) {			//los parametos de paro no van en funcion de la resolucion del marco
			
			for(int j=0; j<50; j++) {		//solo asegurarse que se impriman por toda la pantalla
				
				if(i+j>0)
					g.copyArea(0, 0, 100, 100, i*100, j*100);
			}
		}
		
	}
	
	
	
}





