package paq1;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=40, num2=0, num3=2, suma=0, resta=0;
		double num4=2.35, num5=12.5, resultDecimal=0; 
		
		 suma = num1+num2;
		System.out.println("La suma es: " + suma);
		
		resta = num3-num2;
		System.out.println ("La resta es: " + resta);
		
		resultDecimal = num5-num4*3;
		System.out.println("El resultado decimal es: " + resultDecimal);
		
		//Utilizando la clase decimalFormat
		
		/* DecimalFormat df = new DecimalFormat ("#.00"); 
		System.out.println("El resultado decimal es: " + df.format(resultDecimal));	
				
	    /*resultDecimal = num5-num4*3;
		System.out.println("El resultado decimal es: " + (double) Math.round(resultDecimal * 100d) / 100d);
		
			/* if (num1>num2) {
				System.out.println("El mayor es: " + num1);
			}else {
				System.out.println(num2 + " es mayor");
			} */


/*	boolean pares= true;
			
			while (numInicio>=numFin) {
				
				if (pares == true) {
				if (numInicio % 2 == 0) {
						System.out.print("son pares  ");
						System.out.println (numInicio);
				} 
					
					
				}else { 
					
					if (numInicio % 2 !=0) {
						System.out.print("son impares  ");
						System.out.println (numInicio); 
						
					} 
				}  
		
				 numInicio -=1;
			} */	
		
	}

}
