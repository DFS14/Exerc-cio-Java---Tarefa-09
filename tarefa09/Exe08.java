package tarefa09;
import java.util.Scanner;
public class Exe08 {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
float totalArea = 0;
String continueCalcular = "SIM";

      while (continueCalcular.equalsIgnoreCase("SIM")) {
          System.out.println("Digite o nome do cômodo:");
          String quartoName = scanner.nextLine();

          System.out.println("Digite a largura do cômodo:");
          float largura = scanner.nextFloat();

          System.out.println("Digite o comprimento do cômodo:");
          float comprimento = scanner.nextFloat();

          float quartoArea = largura * comprimento;
          totalArea += quartoArea;

          System.out.println("A área do " + quartoName + " é " + quartoArea + " metros quadrados.");

          System.out.println("Deseja continuar calculando novos cômodos? (SIM/NAO)");
          scanner.nextLine(); 
          continueCalcular = scanner.nextLine();
      }

      System.out.println("A área total da residência é: " + totalArea + " metros quadrados.");
  }

}