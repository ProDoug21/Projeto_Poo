package Controladores;

import ClassesModelos.Produto;
import Excecoes.ProdutosException;
import Repositorios.IRepositorioProduto;
import Repositorios.RepositorioProduto;

import java.util.ArrayList;

public class ControladorProduto implements IControladorProduto {

    private IRepositorioProduto repositorioProduto;

    private static ControladorProduto instancia;

    protected static ControladorProduto getInstancia() {
        if (instancia == null) {
            instancia = new ControladorProduto();
        }
        return instancia;
    }

    private ControladorProduto() {

        repositorioProduto = RepositorioProduto.getInstancia();
    }

    @Override
    public void CadastrarProduto(Produto produto) throws ProdutosException {

        if (repositorioProduto.ExisteProduto(produto.getCode())) {
            throw new ProdutosException("Já existe um produto com o mesmo código.");
        } else {
            repositorioProduto.CadastrarProduto(produto);
        }

    }

    @Override
    public void RemoverProdutoPeloCodigo(int code) throws ProdutosException {
        if (repositorioProduto.ExisteProduto(code)) {
            repositorioProduto.RemoverProdutoPeloCode(code);
        } else {
            throw new ProdutosException("Esse Código Não Existe. ");
        }

    }

    @Override
    public Produto ConsultarProdutoPeloNome(String nome) throws ProdutosException {
        Produto produto = repositorioProduto.ConsultarProdutoPeloNome(nome);

        if (produto == null) {
            throw new ProdutosException("Nenhum produto foi encontrado com esse nome.");

        } else {
            return produto;
        }

    }

    @Override
    public Produto[] PRODUTOS() {
        return new Produto[0];
    }


    @Override
    public ArrayList<Produto> ListarProdutos() {
        ArrayList<Produto> produtoArrayList = repositorioProduto.listarprodutos();

        return produtoArrayList;
    }
}
