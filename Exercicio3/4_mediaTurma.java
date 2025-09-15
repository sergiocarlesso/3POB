import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos na turma: ");
        int alunos = sc.nextInt();

           double somaNotas = 0;
        for (int i = 1; i <= alunos; i++) {
            System.out.print("Digite a nota de um aluno: ");
            double nota = sc.nextDouble();
        
         somaNotas += nota;
                        }
       double mediaAlunos = somaNotas / alunos;

        System.out.print("A media da turma é: " + mediaAlunos);

        sc.close();
    }
}
