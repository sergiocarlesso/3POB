import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";
    
        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            System.out.print("Deseja adicionar outro número? (s/n): ");
            continuar = scanner.next();
        }

        System.out.println("Números digitados:");
        for (int n : numeros) {
            System.out.println(n);
        }
        
        scanner.close();
    }
}
