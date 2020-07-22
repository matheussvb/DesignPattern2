package dslsEinterprete;

import visitor.ImpressoraVisitor;

public class Subtracao implements Expressao {
    private final Expressao esquerda;
    private final Expressao direita;

    public Subtracao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int valorEsquerda = esquerda.avalia();
        int valorDireita = direita.avalia();
        return valorEsquerda - valorDireita;
    }

    @Override
    public void aceita(ImpressoraVisitor impressora) {
        impressora.visitaSubtracao(this);
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }
}
