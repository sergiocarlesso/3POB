package controle;

import dominio.Funcionario;
import java.util.Scanner;

public class GerenciadorFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário base: R$ ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine();  

        System.out.print("Digite a categoria (A, B ou C): ");
        String categoria = scanner.nextLine().toUpperCase();

        Funcionario funcionario = new Funcionario(nome, salarioBase, categoria);
        double salarioFinal = funcionario.calcularSalarioFinal();

        System.out.printf("Salário final do funcionário %s (categoria %s): R$ %.2f%n",
                funcionario.getNome(), funcionario.getCategoria(), salarioFinal);

        scanner.close();
    }
}
