package com.bancodigital.service;

import java.util.HashMap;
import java.util.Map;

public class Autenticacao {
    private Map<String, String> usuarios;

    public Autenticacao() {
        usuarios = new HashMap<>();
        usuarios.put("admin", "senha123");
    }

    public boolean autenticar(String usuario, String senha) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(senha);
    }
}
