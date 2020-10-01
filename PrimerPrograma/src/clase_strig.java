
public class clase_strig {

	public static void main(String[] args) {
		
		//aqui vamos a ver el uso de metodos string
		
		String nom="Alfredo";
		
		System.out.println("El nombre ingresado es: "+nom);
		
		System.out.println("Tine "+nom.length()+" letras y la primera es: "+nom.charAt(0));
		
		System.out.println("Su ultima letra es: "+nom.charAt(nom.length()-1));
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		//como extraer un fragmente de una frase
		
		String frase="Tas bien?";
		
		String TasmanDemon= frase.substring(0, 3);
		
		System.out.println("\nla frase original es: "+frase+" y el fragmento es: "+TasmanDemon);
			
		
		//combinando lo que sabemos
		
		String pregunta= frase.substring(frase.length()/2, frase.length()) +" N0";
		
		System.out.println("El resumen de mi vida xd: "+pregunta);
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		 
		//metodo equals
		
		String alumno1, alumno2;
		
		alumno1="Alfredo";
		
		alumno2="Ricardo";
		
		System.out.println("\nEl alumno 1 es: "+alumno1+" El alumno 2 es: "+alumno2);
		
		System.out.println("\nComparando Alumno 1 y 2: "+ alumno1.equals(alumno2));
		
		System.out.println("Comparando Alumno 1 y Alfredo: "+ alumno1.equals("Alfredo"));
		
		//usando el equals que no distingue mayusculas
		
		System.out.println("Comparando Alumno 2 y ricardo: "+ alumno1.equalsIgnoreCase("ricardo"));

	}

}
