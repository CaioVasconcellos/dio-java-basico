package banco.servico;

import banco.dominio.Banco;
import banco.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;

public class BancoServico {

    Banco banco = new Banco();

    public void verClientes(){
        List<Cliente> clientes = banco.getClientes();
        System.out.println(clientes);
    }

    public void adicionarClienteLista(Cliente cliente){
        List<Cliente> clientes = banco.getClientes();
        clientes.add(cliente);
        banco.setClientes(clientes);
    }

    public List<Cliente> retornarListaClientes(){
        List<Cliente> clientes = banco.getClientes();
        return new ArrayList<>(clientes);
    }
}
