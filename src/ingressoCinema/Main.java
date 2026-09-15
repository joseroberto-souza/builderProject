package ingressoCinema;

public class Main {
    public static void main(String[] args){
        PedidoBuilder builder = new PedidoCinemaBuilder();
        PedidoCinema meuPedido = builder.definirFilme("Homem Aranha").
                definirAssento("F32").comLanche("não").construir();
        meuPedido.exibirResumo();
    }
}
