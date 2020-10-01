package poo;
import java.util.*; //fichero para el GregorianCalendar

//EN UNA CLASE SOLO PUEDE HABER UN METODO MAIN
public class Uso_Empleado {

	public static void main(String[] args) {
		
		jefe jefe1=new jefe("Ricardo",4000,2001,3,20);
		jefe1.dameIncentvo(600);
		
		empleado[] Empresa= new empleado[4];
		
		Empresa[0]= new empleado("Romeo",1500,2009,3,23);
		Empresa[1]= new empleado("Sergio",1500,2010,3,27);
		
		Empresa[2]= jefe1; //este es el polimorfismo en Accion!
		
		Empresa[3]= new jefe("Homero",3000,1999,5,32);  //tambien llamado principio de sustitucion 
		
		jefe jefe_nuevo= (jefe) Empresa[3];  //asi hacemos casting 
		jefe_nuevo.dameIncentvo(10001);
		
		
		System.out.println( jefe1.dameDesicion("mas paga para todos !"));
		if(jefe1 instanceof empleado)
			System.out.println("el objeto jefe pertenece a empleado\n");
		
		//estableciondo bonos--------------------------------------------------------------
		
		System.out.println("el empleado "+Empresa[0].dameNombre()+" tiene un bono de "+Empresa[0].establece_bono(200));
		System.out.println("el jefe "+jefe1.dameNombre()+" tiene un bono de "+jefe1.establece_bono(200)+"\n");
		
		for(empleado i:Empresa) {
			i.aumenta_sueldo(10);
		}
		
		Arrays.sort(Empresa);      // la clase "Arrays" tiene un metodo "sort" que ordena objetos
		
		for(empleado i:Empresa) {
			System.out.println(i.Info()); //mas polimorfismo!!!!!!!!!!!!!!!
		}
		
	}
}

class empleado implements Comparable, trabajadores{ //implementamos una interfaz de la API
								
	public empleado(String nombre,double sueldo, int anio, int mes, int dia) {  
		
		this.nombre=nombre;
		this.sueldo=sueldo;
		                      //es una clase con vairos constructuros que sirve para signar una fecha 
		GregorianCalendar fecha= new GregorianCalendar(anio,mes-1,dia);
		this.fecha=fecha.getTime();
		
		id=idS++;
	}
	
	public empleado(String nom) { 
		
		this(nom,3000,2020,2,1);  //aqui el "this" llama al metodo constructor de la clase, segun los parametros
		id=idS++;
	}
	
	public String Info() { 
		
		return nombre+" "+id+"  "+dameSueldo()+"  "+fecha; 
	}
	
		//el final en un metodo impide que este sea reescrito en otra clase
	final public void aumenta_sueldo(double porcentaje) {
		
		porcentaje=(sueldo*porcentaje)/100;
		
		sueldo+=porcentaje;
	}
	
	public double establece_bono(double gratificacion){
		return bono+gratificacion;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public int compareTo(Object Obj1) { //rescribimos la clase que nos indica la interfaz "Comparable"
		
		empleado empl_aux= (empleado) Obj1;             //usamos refundicion o "castong"
		
		if(this.dameSueldo()>empl_aux.dameSueldo())
			return 1;
		
		else if(this.dameSueldo()<empl_aux.dameSueldo())
			return -1;
		
		return 0;                         //si son iguales no entra a las condicionales
	}
	
	final private String nombre;        
	private double sueldo;        
	private Date fecha;
	private int id;
	private static int idS=1;
	
}

	//el final impide que otra clase herede de esta
final class jefe extends empleado implements jefes {  //las clases no llevan parentesis
	
	public jefe(String nom,double suel, int anio, int mes, int dia) {
		
		super(nom,suel,anio,mes,dia);
		insent=0;
	}
	
	public String dameDesicion(String desicion) {     //reescribimos el metodo abstracto
		return "el jefe "+this.dameNombre()+" decidio	"+desicion;
	}
	
	public double establece_bono(double gratificacion) {
		
		double prima=200;
		
		return prima+trabajadores.bono+gratificacion;
	}
	
	public void dameIncentvo(double insent) {
		
		this.insent=insent;
	}
	
	public double dameSueldo() {  //sobreEscribims la clase "dameSueldo"
		
		double sueldoJefe= super.dameSueldo()+insent;  //con el prefijo "super" nos referimos a la clase padre   
		
		return sueldoJefe;
	}
	
	private double insent;
}


