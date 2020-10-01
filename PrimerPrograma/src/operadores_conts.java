
public class operadores_conts {
	
	static final int conts=1; //si la constante esta fuera de una clase debe llevar el parametro "static"

	public static void main(String[] args) {
		
		final double in=2.72;  // asi se define una constante adentro de unsa clase
	
		System.out.println("En una pulgada hay: "+in+" cm");  // asi se concadenan textos
		
		////////////////////////////////////////////////////////////////////////////////////
		
		byte num1,num2,num3;  //tambien es posible declarar varios en una linea
		
		//**USAR CLASES EN JAVA**
		
		double raiz= Math.sqrt(9);     //se tiene que almacenar en un doble
		
		System.out.println("La raiz de "+9+" es "+raiz);
		
		/////////////////////////////////////////////////////////////////////////////////////
		
		
		float red=7.89f;   // siempre se pone el sufijo "f"
		
		int redondeo= Math.round(red);
		
		System.out.println("el numero "+red+" redondeado es "+redondeo);
		
		
		double red2=23.8;
		
		int redondeo2= (int) Math.round(red2);           //se puede "refundir" un valor de esta manera
		
		System.out.println("el numero "+red2+" redondeado es "+redondeo2);
		
		/////////////////////////////////////////////////////////////////////////////////////
		
		double base=3;
		
		double exp=4;
		
		double resultado= Math.pow(base, exp);
		
		System.out.println(base+" elevado a "+exp+" es igual a "+resultado);
		

	}

}
