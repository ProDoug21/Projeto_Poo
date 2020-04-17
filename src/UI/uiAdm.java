package UI;

import java.util.Scanner;

public class uiAdm {
    static Scanner scanner =new Scanner(System.in) ;

    public void Menu(){
        scanner = new Scanner(System.in);
        int opcao;
        System.out.println("===== Menu Administração =====");
        System.out.println(" 1 - Cadastrar/Remover/Consultar Fornecedores.");
        System.out.println("2 - Remover/Consultar/Listar/Cadastrar Clientes.");
        System.out.println("3 - Cadastrar/Remover/Consultar/Listar Produtos.");
        System.out.println("4 - Listar Carrinho de Compras.");
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                UIFornecedor uiFornecedor = new UIFornecedor();
                uiFornecedor.MenuFornecedor();
                break;
            case 2:
                UICliente uiCliente = new UICliente();
                uiCliente.MenuCliente();
                break;
            case 3:
                UIProduto uiProduto = new UIProduto();
                uiProduto.MenuProduto();
                break;

        }

    }
}
