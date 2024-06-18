package com.dio.designpatterns.padroes_projetos_spring.service;

import com.dio.designpatterns.padroes_projetos_spring.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void salvar(Cliente cliente);

    void excluir(Long id);

    void editar(Long id, Cliente cliente);
}
