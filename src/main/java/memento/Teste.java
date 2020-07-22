package memento;

import java.util.Calendar;

public class Teste {
    public static void main(String[] args) {

        Historico historico = new Historico();
        Contrato contrato = new Contrato(Calendar.getInstance(), "Matheus", TipoContrato.NOVO);
        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());


        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        Estado estadoAnterior = historico.pega(2);
        System.out.println(estadoAnterior.getContrato().getTipo());

    }
}
