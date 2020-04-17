package ClassesModelos;

import ClassesModelos.Produto;

public class ItensDeCarrinho {
    private int codeCompra;
    private Produto produto;
    private int QuantidadeDeProdutos;


    public int getCode() {
        return codeCompra;
    }

    public void setCode(int codeCompra) {
        this.codeCompra = codeCompra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeDeProdutos() {
        return QuantidadeDeProdutos;
    }

    public void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
        QuantidadeDeProdutos = quantidadeDeProdutos;
    }
}
