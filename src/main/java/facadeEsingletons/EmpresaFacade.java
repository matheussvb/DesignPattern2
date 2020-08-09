package facadeEsingletons;

public class EmpresaFacade {
    public Cliente buscaCliente(String cpf) {
        Cliente cliente = new ClienteDao().buscaPorCpf(cpf);
        return cliente;
    }

    public Fatura criaFatura(Cliente cliente, double valor) {
        Fatura fatura = new Fatura(cliente, valor);
        return fatura;
    }

    public Cobranca geraCobranca(Fatura fatura) {
        Cobranca cobranca = new Cobranca(TIPO.BOLETO, fatura);
        cobranca.emite;
        return cobranca;
    }

    public ContatoCliente fazContato(Cliente cliente, Cobranca cobranca) {
        ContatoCliente contatocliente = new ContatoCLiente(cliente, cobranca);
        contato.dispara();
        return contatocliente;
    }

}
