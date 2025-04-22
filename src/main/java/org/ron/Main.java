package org.ron;

public class Main {
    public static void main(String[] args) {

        Cliente clienteRonard = new Cliente();
        clienteRonard.setNome("Ronard");

        Conta cc = new ContaCorrente(clienteRonard);
        Conta poupanca = new ContaPoupanca(clienteRonard);

        cc.depositar(150);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.depositar(75);
        cc.transferir(10, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}