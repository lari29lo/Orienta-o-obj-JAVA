abstract class ContaBancaria {
    protected double saldo;
    protected String numeroConta;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);
}

class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String numeroConta) {
        super(numeroConta);
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String numeroConta) {
        super(numeroConta);
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

class TesteContas {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("123456");
        ContaPoupanca contaPoupanca = new ContaPoupanca("789012");

        contaCorrente.depositar(1000.0);
        contaPoupanca.depositar(500.0);

        contaCorrente.sacar(200.0);
        contaPoupanca.sacar(100.0);

        System.out.println("Saldo Conta Corrente: " + contaCorrente.saldo);
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.saldo);
    }
}