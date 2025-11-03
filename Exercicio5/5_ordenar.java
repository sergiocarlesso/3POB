import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite um número inteiro: ");
            numeros.add(scanner.nextInt());
            
            System.out.print("Deseja adicionar outro número? (s/n): ");
            continuar = scanner.next();
        }

        Collections.sort(numeros);

        System.out.println("Lista ordenada:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
