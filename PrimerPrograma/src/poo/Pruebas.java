package poo;

public class Pruebas {

	public static void main(String[] args) {
		
		empleados emp1=new empleados("Alfredo");
		empleados emp2=new empleados("Rogelio");
		
		emp2.cambiar_dep("Recursos Humanos");
		
		System.out.println(emp1.inf()+"\n"+ emp2.inf());
		
		System.out.println(empleados.ver_idS()); //para invocar un metodo static no se nesesita de un objeto

	}
}


class empleados{
	
	private final String nombre; // la palabra "final" impide que laa variable sea modificada luego
	private String departamento;
	private int id;
	private static int idS=1;   // una variable static la comparten todos los objetos de la clase
										//las otras variables son particulares de cada objeto
	public empleados(String nom) {
		
		nombre=nom;
		departamento="Administracion";
		id=idS++;
	}
	/*                                       //por lo que un metodo como este nos marcaria error
	public void cambiar_nombrw(String nom) {
		nombre=nom;
	}*/
	
	
	public void cambiar_dep(String dep) {
		
		departamento=dep;
	}
	
	public String inf() {
		
		return "El emplado: "+nombre+" pertencece a: "+departamento+" id:"+id;
	}
	
	public static String ver_idS() {
		
		return "El idS es "+idS;  //los metodos static solo pueden contener varibales static o metodos asi
	}
	
	
}