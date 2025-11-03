import java.util.ArrayList;
import java.util.Scanner;

public class ContagemOcorrencias {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        System.out.print("Digite um número para contar as ocorrências: ");
        int numeroParaContar = scanner.nextInt();
        int contador = 0;
        for (int num : numeros) {
            if (num == numeroParaContar) {
                contador++;
            }
        }

        System.out.println("O número " + numeroParaContar + " aparece " + contador + " vez(es) na lista.");

        scanner.close();
    }
}
