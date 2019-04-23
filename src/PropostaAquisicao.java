import java.time.LocalDate;

public class PropostaAquisicao {

    LocalDate data;
    Utilizador utilizador;

    public PropostaAquisicao(LocalDate data, Utilizador utilizador) {
        this.data = data;
        this.utilizador = utilizador;
    }

    public LocalDate getData() {
        return data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }
}
