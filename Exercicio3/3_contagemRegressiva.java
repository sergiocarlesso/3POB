import java.util.Scanner;

public class contagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero para a contagem regressiva: ");
        int n = sc.nextInt();
        
        do{
            System.out.println(n);
            n--;
        }
        while(n>=0);
        
        sc.close();
    }
}
