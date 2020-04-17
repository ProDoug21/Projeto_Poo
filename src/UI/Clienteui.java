package UI;

import ClassesModelos.Cliente;
import Controladores.Fachada;
import Excecoes.ClienteException;

import java.util.Scanner;

public class Clienteui {
    static Scanner scanner = new Scanner(System.in);

    public void MenuCliente(){
        int escolha;
        scanner = new Scanner(System.in);

        System.out.println("============== Menu Cliente =============");
        System.out.println("1 - Cliente Cadastrado");
        System.out.println("2 - Cliente Não Cadastrado");
        escolha = scanner.nextInt();

        switch (escolha){
            case 1:ClienteCadastrado();
            break;

            case 2:ClienteNaoCadastrado();
            break;

            default:
                System.out.println("Opção Inválida");
                System.out.println();
                break;

        }


    }
    private void ClienteCadastrado(){
        String senha;
        String nameUser;

        System.out.println("Digite seu Nome de Usuário;");
        nameUser = scanner.next();
        System.out.println("Digite sua Senha:");
        senha = scanner.next();

        try {
            Fachada.getInstancia().loginCliente(senha,nameUser);
            System.out.println();
            System.out.println("Bem Vindo Cliente");
        }catch (ClienteException r){
            System.out.println(r.getMessage());
        }

    }

    private void ClienteNaoCadastrado(){
        Cliente clienteNovo = new Cliente();

        System.out.println("Digite seu CPF:");
        clienteNovo.setCPF(scanner.next());
        System.out.println("Digite seu Nome:");
        clienteNovo.setNome(scanner.next());
        System.out.println("Digite seu Código:");
        clienteNovo.setCode(scanner.nextInt());
        System.out.println("Digite sua Dta de Nascimento:");
        clienteNovo.setDataDeNascimento(scanner.next());
        System.out.println("Digite seu Nome de Usuário:");
        clienteNovo.setNomeDeUsuario(scanner.next());
        System.out.println("Digite sua Senha:");
        clienteNovo.setSenha(scanner.next());
        System.out.println("Digite seu Telefone:");
        clienteNovo.setTelefone(scanner.next());
        System.out.println("Informe seu Endereço:");
        clienteNovo.setEndereco(scanner.next());
        try {
            Fachada.getInstancia().CadastrarCliente(clienteNovo);
            System.out.println("Cliente Cadastrado Com Sucesso");
        }catch (ClienteException q){
            System.out.println(q.getMessage());
        }

    }

}
