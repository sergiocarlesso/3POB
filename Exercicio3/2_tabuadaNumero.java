import java.util.Scanner;

public class tabuadaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero para tirar a tabuada: ");
        int n = sc.nextInt();
        
        int i = 1;
        int tabuada = 0;
        while(i<=10){
            tabuada = n*i;
            System.out.println(tabuada);
          
            i++;
            }    

        sc.close();
    }
}
