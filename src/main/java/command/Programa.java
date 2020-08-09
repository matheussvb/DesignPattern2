package command;

public class Programa {
    public static void main(String[] args) {

        Pedido p1 = new Pedido("Matheus", 50);
        Pedido p2 = new Pedido("Matheus2", 500);

        FilaDeTrabalho filaDeTrabalho = new FilaDeTrabalho();
        filaDeTrabalho.adiciona(new PagaPedido(p1));
        filaDeTrabalho.adiciona(new PagaPedido(p2));
        filaDeTrabalho.adiciona(new ConcluiPedido(p1));


    }
}
