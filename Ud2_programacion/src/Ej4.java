import java.util.Scanner;

public class Ej4 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // Solicitamos los numeros
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = sc.nextInt();

        // Solicitamos el orden
        System.out.print("Ingresa el criterio de ordenamiento (1 para ascendente, 2 para descendente): ");
       int orden = sc.nextInt();

        // Ordenar los números 
        if (orden == 1) {        	
	            // 1= ascendente
	            if (num1 > num2) {
	                int aux = num1;
	                num1 = num2;
	                num2 = aux;
	            }

	            if (num2 > num3) {
	                int aux = num2;
	                num2 = num3;
	                num3 = aux;
	
	                if (num1 > num2) {
	                    int aux2 = num1;
	                    num1 = num2;
	                    num2 = aux2;
	                }
            }

            // Mostramos los números ordenados 
            System.out.println("Números ordenados de manera ascendente:");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            
        } else if (orden == 2) { // Este else If se podria suprimir e imprimir los numeros de num3 a num1 porque ya estan ordenados
            // 2 = descendente
            if (num3 > num2) {
                int aux = num3;
                num3 = num2;
                num2 = aux;
            }

            if (num2 > num1) {
                int aux = num2;
                num2 = num1;
                num1 = aux;

                if (num3 > num2) {
                    int aux2 = num3;
                    num3 = num2;
                    num2 = aux2;
                }
            }

            // Mostramos los números ordenados
            System.out.println("Números ordenados de manera descendente:");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        } else {
        	//si da a otra tecla deberia darle error
            System.out.println("Error orden no valido.");
        }

     
        sc.close();
		
	}
}
