import java.util.Scanner;

public class resta_p2p13_1s21 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int f,c;
		System.out.println("INGRESEA EL NUMERO DE FILAS");
		f = teclado.nextInt();
		System.out.println("INGRESA EL NUMERO DE COLUMNAS");
		c = teclado.nextInt();

	int [][] MA = new int [f][c];
	int [][] MB = new int [f][c];
	int [][] MC = new int [f][c];
	int ff,fc;
	    for (ff=0; ff<f; ff++) {
	    for (fc=0; fc<c; fc++) {
	    	System.out.println("INGRESE EL VALOR PARA LA POSICION ["+ff+"]["+fc+"] ");
	    	MA[ff][fc] = teclado.nextInt();
	    }
	 }
	 
	 for (ff=0; ff<f; ff++) {
	 	for (fc=0; fc<c; fc++) {
	 	    System.out.println("INGRESE EL VALOR PARA LA POSICION ["+ff+"]["+fc+"] ");
	 	    MB [ff][fc] = teclado.nextInt();
	 	}
	}

	for (ff=0; ff<f; ff++) {
	    for (fc=0; fc<c; fc++) {
	    	MC [ff][fc] = MA [ff][fc] - MB [ff][fc];
	    }
	}

	for(ff=0; ff<f; ff++){
		for( fc=0; fc<c; fc++) {
			System.out.println("EL RESULTADO DE LA SUMA DE LA MATRIZ EN SU POSICION ["+ff+"]["+fc+"] es " + MC[ff][fc]);
		}
	  }
   }
}