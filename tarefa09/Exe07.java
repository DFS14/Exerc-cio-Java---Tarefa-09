package tarefa09;

public class Exe07 {
public static void main(String[] args) {
		
	
for (int i = 1; i <= 10; i += 2) {
		double fatorial = fatorial(i);
		System.out.println("O fatorial de " + i + " é " + fatorial);
	}
}

public static double fatorial(int num) {
	double result = 1;
	for (int i = 2; i <= num; i++) {
		result *= i;
	}
	return result;
}
}
