import java.util.Scanner;

public class contarPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8]; 
        int contPares = 0; 

        for (int i = 0; i < 8; i++) { 
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            if (numeros[i] % 2 == 0) { 
                contPares++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + contPares);

        sc.close();
    }
}




