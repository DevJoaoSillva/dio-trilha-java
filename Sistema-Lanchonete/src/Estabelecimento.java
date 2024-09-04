import Lanchonete.Atendente;
import Lanchonete.area.cliente.Cliente;
import Lanchonete.atendimento.cozinha.Almoxarife;
import Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //acoes que nÃ£o precisam estarem disponiveis para toda a aplicaÃ§Ã£o
//        cozinheiro.lavarIngredientes();
//        cozinheiro.baterVitaminaLiquidificador();
//        cozinheiro.selecionarIngredientesVitamina();
//        cozinheiro.prepararLanche();
//        cozinheiro.prepararVitamina();
//        cozinheiro.prepararVitamina();

        //aÃ§Ãµes que estabelecimenot precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //aÃ§Ãµes que nao precisam estar disponivel para toda a aplicaÃ§Ã£o
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        //aÃ§Ãµes que somente o seu pacote cozinha precisa conhecer(default)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.pegarPedidoBalcao();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //aÃ§Ã£o que somente o seu pacote cozinha precisa conhcer(default)
        atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //nÃ£o deveria, mas o estabelecimento
        //ainda nÃ£o definiu normas de atendimento
        cliente.pegarPedidoBalcao();

        //esta aÃ§Ã£o Ã© muito sigilosa, que ter ser privada?
//        cliente.consultarSaldoAplicativo();
//
//        //ja pensou os clientes ouvindo que o gÃ¡s acabou
//        cozinheiro.pedirParaTrocarGas(atendente);
//        cozinheiro.pedirParaTrocarGas(almoxarife);
    }
}


