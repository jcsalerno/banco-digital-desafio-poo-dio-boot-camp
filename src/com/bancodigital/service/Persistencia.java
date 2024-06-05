package com.bancodigital.service;

import com.bancodigital.model.Conta;

import java.io.*;

public class Persistencia {
    public static void salvarConta(Conta conta) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(conta.getNumero() + ".dat"))) {
            oos.writeObject(conta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Conta carregarConta(String numero) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(numero + ".dat"))) {
            return (Conta) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
