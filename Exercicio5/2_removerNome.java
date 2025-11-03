import java.util.ArrayList;
import java.util.Scanner;

public class RemoverNome {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
        }

        System.out.print("Digite o nome que deseja remover: ");
        String nomeParaRemover = scanner.nextLine();

        if (nomes.remove(nomeParaRemover)) {
            System.out.println("Nome removido com sucesso.");
        } 
        else {
            System.out.println("Nome não encontrado na lista.");
        }

        System.out.println("Lista atualizada de nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
