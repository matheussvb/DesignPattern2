package dslsEinterprete;

import visitor.Visitor;

public class PreFixaVisitor implements Visitor {

    public void visitaSoma(Soma soma) {
        System.out.print(" + ");
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        System.out.print(" ");
        soma.getDireita().aceita(this);
        System.out.print(")");        
    }

    public void visitaSubtracao(Subtracao subtracao) {
        System.out.print(" - ");
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        System.out.print(" ");
        subtracao.getDireita().aceita(this);
        System.out.print(")");
    }

    public void visitaNumero(Numero numero) {
        System.out.print(numero.getNumero());        
    }

    @Override
    public void visitaDivisao(Divisao divisao) {

    }

    @Override
    public void visitaMultiplicacao(Multiplicacao multiplicacao) {

    }
}