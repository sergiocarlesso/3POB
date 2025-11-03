package controle;

import dominio.Aluno;
import java.util.Scanner;

public class GerenciadorAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double nota;

        System.out.print("Digite o nome do aluno: ");
        nome = scanner.nextLine();

        while (true) {
            System.out.print("Digite a nota do aluno (0 a 10): ");
            nota = scanner.nextDouble();

            Aluno aluno = new Aluno(nome, nota);
            if (aluno.validarNota()) {
                System.out.printf("Aluno %s está %s.%n", aluno.getNome(), aluno.classificarAluno());
                break;
            } else {
                System.out.println("Nota inválida, digite novamente.");
            }
        }

        scanner.close();
    }
}
