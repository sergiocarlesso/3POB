import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) { 
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i]; 
        }

        double media = soma / 4; 
        System.out.println("\nMédia das notas: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
