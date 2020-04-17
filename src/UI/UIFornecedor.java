package UI;

import ClassesModelos.Fornecedor;
import Controladores.Fachada;
import Excecoes.FornecedorException;

import java.util.Scanner;

public class UIFornecedor {
    static Scanner scanner = new Scanner(System.in);


    public void MenuFornecedor(){
        scanner = new Scanner(System.in);
        int opcao;


        System.out.println("Menu Fornecedor\n1 - Cadastrar Fornecedor \n2 - Consultar Fornecedor \n3 - Remover Fornecedor ");
        opcao = scanner.nextInt();


//======================================================================================================//
        switch (opcao){
            case 1:CadastrarFornecedor();
            break;

            case 2:ConsultarFornecedorPeloNome();
            break;

            case 3:RemoverFornecedorCode();
            break;

            default:
                System.out.println("Opção Inválida.");
                break;
        }
    }

    private void CadastrarFornecedor(){

        Fornecedor fornecedor = new Fornecedor();


        System.out.println("Informe Seu CNPJ:");
        fornecedor.setCNPJ(scanner.next());

        System.out.println("Informe Seu Nome Fantasia:");
        fornecedor.setNomeFantasia(scanner.next());

        System.out.println("Informe Seu Código de Fornecedor:");
        fornecedor.setCode(scanner.nextInt());

        System.out.println("Informe Sua Data de Abertura:");
        fornecedor.setDataDeAbertura(scanner.next());

        System.out.println("Informe o Nome Do Fornecedor:");
        fornecedor.setNome(scanner.next());

        System.out.println("Informe Seu Endereço:");
        fornecedor.setEndereco(scanner.next());

        System.out.println("Informe Seu Telefone de Contato:");
        fornecedor.setTelefone(scanner.next());






        try {

            Fachada.getInstancia().CadastrarFornecedor(fornecedor);
            System.out.println("Fornecedor Cadastrado Com Sucesso.");
        }catch (FornecedorException f){
            System.out.println(f.getMessage());

        }



    }

    private void ConsultarFornecedorPeloNome(){
        String nomeFantasia;

        System.out.println("Informe o Nome Fantasia Do Fornecedor Que Deseja Consultar");
        nomeFantasia = scanner.next();

        try {
           Fornecedor forn = Fachada.getInstancia().ConsultarFornecedorNomeFantasia(nomeFantasia);
            System.out.println("Nome Fornecedor: "+forn.getNome());
            System.out.println("Endereço Fornecedor: "+forn.getEndereco());
            System.out.println("Código Fornecedor: "+forn.getCode());
        }catch (FornecedorException m){
            System.out.println(m.getMessage());
        }

    }
    private void RemoverFornecedorCode(){
        int codigo;

        System.out.println("Digite o Código do Fornecedor a Ser Removido:");
        codigo = scanner.nextInt();

        try {
            Fachada.getInstancia().RemoverFornecedorPeloCodigo(codigo);
            System.out.println("Fornecedor Removido Com Sucesso.");
            System.out.println();
        }catch (FornecedorException d){
            System.out.println(d.getMessage());
        }


    }
}
