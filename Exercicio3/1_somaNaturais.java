import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros a ser somado: ");
        int n = sc.nextInt();

        int somaNaturais = 0;
        for (int i = 1; i <= n; i++) {
            somaNaturais += i;
        }

     System.out.println("A soma dos numeros naturais é: " + somaNaturais);

     sc.close();
    }
}
