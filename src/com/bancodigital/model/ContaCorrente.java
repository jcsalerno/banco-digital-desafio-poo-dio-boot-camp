package com.bancodigital.model;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
        }
    }
}
