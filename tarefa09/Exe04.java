package tarefa09;
public class Exe04 {
public static void main(String[] args) {

float totalGrãos = 0;
float quantGrãos = 1;

for (int i = 1; i <= 64; i++) {
totalGrãos += quantGrãos;
quantGrãos *= 2;
	}
System.out.println("O total de grãos de trigo que se pode obter num tabuleiro de xadrez é: " + totalGrãos);
	}
}