package com.bancodigital.model;

import java.io.Serializable;

public abstract class Conta implements Operacao, Serializable {
    protected double saldo;
    protected String numero;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public void transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}
