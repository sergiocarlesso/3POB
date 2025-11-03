package dominio;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private String categoria;

    public Funcionario(String nome, double salarioBase, String categoria) {
        this.nome = nome;
package dominio;

public class Elevador {
    private int andarAtual;
    private int totalAndares;

    public Elevador(int totalAndares) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subindo para o andar " + andarAtual + ".");
        } else {
            System.out.println("Você já está no último andar.");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Descendo para o andar " + andarAtual + ".");
        } else {
            System.out.println("Você já está no térreo.");
        }
    }

    public void exibirAndar() {
        System.out.println("Andar atual: " + andarAtual);
    }
}
        this.categoria = categoria.toUpperCase();
    }

    public double calcularSalarioFinal() {
        double bonus = 0.0;
        switch (categoria) {
            case "A":
                bonus = salarioBase * 0.20;
                break;
            case "B":
                bonus = salarioBase * 0.10;
                break;
            case "C":
                bonus = 0.0;
                break;
            default:
                System.out.println("Categoria inválida, sem bônus aplicado.");
        }
        return salarioBase + bonus;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
