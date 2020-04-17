package Controladores;

import ClassesModelos.Produto;
import Excecoes.ProdutosException;

import java.util.ArrayList;

public interface IControladorProduto {
    public void CadastrarProduto(Produto produto) throws ProdutosException;

    public void RemoverProdutoPeloCodigo(int code)throws ProdutosException;

    public Produto ConsultarProdutoPeloNome(String nome) throws ProdutosException;

    public Produto[] PRODUTOS();

    public ArrayList<Produto> ListarProdutos();
}
