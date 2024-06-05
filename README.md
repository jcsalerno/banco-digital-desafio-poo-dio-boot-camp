# Banco Digital

Este projeto é uma aplicação simples de um banco digital desenvolvida em Java, utilizando os conceitos de Programação Orientada a Objetos (POO). O projeto foi criado para reforçar o conhecimento em POO e Java, através da implementação de funcionalidades básicas de um banco digital.

## Funcionalidades

- Criação de contas (corrente e poupança)
- Depósitos e saques
- Transferências entre contas
- Geração de extratos
- Persistência de dados em arquivos
- Autenticação de usuários

## Estrutura do Projeto

```plaintext
BancoDigital/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── bancodigital/
│   │   │           ├── model/
│   │   │           │   ├── Cliente.java
│   │   │           │   ├── Conta.java
│   │   │           │   ├── ContaCorrente.java
│   │   │           │   ├── ContaPoupanca.java
│   │   │           │   └── Operacao.java
│   │   │           ├── service/
│   │   │           │   ├── Autenticacao.java
│   │   │           │   ├── Banco.java
│   │   │           │   └── Persistencia.java
│   │   │           ├── util/
│   │   │           │   └── Extrato.java
│   │   │           └── Main.java
│
│
└── README.md
