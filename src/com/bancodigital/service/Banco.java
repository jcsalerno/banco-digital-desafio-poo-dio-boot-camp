package com.bancodigital.service;

import com.bancodigital.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente getCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    // Outros métodos para gerenciar o banco
}
