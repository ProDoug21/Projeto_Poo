package Repositorios;

import ClassesModelos.Produto;
import Excecoes.ProdutosException;

import java.util.ArrayList;
import java.util.Random;

public class RepositorioProduto implements IRepositorioProduto {

    private ArrayList<Produto> ListaDeProdutos;


    private static RepositorioProduto instancia;

    public static RepositorioProduto getInstancia(){
        if (instancia == null){
            instancia = new RepositorioProduto();
        }
        return instancia;
    }

    private RepositorioProduto(){
        ListaDeProdutos = new ArrayList<Produto>();
    }

    @Override
    public void CadastrarProduto(Produto produto) {

        ListaDeProdutos.add(produto);

    }

    @Override
    public ArrayList<Produto> listarprodutos() {
        ArrayList<Produto> produtoArrayList = RepositorioProduto.getInstancia().ListaDeProdutos;


        return produtoArrayList;
    }

    @Override
    public boolean ExisteProduto(int code) {
        for (Produto produto:ListaDeProdutos){
            if (produto!=null && produto.getCode()== code){
                return true;
            }
        }
        return false;
    }

    @Override
    public void RemoverProdutoPeloCode(int codigo) {
        for (Produto produto:ListaDeProdutos){
            if (produto!=null && produto.getCode()==codigo){
                ListaDeProdutos.remove(produto);
            }
        }

    }

    @Override
    public Produto[] ProdutosEmDestaque() {
         return new Produto[0];
    }

    @Override
    public Produto ConsultarProdutoPeloNome(String nome)throws ProdutosException {
        for (Produto produto:ListaDeProdutos){
            if (produto.getNome().equals(nome)){
                return produto;
            }
        }
        return null;
    }
}
