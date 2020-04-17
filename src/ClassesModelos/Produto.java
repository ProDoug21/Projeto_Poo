package ClassesModelos;

import ClassesModelos.Fornecedor;

public class Produto {
    private String nome;
    private int QuantidadeEmEstoque;
    private String Descricao;
    private int code;
    private Fornecedor fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEmEstoque() {
        return QuantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(final int quantidadeEmEstoque) {
        QuantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(final String descricao) {
        Descricao = descricao;
    }

    public int getCode() {
        return code;
    }

    public void setCode(final int code) {
        this.code = code;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(final Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
