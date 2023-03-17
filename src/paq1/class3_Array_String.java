package paq1;

public class class3_Array_String {

	public static void main(String[] args) {
		
		/*int [] vector1 = new int [5];
		
		vector1 [0]= 12;
		vector1 [1]= 23;
		vector1 [2]= 45;
		vector1 [3]= 56;
		vector1 [4]= 78;
		
		System.out.println ("Los numeros del primer vector son: ");
		
		for ( int indice=0; indice < vector1.length; indice++ ) {
			System.out.println (vector1 [indice]+ " "); 
		}*/
		
		
	/*	int [] vector2 = {1,2,3,4,5};
		
		for (int i=0; i<vector2.length; i++) {
			System.out.println (vector2[i] + " ");
		} */
		
		int [] vectorN = {1,2,3,4,5,60,80,12};
		int vectorX=50, suma=0;
		
		
		for (int i=0; i<vectorN.length; i++) {
			if (vectorN[i] > vectorX) {
				suma= suma + vectorN[i];
			}
			
		}
		System.out.println ("La suma es: "+ suma);
	}

}
