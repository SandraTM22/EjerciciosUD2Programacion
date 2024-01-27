import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
				int numeroEntrada, i;
					
				do {
						System.out.println("Introduce un número positivo");
						
						numeroEntrada = sc.nextInt();	
						if(numeroEntrada <=0 ) {
							System.out.println("El número introducido no es positivo");
						}
						//Habria que considerar validar que se aún número para que no de error
						
						
					}while (numeroEntrada<=0);
						
					for (i=0; i <= 20; i++) {
						numeroEntrada++;
						System.out.println(numeroEntrada);
					}	
				sc.close();
	}

}
