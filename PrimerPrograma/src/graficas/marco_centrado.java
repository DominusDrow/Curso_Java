package graficas;

import javax.swing.*;
import java.awt.*;

public class marco_centrado {

	public static void main(String[] args) {
		
		ventana_cent aber= new ventana_cent();
		
		aber.setVisible(true);  //se le pasa un valor !!!!!!
		
		

	}

}

class ventana_cent extends JFrame{  //se hereda de JFrame!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	public ventana_cent(){
		
		Toolkit sistem = Toolkit.getDefaultToolkit(); //un objeto que tiene mucas herramientas del sistema
		
		Dimension dimension= sistem.getScreenSize(); //metodo "getSreen.." devuelve un objeto de tipo dimension
														// donde se almacenan las medidas de nuestra pantalla			
		int ancho=dimension.width;
		int largo=dimension.height;        //los asignamos a variables
		
		setSize(ancho/2,largo/2);   //se da el tamaño de la ventana
		
		setLocation(ancho/4,largo/4);  //se da ubicacion a la ventana 
		
		setTitle("icon");
		
		Image icono= sistem.getImage("src/graficas/icon1.png");
		
		setIconImage(icono);
		
		
	}
	
	
}