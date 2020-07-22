package dslsEinterprete;

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
}
