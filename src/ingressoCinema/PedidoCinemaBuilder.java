package ingressoCinema;

public class PedidoCinemaBuilder implements PedidoBuilder {
    private String filme;
    private String assento;
    private String comboLanche = "Nenhum";

    @Override
    public PedidoBuilder definirFilme(String filme) {
        this.filme = filme;
        return this;
    }

    @Override
    public PedidoBuilder definirAssento(String assento) {
        this.assento = assento;
        return this;
    }

    @Override
    public PedidoBuilder comLanche(String combo) {
        this.comboLanche = combo;
        return this;
    }

    @Override
    public PedidoCinema construir() {
        // Validação básica de consistência (SRP)
        if (filme == null || assento == null) {
            throw new IllegalStateException("Filme e Assento são obrigatórios para fechar o pedido.");
        }
        return new PedidoCinema(filme, assento, comboLanche);
    }
}
