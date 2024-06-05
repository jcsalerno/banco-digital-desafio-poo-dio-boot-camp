package com.bancodigital;

import com.bancodigital.model.Conta;
import com.bancodigital.model.ContaCorrente;
import com.bancodigital.model.ContaPoupanca;
import com.bancodigital.service.Banco;
import com.bancodigital.service.Autenticacao;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Banco banco = new Banco();
    private static Autenticacao autenticacao = new Autenticacao();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Implementar lógica de depósito
                    break;
                case 2:
                    // Implementar lógica de saque
                    break;
                case 3:
                    // Implementar lógica de transferência
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
