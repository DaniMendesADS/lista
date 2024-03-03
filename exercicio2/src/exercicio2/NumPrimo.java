package exercicio2;
import java.util.Scanner;

public class NumPrimo {
	private boolean primo(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num%i == 0) {
				return false;
			}
			
		}
		return true;

}

	public int contPrimo(int inicio, int fim) {
		int contador = 0;
		for (int i = inicio; i <= fim; i++) {
			if (primo(i)) {
				contador++;
			}
		}
		return contador;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumPrimo obj = new NumPrimo();
		
		System.out.print("Digite o primeiro número do intervalo: ");
		int inicio = scanner.nextInt();
		
		System.out.print("Digite o segundo número do intervalo: ");
		int fim = scanner.nextInt();
		
		if (inicio >= fim) {
			System.out.println("O primeiro número deve ser menor do que o segundo!");
			return;
		}
		
		int resultado = obj.contPrimo(inicio,fim);
		System.out.println("Quantidade de números primos entre " + inicio + " e " + fim + " é igual a: " + resultado);
		
		scanner.close();
	}
}