package graficas;

import javax.swing.*;
import java.awt.*;

public class Fuentes_intaladas {

	public static void main(String[] args) {
		
		String fuente= JOptionPane.showInputDialog("Ingrese fuente a buscar");
		
		String [] Lista_fuentes= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames() ;
		
		for(String f:Lista_fuentes ) {
			//System.out.println(f);
			if(f.equalsIgnoreCase(fuente))
				JOptionPane.showConfirmDialog(null, "FUnete instalada");
		}

	}

}
