import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra {
    PropostaAquisicao propostaAquisicao;

    public RequisicaoCompraLivro(String estado, LocalDate data, String oficio, PropostaAquisicao propostaAquisicao) {
        super(estado, data, oficio);
        this.propostaAquisicao = propostaAquisicao;
    }

    public PropostaAquisicao getPropostaAquisicao() {
        return propostaAquisicao;
    }
}
