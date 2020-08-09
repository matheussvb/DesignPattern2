package dslsEinterprete;

import visitor.ImpressoraVisitor;
import visitor.Visitor;

public class Divisao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Divisao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }

    @Override
    public int avalia() {
        int resultadoDaEsquerda = esquerda.avalia();
        int resultadoDaDireita = direita.avalia();
        return resultadoDaEsquerda / resultadoDaDireita;
    }

    @Override
    public void aceita(Visitor impressora) {

    }

    public void aceita(ImpressoraVisitor impressora) {
        impressora.visitaDivisao(this);
    }
}