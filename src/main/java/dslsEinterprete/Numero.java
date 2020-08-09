package dslsEinterprete;

import visitor.ImpressoraVisitor;
import visitor.Visitor;

public class Numero implements Expressao {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int avalia() {
        return this.numero;
    }

    @Override
    public void aceita(Visitor impressora) {

    }

    public void aceita(ImpressoraVisitor impressora) {
        impressora.visitaNumero(this);
    }

    public int getNumero() {
        return numero;
    }
}
