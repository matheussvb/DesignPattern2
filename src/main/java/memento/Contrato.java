package memento;

import java.util.Calendar;

public class Contrato {
    private Calendar data;
    private String cliente;
    private TipoContrato tipo;

    public Contrato(Calendar data, String cliente, TipoContrato tipo) {
        this.data = data;
        this.cliente = cliente;
        this.tipo = tipo;
    }

    public Estado salvaEstado(){
        return new Estado(new Contrato(this.data, this.cliente, this.tipo));
    }

    public void avanca() {
        if (this.tipo.equals(TipoContrato.NOVO)) {
            this.tipo = TipoContrato.EM_ANDAMENTO;
        } else if (this.tipo.equals(TipoContrato.EM_ANDAMENTO)) {
            this.tipo = TipoContrato.ACERTADO;
        } else if (this.tipo.equals(TipoContrato.ACERTADO)) {
            this.tipo = TipoContrato.CONCLUIDO;
        }
    }

    public Calendar getData() {
        return data;
    }

    public String getCliente() {
        return cliente;
    }

    public TipoContrato getTipo() {
        return tipo;
    }
}
