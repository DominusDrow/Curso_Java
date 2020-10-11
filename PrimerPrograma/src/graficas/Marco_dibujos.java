package graficas;

import java.awt.Graphics;

import javax.swing.*;

public class Marco_dibujos {

	public static void main(String[] args) {
		
		Marco_Dibujos marquito= new Marco_Dibujos();
		
		marquito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}

class Marco_Dibujos extends JFrame{
	
	public Marco_Dibujos() {
		
		setTitle("Marco con dibujos");
		setLocation(400,600);
		setSize(600,400);
		setVisible(true);
		
		Dibujitos panel = new Dibujitos();
		
		add(panel);
		
		
	}

}

class Dibujitos extends JPanel{
								//usamos constructor por defecto 
	
		public void paintComponent(Graphics g) {  //se le pasa un objeto de tipo "graphics"
			
			super.paintComponent(g);    //llamamos a la clase padre para que haga lo te tenga que hacer xd
			
			//A partir de aqui ya podemos hacer cualquier cosa con el objeto "Graphics"
			
			g.drawLine(100,200,300, 600);
			g.drawArc(10, 30, 50, 20, 80, 50);
				
		}
	
	
	
}