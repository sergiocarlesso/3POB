package dominio;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: R$ " + valor);
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque realizado: R$ " + valor);
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Valor de saque deve ser positivo.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
