package br.com.dio.desafio.dominio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Mentoria extends Conteudo {
    private LocalDate data;


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + getData() +
                '}';
    }

    public String getData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data != null ? data.format(formatter) : null;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
