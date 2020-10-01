package graficas;
import javax.swing.*;

public class mi_primera_ventana {

	public static void main(String[] args) {
	
		ventana nuevaV = new ventana();
		
		nuevaV.setVisible(true);   //hacemos visible nuestra ventana
		
		nuevaV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //definimos que hacer cuando se cierre
										//le pasamos una constante de la clase

	}

}

class ventana extends JFrame{  // "JFrame" es la clase que tiene todos los metodos para hacer ventanas
	
	public ventana() {
		
		//setSize(500,300);      // es el metodo que sirve para darle tamaño a la ventana
		
		//setLocation(200,500);  //define el la poasicion de la ventana, (cuadrante 4)
		
		setBounds(300,300,500,300); //define la psosiocon y luego el tamaño de la ventana
		
		setTitle("Prueba");   //asi le ponemos titulo a nuestra ventana
		
		//setExtendedState(JFrame.MAXIMIZED_BOTH);  //definimos el tamaño de la vnetana
		
		
	}
	
	
}