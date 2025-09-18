import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) { 
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = sc.nextInt();
        }
        
        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);

        sc.close();
    }
}
