package dslsEinterprete;

import visitor.ImpressoraVisitor;
import visitor.Visitor;

public interface Expressao {
    int avalia();
    void aceita(Visitor impressora);
}
