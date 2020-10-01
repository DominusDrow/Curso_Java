import javax.swing.*;

//ejemplo del bucle for each
public class Arreglos_for_each {

	public static void main(String[] args) {
		
		String []paises=new String[5];
		int i=0;
		
		for (i=0;i<paises.length;i++) {
			
			paises[i]=JOptionPane.showInputDialog("ingrese el pais "+(i+1)+":");
		}
		
		//este bucle es especial para recorrer arreglos
		for(String elemento:paises) {
			
			System.out.println(elemento);
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\nNUmeros aleatorios:");
		
		int []numerosA= new int[10];
		
		for(i=0;i<numerosA.length;i++) {
			
			numerosA[i]= (int) Math.round(Math.random()*100);
		}
		
		for(int elemento:numerosA) {
			
			System.out.println(elemento);
		}

	}

}
