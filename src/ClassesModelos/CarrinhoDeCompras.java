package ClassesModelos;

public class CarrinhoDeCompras {
    private Cliente cliente;
    private String DataFechamentoDoPedido;
    private ItensDeCarrinho[] ConjuntoDeItens;


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDataFechamentoDoPedido() {
        return DataFechamentoDoPedido;
    }

    public void setDataFechamentoDoPedido(String dataFechamentoDoPedido) {
        DataFechamentoDoPedido = dataFechamentoDoPedido;
    }

    public ItensDeCarrinho[] getConjuntoDeItens() {
        return ConjuntoDeItens;
    }

    public void setConjuntoDeItens(ItensDeCarrinho[] conjuntoDeItens) {
        ConjuntoDeItens = conjuntoDeItens;
    }
}
