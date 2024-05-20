package banco.servico;

import banco.dominio.Cliente;
import banco.dominio.Conta;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void extrato() {
        System.out.println("*** Extrato Conta Poupança ***");
        imprimirExtrato();
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }
}

