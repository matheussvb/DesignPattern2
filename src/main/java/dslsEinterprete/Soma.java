package dslsEinterprete;

import visitor.ImpressoraVisitor;

public class Soma implements Expressao {

    private final Expressao direita;
    private final Expressao esquerda;

    public Soma(Expressao esquerda, Expressao direita) {

        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public int avalia() {
        int valorEsquerda = esquerda.avalia();
        int valorDireita = direita.avalia();
        return valorEsquerda + valorDireita;
    }

    @Override
    public void aceita(ImpressoraVisitor impressora) {
        impressora.visitaSoma(this);
    }

    public Expressao getDireita() {
        return direita;
    }

    public Expressao getEsquerda() {
        return esquerda;
    }
}
