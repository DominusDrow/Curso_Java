package graficas;

import javax.swing.*;
import java.awt.*;

public class Panel {

	public static void main(String[] args) {
		
		VentanaText vent= new VentanaText();
		
		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //que se cierre 
		
		

	}

}

class VentanaText extends JFrame{

	public VentanaText(){
	
		setSize(600,400);
		setLocation(300,200);
		setTitle("Ventena con texto");
		
		Marco marco= new Marco();  //cramos el objeto adentro del costructor
		
		add(marco);    //solo con esta intruccion ya ejecuta todo, no nesesitamos pasar un 
						//objeto de tipo Graphics
		
		setVisible(true);  
	}

}


class Marco extends JPanel{  //la clase "JPanel" es la que cra las laminas
	

	public void paintComponet(Graphics g) {     //reescribimos el metodo "paintComponet"
												//le pasamos por parametro un onj tipo Graphics					
		super.paintComponent(g);  
		
		g.drawString("HOla mundo xd",100,100);   //sirve para escribir una cadena en una posicion
		
	}
	
	
	
}






