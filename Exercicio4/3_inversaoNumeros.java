import java.util.Scanner;

public class inversaoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6]; 

        for (int i = 0; i < 6; i++) { 
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = 5; i >= 0; i--) { 
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}
