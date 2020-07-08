package br.com.solid.tdd.exercicio3;

public class CalculadoraDePrecos {

    private final TabelaDePreco tabela;
    private final ServicoDeEntrega entrega;

    public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega) {

        this.tabela = tabela;
        this.entrega = entrega;
    }

    public double calcula(Compra produto) {

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = entrega.para(produto.getCidade());

        return produto.getValor() * (1 - desconto) + frete;

    }

}
