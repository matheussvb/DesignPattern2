package command;

import java.util.Calendar;

public class Pedido {

    private String client;
    private double valor;
    private Status status;
    private Calendar dataFinalizacao;

    public Pedido(String client, double valor) {
        this.client = client;
        this.valor = valor;
        this.status = Status.NOVO;
    }

    public void paga() {
        this.status = Status.PAGO;
    }

    public void finaliza() {
        dataFinalizacao = Calendar.getInstance();
        this.status = Status.ENTREGUE;
    }
}
