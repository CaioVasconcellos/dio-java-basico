package banco.servico;

import banco.dominio.Cliente;
import banco.dominio.Conta;

import java.util.ArrayList;
import java.util.List;

public class ClienteServico {

    List<Cliente> clientes = new ArrayList<>();

    public void aidicionarClientes(Cliente cliente){
        clientes.add(cliente);
    }

    public void adicionarContas(Cliente cliente,Conta conta){
        clientes.stream().filter(c -> c.equals(cliente)).findFirst().ifPresent(cliente1 -> cliente1.getContas().add(conta));
    }


    public void verContaPorNome(Cliente cliente){
        Cliente cliente1 = clientes.stream().filter(c -> c.equals(cliente)).findFirst().orElse(null);
        if(cliente1 != null) {
            List<Conta> contas = cliente1.getContas();
            System.out.println("Contas do cliente " + cliente.getNome() + ": " + contas);
        } else{
            System.out.println("Cliente nao encontrado");
        }
    }
}
