package br.com.solid.tdd.exercicio1;

public enum Cargo {

    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new DezOuVintePorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
