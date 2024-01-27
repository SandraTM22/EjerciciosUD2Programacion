
public class Ej3 {
	public static void main(String[] args) {
		int contador = 0;
		
		for (int i = 1; i<=100;i++) {
				
		
			if(i%2 == 0) {
				System.out.println(i + " Este número es multiplo de 2");
				contador++;
			}
			if(i%3==0) {
				System.out.println(i + " Este número es multiplo de 3");
				contador++;
			}
							
		}
		
		System.out.println("Hay " + contador + " números multiplos de 2 o 3");

			
	}
}
