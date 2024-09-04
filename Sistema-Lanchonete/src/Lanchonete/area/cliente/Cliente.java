package Lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("ESCOLHENDO O LANCHE");
    }

    public void pagarConta() {
        consultarSaldoAplicativo();
        System.out.println("PAGANDO A CONTA");
    }

    private void consultarSaldoAplicativo() {
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }

    public void fazerPedido() {
        System.out.println("REALIZANDO PEDIDO");
    }

    public void pegarPedidoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALCAO");
    }
}
