
//progrma que calcula una tabla de interes
public class Arrays_ejemplo {

	public static void main(String[] args) {
		
		double interes=0.10, acomulado=10000;
		
		double [][]saldo = new double[3][3];
		
		for(int i=0;i<3;i++) {
			
			saldo[0][i]=acomulado;
			acomulado=1000;
			
			for(int j=0;j<3;j++) {
				
				acomulado+=(acomulado*interes);
				
				saldo[i][j]=acomulado;
			}
			interes+=0.01;
		}
		
		for(double []dat:saldo) {
			
			for(double dat2:dat) {
				
				System.out.printf("  %.2f  |",dat2);
			}
			System.out.println("\n");
		}
	
	}

}
