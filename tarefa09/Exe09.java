package tarefa09;
import java.util.Scanner;
public class Exe09 {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
    int numero;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    System.out.println("Digite um número inteiro positivo (ou um número negativo para parar):");
    numero = scanner.nextInt();

    while (numero >= 0) {
        if (numero > max) {max = numero;}
        if (numero < min) {min = numero;}

        System.out.println("Digite outro número inteiro positivo (ou um número negativo para parar):");
        numero = scanner.nextInt();
    }

    if (max != Integer.MIN_VALUE && min != Integer.MAX_VALUE) {
        System.out.println("O maior valor informado foi: " + max);
        System.out.println("O menor valor informado foi: " + min);
    } else 
    {System.out.println("Nenhum número positivo foi fornecido.");}
    }}
