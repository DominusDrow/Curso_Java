package poo;  // esta es la carpeta donde se guarda el programa

//el nombre de un paquete no se pone en mayusculas

public class coche {
	
	private int ancho,alto,ruedas,peso_plat;  //con modificador "private" encapsulamos las variables 
	
	private String color;            //variables cambiantes 
 	private boolean asientos_cuero,acondicionado;
	
	public coche() {  //esto es el constructor, el constructor debe terner el mismo nombre que la clase
		
		ruedas=4;
		ancho=300;
		alto=120;
		peso_plat=500;
	}
	
	public String info_coche() {  //metodo Getter  (es para devolver valores)
		
		return "El coche tiene "+ruedas+" ruedas,  un alto de "+alto+" y un ancho de "+ancho;
	}
	
	public void e_color(String color) {    //metodo Setter  (es para pedir datos o establecerlos)
		
		this.color=color;   //con el "this diferenciamos netre la variable de la  clase y la que declaramos dentro del met"
	}
	
	public String dameColor() {
		
		return "el cohce es de color "+color;
		
	}
	
	public void asientos(String asientos_cuero) {
		
		if(asientos_cuero.equalsIgnoreCase("Si")) {
			this.asientos_cuero=true;
		}
		else {
			
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos() {
		
		if(asientos_cuero==true) {
			return "El carro tiene asientos de cuero";   //si evaluamos una condicioal tenemos que poner al menos
		}												//un else para asegurar que retorna algo 
		else {
			return "el carro no tiene asientso de cuero";
		}
	}
	
	public void acondicionado_dar(String acondicionado) { //SETTER
		
		if(acondicionado.equalsIgnoreCase("Si")) {
			
			this.acondicionado=true;
		}
		else {
			
			this.acondicionado=false;
		}
	}
	
	public String dime_acondicionado() {  //GETTER
		
		if(acondicionado==true) {
			return "El coche tienee aire acondiicionado";
		}
		else {
			return "El coche esta pelado :b";
		}
	}
	
	public String dime_peso(){  //Es un STTER Y GETTER al mismo tiempo
		
		int peso_arriba=500;         //esta practica esta desaconsejada
		
		peso_plat+=peso_arriba;           //se esta modificando una variable ext
		
		if(acondicionado==true) {
			peso_plat+=50;
		}
		if(asientos_cuero==true) {
			peso_plat+=50;
		}
		
		return "El peso del carro es de "+peso_plat+"kg";
	}
	
	public int dime_precio() {  //GETTER
		
		int precio=100000;
		
		if(asientos_cuero==true) {
			precio+=1000;
		}
		if(acondicionado==true) {
			precio+=3500;
		}
		
		return precio;
	}
	
}
