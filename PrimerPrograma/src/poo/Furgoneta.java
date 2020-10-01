package poo;

public class Furgoneta extends coche{   //la palabra reservada "extends" es para heredar
	
	int capacidad_carga, plaza_extra;   
	
	public Furgoneta(int capacidad_carga, int lugares) {
		
		super(); // con "super" llamamos al constructor de la clase principal
		
		this.capacidad_carga=capacidad_carga;
		plaza_extra=lugares;

	}
	
	public String dimeDatos() {
		
		return "tiene "+plaza_extra+" plazas y "+capacidad_carga+"kg capacidad de carga";
	}
	

}
