import java.util.ArrayList;
import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        double numero;

        while (true) {
            System.out.print("Digite um número (ou -1 para sair): ");
            numero = scanner.nextDouble();
            if (numero == -1) {
                break;
            }
            numeros.add(numero);
        }

        double soma = 0.0;
        for (double n : numeros) {
            soma += n;
        }

        double media = numeros.isEmpty() ? 0 : soma / numeros.size();

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}
