package banco.servico;

import banco.dominio.Cliente;
import banco.dominio.Conta;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirExtrato();
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                '}';
    }
}
