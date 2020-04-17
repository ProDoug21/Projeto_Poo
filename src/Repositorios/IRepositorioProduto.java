package Repositorios;

import ClassesModelos.Produto;
import Excecoes.ProdutosException;

import java.util.ArrayList;

public interface IRepositorioProduto {


    public void CadastrarProduto(Produto produto);

    public ArrayList<Produto> listarprodutos();

    public boolean ExisteProduto(int code);

    public void RemoverProdutoPeloCode(int codigo);

    public Produto[] ProdutosEmDestaque();

    public Produto ConsultarProdutoPeloNome(String nome) throws ProdutosException;



}
