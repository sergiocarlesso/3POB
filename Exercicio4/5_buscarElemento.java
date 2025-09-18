import java.util.Scanner;

public class buscarElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10]; 

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nDigite um número para buscar no array: ");
        int busca = sc.nextInt();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == busca) {
                encontrado = true;
                posicao = i;
                break; 
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Número não encontrado.");
        }

        sc.close();
    }
}
