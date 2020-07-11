package br.com.solid.tdd.exercicio5;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Conta Comum - Novo Saldo:");
            System.out.println(conta.getSaldo());
        }

        for (ContaDeEstudante conta : contasDeEstudante()) {
            conta.getMilhas();


            System.out.println("Conta Estudante - Novo Saldo:");
            System.out.println(conta.getMilhas());
        }
    }

    private static List<ContaDeEstudante> contasDeEstudante() {
        return Arrays.asList(contaDeEstudanteCom(100),contaDeEstudanteCom(150));
    }

    private static List<ContaComum> contasDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150));
    }

    private static ContaDeEstudante contaDeEstudanteCom(double amount) {
        ContaDeEstudante c = new ContaDeEstudante();
        c.deposita(amount);
        return c;
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }

}
