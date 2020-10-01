import java.util.*;

public class ejemplo_enum {
	
	enum talla{
		 
		Chica("s"),Mediana("l"),Grande("m");  //se declaran los datos y se le pasa su constructor
		
		private talla(String abrev) {
			
			this.abrev=abrev;
		}
		
		public String dameAbrev() {
			
			return abrev;
		}
		
		private String abrev;
	}

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Escriba una talla: Chica,Mediana,Grande");
		
		String entrada_talla= entrada.next().toUpperCase();  //el metodo convierte la entrada en mayusculas
		
		talla la_talla= Enum.valueOf(talla.class, entrada_talla);
		
		System.out.println("la talla fue: "+entrada_talla);
		
		System.out.println("su areviatura es: "+la_talla.dameAbrev());
		

	}

}
