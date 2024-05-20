package banco.test;

import banco.dominio.Banco;
import banco.dominio.Cliente;
import banco.dominio.Conta;
import banco.servico.BancoServico;
import banco.servico.ClienteServico;
import banco.servico.ContaCorrente;
import banco.servico.ContaPoupanca;

public class Test {
    public static void main(String[] args) {

        Cliente cliente2 = new Cliente("Pedro");
        Cliente cliente3 = new Cliente("Mateus");
        Cliente cliente4 = new Cliente("Joelson");
        Cliente cliente1 = new Cliente("Julia");


        BancoServico bancoServico = new BancoServico();

        bancoServico.adicionarClienteLista(cliente1);
        bancoServico.verClientes();

        ClienteServico clienteServico = new ClienteServico();
        clienteServico.aidicionarClientes(cliente2);


        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        Conta cc2 = new ContaCorrente(cliente2);
        Conta poupanca2 = new ContaPoupanca(cliente2);

        cc.depositar(100);
        cc.transferir(100,poupanca2);
        cc.extrato();
        poupanca.extrato();
        cc2.extrato();
        poupanca2.extrato();


        clienteServico.adicionarContas(cliente2,cc2);
        clienteServico.adicionarContas(cliente2,poupanca2);
        clienteServico.verContaPorNome(cliente2);


    }
}
