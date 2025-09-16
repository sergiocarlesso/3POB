import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero primo: ");
        int primo1 = sc.nextInt();
        System.out.print("Digite o segundo numero primo: ");
        int primo2 = sc.nextInt();

        System.out.println("Números primos entre eles: ");
        for (int i= primo1; i<= primo2; i++) {
            if (VerificarPrimo(i)){
                System.out.println(i);
                
            }
        }
        sc.close();
    }

public static boolean VerificarPrimo(int i){
    for(int y=2; y<i; y++){
        if (i%y == 0){
            return false;
        }
    }
    return true;
}
}
