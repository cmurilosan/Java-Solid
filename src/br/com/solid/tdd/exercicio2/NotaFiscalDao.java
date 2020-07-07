package br.com.solid.tdd.exercicio2;

public class NotaFiscalDao implements AcaoAposGerarNota{

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Salva nf no banco");
//        A implementação aqui de exemplo é o sysout, mas na prática, é o código que acessa o banco de dados etc.

    }
}
