package poo;
import javax.swing.*;

public class Uso_vehiculos {

	public static void main(String[] args) {
		
		coche camaro= new coche();  //instanciams una clase, nombre de la clase/nombre del objeto/constructor
		                                       
		camaro.e_color(JOptionPane.showInputDialog("De que color es el coche: ")); 
		camaro.asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));           
		                                                        
		System.out.println(camaro.info_coche());
		System.out.println(camaro.dameColor());
		
		camaro.acondicionado_dar(JOptionPane.showInputDialog("Tiene acondicionado?"));
		
		System.out.println(camaro.dime_asientos());
		System.out.println(camaro.dime_acondicionado());
		System.out.println(camaro.dime_peso());
		System.out.println("El coche tiene un precio de $"+camaro.dime_precio());
		
		System.out.print("\nTerminamos ;3");
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		Furgoneta furgo1= new Furgoneta(4,7);
		
		furgo1.e_color("VErde fosforesente");
		
		System.out.println("\n"+furgo1.dameColor()+"\n"+furgo1.dimeDatos());
		
	}

}
