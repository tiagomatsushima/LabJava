import java.util.Scanner;

public class EntradaTeclado {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b; 
		System.out.printf("Informe o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Informe o segundo valor: ");
		b = ler.nextInt();
		
		System.out.printf("A soma de a + b é igual a " + (a + b));
		
	}
	
	
}
