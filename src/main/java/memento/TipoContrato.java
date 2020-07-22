package memento;

public enum TipoContrato {

    NOVO("novo"),
    EM_ANDAMENTO("em_andamento"),
    ACERTADO("acertado"),
    CONCLUIDO("concluido");

    private String descricao;

    TipoContrato(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
