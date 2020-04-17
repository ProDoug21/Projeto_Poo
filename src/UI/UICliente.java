package UI;

import ClassesModelos.Cliente;
import Controladores.Fachada;
import Excecoes.ClienteException;

import java.util.ArrayList;
import java.util.Scanner;

public class UICliente {

    static Scanner s = new Scanner(System.in);

    public void MenuCliente() {

        int escolha;

        s = new Scanner(System.in);

        System.out.println("Menu Do Cliente\n1 - Cadastrar Cliente \n2 - Remover Cliente \n3 - Consultar Cliente \n4 - Listar Cliente");
        escolha = s.nextInt();

        switch (escolha) {
            case 1:
                CadastrarCliente();
                break;

            case 2:
                RemoverCliente();
                break;

            case 3:
                ConsultarCliente();
                break;

            case 4:
                ListarClientes();
                break;

            default:
                System.out.println("Opção Inválida.");
                break;


        }

    }

    private void CadastrarCliente() {
        Cliente c = new Cliente();

        System.out.println("Digite seu CPF:");
        c.setCPF(s.next());
        System.out.println("Digite seu Nome:");
        c.setNome(s.next());
        System.out.println("Digite seu Código:");
        c.setCode(s.nextInt());
        System.out.println("Digite sua Dta de Nascimento:");
        c.setDataDeNascimento(s.next());
        System.out.println("Digite seu Nome de Usuário:");
        c.setNomeDeUsuario(s.next());
        System.out.println("Digite sua Senha:");
        c.setSenha(s.next());
        System.out.println("Digite seu Telefone:");
        c.setTelefone(s.next());
        System.out.println("Informe seu Endereço:");
        c.setEndereco(s.next());


        try {
            Fachada.getInstancia().CadastrarCliente(c);
            System.out.println("Cliente Cadastrado Com Sucesso");
        } catch (ClienteException f) {
            System.out.println(f.getMessage());
        }


    }

    private void ConsultarCliente() {
        int codigo;
        System.out.println("Informe o Código do Cliente que deseja Consultar:");
        codigo = s.nextInt();

        try {
            Cliente cliente = Fachada.getInstancia().ConsultarClientePorCodigo(codigo);
            System.out.println("Nome do Cliente: " + cliente.getNome());
            System.out.println("Cpf do Cliente: " + cliente.getCPF());
            System.out.println("Dta de Nascimento: "+cliente.getDataDeNascimento());
            System.out.println("Endereço do Cliente: "+cliente.getEndereco());
        } catch (ClienteException m) {
            System.out.println(m.getMessage());
        }


    }

    private void RemoverCliente() {
        String Clientecpf;

        System.out.println("Informe o CPF do Cliente a ser Removido:");
        Clientecpf = s.next();

        try {
            Fachada.getInstancia().RemoverClientePeloCpf(Clientecpf);
            System.out.println("Cliente Removido Com Sucesso.");
        } catch (ClienteException g) {
            System.out.println(g.getMessage());
        }

    }

    private void ListarClientes() {


        ArrayList<Cliente> listaclientes = new ArrayList<Cliente>();

        listaclientes = Fachada.getInstancia().ListarClientes();

        System.out.println(listaclientes);

    }


}



