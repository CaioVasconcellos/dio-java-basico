package banco.dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Cliente {

    private static int CODIGO_PADRAO = 1;
    public int codigo;
    public String nome;
    public List <Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.codigo= CODIGO_PADRAO++;
        this.contas = new ArrayList<>();

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
