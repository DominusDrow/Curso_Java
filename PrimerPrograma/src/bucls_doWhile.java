import javax.swing.*;

//progrma que calcula tu peso ideal 0.o
public class bucls_doWhile {

	public static void main(String[] args) {
		
		String genero="";
		
		int peso=0,altura=0;
		
		do {
			genero=JOptionPane.showInputDialog("Ingresa tu genero (H/M) 0.o");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M"));
		
		altura= Integer.parseInt(JOptionPane.showInputDialog("INgresa tu altura: "));
		
		if(genero.equalsIgnoreCase("H")){
			
			peso=altura-110;
		}
		else {
			
			peso=altura-120;
		}
		
		System.out.println("Tu peso ideal es de "+peso+" kg 0.o.... mas o meno xd");
	
	}

}
