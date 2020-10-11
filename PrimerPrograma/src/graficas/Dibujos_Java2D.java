package graficas;

import javax.swing.*;
import java.awt.Graphics;

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
		setSize(300,200);		
		setVisible(true);
		
		PanelDibujos panel=new PanelDibujos();
		add(panel);
		
	}
	
}

class PanelDibujos extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		
		
	}
	
}
