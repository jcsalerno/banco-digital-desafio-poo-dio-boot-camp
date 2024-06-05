package com.bancodigital.util;

import com.bancodigital.model.Conta;

public class Extrato {
    public static void gerarExtrato(Conta conta) {
        System.out.println("Extrato da conta: " + conta.getNumero());
        // Implementar a lógica para exibir o extrato detalhado
    }
}
