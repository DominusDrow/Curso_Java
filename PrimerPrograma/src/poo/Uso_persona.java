package poo;
import java.util.*;

public class Uso_persona {

	public static void main(String[] args) {
		
		persona [] personas= new persona[2];
		
		personas[0]=new empleado2("Alfredo",3000,2001,12,5);
		personas[1]=new alumno("Rogelio","Programacion");
		
		for(persona i:personas) {      //aqui vemos mas plimorfismo
			
			System.out.println(i.dameNombre()+", "+i.dameDescrip());
		}
	}

}

abstract class persona{  //esto es una clase abstracta
	
	public persona(String nombre) {
		
		this.nombre=nombre;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	abstract public String dameDescrip();  //se declara una clase abstracta
	
	private String nombre;
}

class empleado2 extends persona{
	
	
	public empleado2(String nombre,double sueldo, int anio, int mes, int dia) {  
		
		super(nombre);
		this.sueldo=sueldo;
		                     
		GregorianCalendar fecha= new GregorianCalendar(anio,mes-1,dia);
		this.fecha=fecha.getTime();
		
		id=idS++;
	}
	
	public String dameDescrip() {
		
		return "id de empleado: "+id+" gana:$"+sueldo;
	}
		
	public void aumenta_sueldo(double porcentaje) {
		
		porcentaje=(sueldo*porcentaje)/100;
		
		sueldo+=porcentaje;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
		
	private double sueldo;    
	private Date fecha;
	private int id;
	private static int idS=1;
}


class alumno extends persona{
	
	public alumno(String nombre,String carrera) {
		
		super(nombre);
		this.carrera=carrera;
	}
	
	public String dameDescrip() {
		
		return "El alumno estudia: "+carrera;
	}
	
	private String nombre;
	private String carrera;
	
}
