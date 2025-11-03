package controle;

import dominio.Elevador;
import java.util.Scanner;

public class SimuladorElevador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de andares do prédio (exceto o térreo): ");
        int totalAndares = scanner.nextInt();

        Elevador elevador = new Elevador(totalAndares);

        int opcao;

        do {
            System.out.println("\n=== Menu do Elevador ===");
            System.out.println("1 - Subir andar");
            System.out.println("2 - Descer andar");
            System.out.println("3 - Exibir andar atual");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    elevador.subir();
                    break;
                case 2:
                    elevador.descer();
                    break;
                case 3:
                    elevador.exibirAndar();
                    break;
                case 4:
                    System.out.println("Encerrando simulador. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
