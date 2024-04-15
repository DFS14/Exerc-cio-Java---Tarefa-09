package tarefa09;
import java.util.Scanner;
public class Exe06 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    float soma = 0;
    int valor = 0;
    float numero;

    System.out.println("Digite um número positivo (ou um número negativo para parar):");
    numero = scanner.nextFloat();

    while (numero >= 0) {
        soma += numero;
        valor++;
        System.out.println("Digite outro número positivo (ou um número negativo para parar):");
        numero = scanner.nextFloat();
    }

    if (valor > 0) {
    	float media = soma / valor;
        System.out.println("O total do somatório é: " + soma);
        System.out.println("A média aritmética é: " + media);
        System.out.println("O total de valores lidos é: " + valor);
    } else {
        System.out.println("Nenhum número positivo foi fornecido.");
    }
}
}