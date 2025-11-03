package dominio;

public class CaixaEletronico {
    private double saldo;

    public CaixaEletronico(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo.");
            return false;
        }
        if (valor % 10 != 0) {
            System.out.println("Saque deve ser em múltiplos de R$ 10.");
            return false;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque.");
            return false;
        }
        saldo -= valor;
        System.out.println("Saque realizado: R$ " + valor);
        return true;
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
