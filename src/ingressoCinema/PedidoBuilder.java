package ingressoCinema;

public interface PedidoBuilder {
    PedidoBuilder definirFilme(String filme);
    PedidoBuilder definirAssento(String assento);
    PedidoBuilder comLanche(String combo);
    PedidoCinema construir();
}
