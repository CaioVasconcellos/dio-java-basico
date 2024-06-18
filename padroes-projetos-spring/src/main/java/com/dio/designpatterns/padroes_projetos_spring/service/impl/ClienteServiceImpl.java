package com.dio.designpatterns.padroes_projetos_spring.service.impl;

import com.dio.designpatterns.padroes_projetos_spring.model.Cliente;
import com.dio.designpatterns.padroes_projetos_spring.model.ClienteRepository;
import com.dio.designpatterns.padroes_projetos_spring.model.Endereco;
import com.dio.designpatterns.padroes_projetos_spring.model.EnderecoRepository;
import com.dio.designpatterns.padroes_projetos_spring.service.ClienteService;
import com.dio.designpatterns.padroes_projetos_spring.service.ViaCepService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;


@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Id não encontrado"));
    }

    @Override
    public void salvar(Cliente cliente) {
        salvarClienteComCep(cliente);
    }


    @Override
    public void excluir(Long id) {

    }

    @Override
    public void editar(Long id, Cliente cliente) {
        Optional<Cliente> idCliente = clienteRepository.findById(id);
        if (idCliente.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }


    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        //Caso não exista, integrar ViaCEP
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
