package dominio;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private String categoria;

    public Funcionario(String nome, double salarioBase, String categoria) {
        this.nome = nome;
        this.salarioBase = salarioBase;
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
