package UI;

import ClassesModelos.Fornecedor;
import ClassesModelos.Produto;
import Controladores.Fachada;
import Excecoes.FornecedorException;
import Excecoes.ProdutosException;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class UIProduto {

    static Scanner s = new Scanner(System.in);

    public void MenuProduto() {
        int opcao;
        s = new Scanner(System.in);

        System.out.println("Menu Produto \n1 - Cadastrar Produto \n2 - Remover Produto \n3 - Consultar Produto \n4 - Listar Produtos");
        opcao = s.nextInt();



        switch (opcao){
            case 1:CadastrarProduto();
            break;

            case 2:RemoverProduto();
            break;

            case 3:ConsultarProduto();
            break;

            case 4:ListarProduto();
            break;

        }
    }
    private void CadastrarProduto(){
        Produto produto = new Produto();
        Fornecedor n = new Fornecedor();

        System.out.println("Informe o nome do Produto:");
        produto.setNome(s.next());
        System.out.println("Informe a Quantidade em Estoque:");
        produto.setQuantidadeEmEstoque(s.nextInt());
        System.out.println("Informe o Código do Produto:");
        produto.setCode(s.nextInt());
        System.out.println("Informe a Descrição do Produto:");
        produto.setDescricao(s.next());

        //============= Fornecedor ==========================//
        System.out.println("Informe o nome do Fornecedor:");
        n.setNome(s.next());
        System.out.println("Informe o Nome Fantasia:");
        n.setNomeFantasia(s.next());
        System.out.println("Informe o Código do Fornecedor:");
        n.setCode(s.nextInt());
        System.out.println("Informe Dta de Abertura do Fornecedor:");
        n.setDataDeAbertura(s.next());
        System.out.println("Informe o Telefone do Fornecedor:");
        n.setTelefone(s.next());
        System.out.println("Informe o Cnpj:");
        n.setCNPJ(s.next());
        System.out.println("Informe o Endereço Fornecedor:");
        n.setEndereco(s.next());

        try {
            Fachada.getInstancia().CadastrarFornecedor(n);
            produto.setFornecedor(n);

        }catch (FornecedorException i){
            System.out.println(i.getMessage());
        }




            try {
                Fachada.getInstancia().CadastrarProduto(produto);
                System.out.println("Produto Cadastrado Com Sucesso");

            }catch (ProdutosException o){
                System.out.println(o.getMessage());
            }

    }

    private void RemoverProduto(){
        int codigo;
        System.out.println("Informe o Código do Produto a ser Removido:");
        codigo = s.nextInt();

        try {
            Fachada.getInstancia().RemoverProdutoPeloCodigo(codigo);
            System.out.println("Produto Removido com Sucesso.");
        }catch (ProdutosException p){
            System.out.println(p.getMessage());
        }

    }

    private void ConsultarProduto(){
        String nomeProduto;

        System.out.println("Informe o Nome do Produto que deseja Consultar:");
        nomeProduto = s.next();

        try {
           Produto produto =  Fachada.getInstancia().ConsultarProdutoPeloNome(nomeProduto);
            System.out.println("Descrição do Produto: "+produto.getDescricao());
            System.out.println("Fornecedor do Produto: "+produto.getFornecedor().getNomeFantasia());
            System.out.println("Quantidade em Estoque: "+produto.getQuantidadeEmEstoque());
        }catch (ProdutosException s){
            System.out.println(s.getMessage());
        }

    }
    private void ListarProduto(){
        ArrayList<Produto> produtoArrayList  = Fachada.getInstancia().ListarProdutos();

        System.out.println(produtoArrayList    );
    }
}
