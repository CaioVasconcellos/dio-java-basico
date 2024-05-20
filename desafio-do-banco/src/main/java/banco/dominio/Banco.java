package banco.dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter

public class Banco {
    private String nome;
    private List<Cliente> clientes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(clientes, banco.clientes);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(clientes);
    }

    public Banco() {
        this.nome = "Banco SejaFeliz";
        this.clientes = new ArrayList<>();

    }

    }



