package controle;

import dominio.CaixaEletronico;
import java.util.Scanner;

public class SimuladorCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo inicial do caixa: R$ ");
        double saldoInicial = scanner.nextDouble();

        CaixaEletronico caixa = new CaixaEletronico(saldoInicial);

        int opcao;
        do {
            System.out.println("\n=== Menu do Caixa Eletrônico ===");
            System.out.println("1 - Sacar");
            System.out.println("2 - Exibir saldo");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para saque (múltiplos de R$ 10): R$ ");
                    double valorSaque = scanner.nextDouble();
                    caixa.sacar(valorSaque);
                    break;
                case 2:
                    caixa.exibirSaldo();
                    break;
                case 3:
                    System.out.println("Encerrando o simulador. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
