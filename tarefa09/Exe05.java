package tarefa09;
import java.util.Scanner;
public class Exe05 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

double totalSoma = 0;

for (int i = 0; i < 15; i++) {
	System.out.println("Digite um número inteiro:");
	int num = scanner.nextInt();
	totalSoma += fatorial(num);
}

System.out.println("O total do somatório da fatorial dos valores lidos é: " + totalSoma);
}

public static double fatorial(int num) {
	double result = 1;
	for (int i = 2; i <= num; i++) {
		result *= i;
	}
	return result;
}
}
