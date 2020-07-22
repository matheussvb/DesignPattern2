package visitor;

import dslsEinterprete.*;

public interface Visitor {
    void visitaSoma(Soma soma);
    void visitaSubtracao(Subtracao subtracao);
    void visitaNumero(Numero numero);
    void visitaDivisao(Divisao divisao);
    void visitaMultiplicacao(Multiplicacao multiplicacao);

}
