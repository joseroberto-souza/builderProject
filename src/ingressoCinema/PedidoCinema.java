package ingressoCinema;

public class PedidoCinema {
    private final String filme;
    private final String assento;
    private final String comboLanche;

    // Construtor visível apenas para o pacote/builder
    protected PedidoCinema(String filme, String assento, String comboLanche) {
        this.filme = filme;
        this.assento = assento;
        this.comboLanche = comboLanche;
    }

    public void exibirResumo() {
        System.out.println("--- RESUMO DO PEDIDO ---");
        System.out.println("Filme: " + filme);
        System.out.println("Assento: " + assento);
        System.out.println("Combo Lanche: " + comboLanche);
    }
}
