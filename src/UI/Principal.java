package UI;

import ClassesModelos.Cliente;
import ClassesModelos.Fornecedor;
import ClassesModelos.Produto;
import Controladores.Fachada;
import Excecoes.ClienteException;
import Excecoes.FornecedorException;
import Excecoes.ProdutosException;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//=================================== Clientes ====================================================//
        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();

        cliente3.setNome("Thiago");
        cliente3.setNomeDeUsuario("th_jhow");
        cliente3.setDataDeNascimento("15/02/1994");
        cliente3.setCPF("88012045987");
        cliente3.setEndereco("Rua das Quintas");
        cliente3.setTelefone("12024589");
        cliente3.setSenha("jhow5333");
        cliente3.setCode(8812);



        cliente1.setNome("Jonatas");
        cliente1.setCPF("415264");
        cliente1.setNomeDeUsuario("jo_87");
        cliente1.setCode(4717);
        cliente1.setDataDeNascimento("14/02/1948");
        cliente1.setTelefone("47851201");
        cliente1.setEndereco("Bituca");
        cliente1.setSenha("jo7451");

        cliente2.setNome("Pedro Veloso");
        cliente2.setCPF("104896");
        cliente2.setNomeDeUsuario("peveloso_87");
        cliente2.setCode(4120);
        cliente2.setDataDeNascimento("14/02/1998");
        cliente2.setTelefone("36265014");
        cliente2.setEndereco("Feira Livre");
        cliente2.setSenha("pe43");

        cliente.setNome("Felipe");
        cliente.setCPF("47859621");
        cliente.setNomeDeUsuario("lipe_785");
        cliente.setCode(8952);
        cliente.setDataDeNascimento("14/02/1985");
        cliente.setTelefone("7485962");
        cliente.setEndereco("Condado");
        cliente.setSenha("li_784");

        try {
            Fachada.getInstancia().CadastrarCliente(cliente);
            Fachada.getInstancia().CadastrarCliente(cliente1);
            Fachada.getInstancia().CadastrarCliente(cliente2);
            Fachada.getInstancia().CadastrarCliente(cliente3);
        }catch (ClienteException b){
            System.out.println(b.getMessage());
        }

        //==================  Fornecedor ==========================================//
        Fornecedor fornecedor1 = new Fornecedor();
        Fornecedor fo = new Fornecedor();
        Fornecedor fornecedor2 = new Fornecedor();
        Fornecedor fornecedor3 = new Fornecedor();
        Fornecedor fornecedor4 = new Fornecedor();
        Fornecedor d = new Fornecedor();
        Fornecedor fp = new Fornecedor();
        Fornecedor u = new Fornecedor();

        u.setNomeFantasia("Samsung");
        u.setNome("Samsung Smartphones");
        u.setCode(1764);
        u.setCNPJ("7415863");
        u.setEndereco("Sergipe");
        u.setDataDeAbertura("15/09/1942");
        u.setTelefone("36260125");

        fp.setNomeFantasia("Lafarge");
        fp.setNome("Cimento Campeão");
        fp.setDataDeAbertura("10/04/1977");
        fp.setCode(7863);
        fp.setCNPJ("41208965");
        fp.setEndereco("Caaporã");
        fp.setTelefone("45631025");

        d.setNomeFantasia("Natura");
        d.setNome("Natura hidratante");
        d.setDataDeAbertura("04/12/1956");
        d.setCode(1020);
        d.setCNPJ("786512");
        d.setEndereco("Curitiba");
        d.setTelefone("36261020");


        fornecedor3.setCNPJ("741230");
        fornecedor3.setNomeFantasia("Nestlé");
        fornecedor3.setCode(5348);
        fornecedor3.setNome("Garoto");
        fornecedor3.setDataDeAbertura("10/14/1883");
        fornecedor3.setTelefone("36265544");
        fornecedor3.setEndereco("Vevey");

        fornecedor4.setCode(5240);
        fornecedor4.setNome("Eletrolux");
        fornecedor4.setNomeFantasia("Eletrolux");
        fornecedor4.setTelefone("36265410");
        fornecedor4.setCNPJ("875962563");
        fornecedor4.setDataDeAbertura("10/04/1919");
        fornecedor4.setEndereco("Estocolmo");



        fornecedor2.setCNPJ("775241");
        fornecedor2.setNomeFantasia("Votorantim");
        fornecedor2.setCode(1048);
        fornecedor2.setNome("Cimentaria");
        fornecedor2.setDataDeAbertura("10/14/1940");
        fornecedor2.setTelefone("74569899");
        fornecedor2.setEndereco("Belo Horizonte");


        fo.setCNPJ("785541");
        fo.setNomeFantasia("Bayer");
        fo.setCode(1465);
        fo.setNome("Currenta");
        fo.setDataDeAbertura("10/14/1966");
        fo.setTelefone("78946500");
        fo.setEndereco("Leverkusen");


        fornecedor1.setCNPJ("6969");
        fornecedor1.setNomeFantasia("Novartis");
        fornecedor1.setCode(6555);
        fornecedor1.setNome("Sandoz");
        fornecedor1.setDataDeAbertura("10/01/1947");
        fornecedor1.setTelefone("74105287");
        fornecedor1.setEndereco("Suiça");


        try {
            Fachada.getInstancia().CadastrarFornecedor(fornecedor4);
            Fachada.getInstancia().CadastrarFornecedor(fornecedor2);
            Fachada.getInstancia().CadastrarFornecedor(fo);
            Fachada.getInstancia().CadastrarFornecedor(fornecedor1);
            Fachada.getInstancia().CadastrarFornecedor(fornecedor3);
            Fachada.getInstancia().CadastrarFornecedor(d);
            Fachada.getInstancia().CadastrarFornecedor(fp);
            Fachada.getInstancia().CadastrarFornecedor(u);

        } catch (FornecedorException z) {
            System.out.println(z.getMessage());

        }

        //================================ Fornecedor Produtos =================================================================//

        Fornecedor fornecedorp = new Fornecedor();
        Fornecedor fornecedorproduto = new Fornecedor();
        Fornecedor fornecedorw = new Fornecedor();
        Fornecedor fornecedorprodutoc = new Fornecedor();
        Fornecedor fornecedorproduto3 = new Fornecedor();

        fornecedorprodutoc.setCNPJ("458962148");
        fornecedorprodutoc.setNomeFantasia(" Roteadores");
        fornecedorprodutoc.setNome("Cisco");
        fornecedorprodutoc.setCode(7450);
        fornecedorprodutoc.setEndereco("California");
        fornecedorprodutoc.setTelefone("36264789");
        fornecedorprodutoc.setDataDeAbertura("10/12/1984");

        fornecedorw.setNomeFantasia("Havan");
        fornecedorw.setNome("Havan Loja Departamentos");
        fornecedorw.setDataDeAbertura("26/06/1986");
        fornecedorw.setCNPJ("526394162");
        fornecedorw.setCode(154963);
        fornecedorw.setTelefone("36265102");
        fornecedorw.setEndereco("Brusque");


        fornecedorp.setNomeFantasia("InterCement");
        fornecedorp.setNome(" Cimpor");
        fornecedorp.setCNPJ("87526320");
        fornecedorp.setCode(1402098);
        fornecedorp.setTelefone("22345589");
        fornecedorp.setDataDeAbertura("14/09/1985");
        fornecedorp.setEndereco("São Paulo");

        fornecedorproduto3.setNome("Britânia");
        fornecedorproduto3.setDataDeAbertura("15/05/1956");
        fornecedorproduto3.setEndereco("Curitiba - PR");
        fornecedorproduto3.setCNPJ("41268527");
        fornecedorproduto3.setNomeFantasia("BritâniaEletrodomesticos");
        fornecedorproduto3.setTelefone("36265541");
        fornecedorproduto3.setCode(15328);




        fornecedorproduto.setNomeFantasia("Avon");
        fornecedorproduto.setNome(" Avon Cosméticos");
        fornecedorproduto.setCode(254196);
        fornecedorproduto.setCNPJ("45239866");
        fornecedorproduto.setDataDeAbertura("14/03/1984");
        fornecedorproduto.setEndereco("Londres");
        fornecedorproduto.setTelefone("36265544");


        try {
            Fachada.getInstancia().CadastrarFornecedor(fornecedorproduto3);
            Fachada.getInstancia().CadastrarFornecedor(fornecedorp);
            Fachada.getInstancia().CadastrarFornecedor(fornecedorprodutoc);
            Fachada.getInstancia().CadastrarFornecedor(fornecedorw);
            Fachada.getInstancia().CadastrarFornecedor(fornecedorproduto);

        } catch (FornecedorException x) {
            System.out.println(x.getMessage());
        }

        Produto p = new Produto();
        Produto produto = new Produto();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();

        p.setNome("Cimento");
        p.setQuantidadeEmEstoque(60);
        p.setCode(2065);
        p.setDescricao("Saco de 50kg de cimento");
        p.setFornecedor(fornecedorp);


        produto.setNome("Hidratante");
        produto.setCode(4510);
        produto.setQuantidadeEmEstoque(45);
        produto.setDescricao("Hidratante 200ml");
        produto.setFornecedor(fornecedorproduto);


        produto1.setNome("Ducha");
        produto1.setQuantidadeEmEstoque(22);
        produto1.setDescricao("Conforto no Banho");
        produto1.setCode(1025);
        produto1.setFornecedor(fornecedorw);


        produto2.setNome("Roteador");
        produto2.setQuantidadeEmEstoque(50);
        produto2.setCode(120452);
        produto2.setDescricao("Roteador Cisco");
        produto2.setFornecedor(fornecedorprodutoc);


        produto3.setCode(142598);
        produto3.setNome("Secador");
        produto3.setQuantidadeEmEstoque(15);
        produto3.setDescricao("Secador Bivolt");
        produto3.setFornecedor(fornecedorproduto3);

        produto4.setNome("MáquinaRoupas");
        produto4.setQuantidadeEmEstoque(20);
        produto4.setCode(154863);
        produto4.setDescricao("Máquina Eletrolux");
        produto4.setFornecedor(fornecedor4);





        try {
            Fachada.getInstancia().CadastrarProduto(produto4);
            Fachada.getInstancia().CadastrarProduto(produto3);
            Fachada.getInstancia().CadastrarProduto(produto1);
            Fachada.getInstancia().CadastrarProduto(p);
            Fachada.getInstancia().CadastrarProduto(produto);
            Fachada.getInstancia().CadastrarProduto(produto2);
        } catch (ProdutosException a) {
            System.out.println(a.getMessage());
        }
     //====================================================================================================//

        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            System.out.println();

            System.out.println("Escolha uma opção \n1 - Menu Administração \n2 - Menu Cliente");
            escolha = scanner.nextInt();


            switch (escolha) {
                case 1:
                    uiAdm uiAdm = new uiAdm();
                    uiAdm.Menu();
                    break;

                case 2:
                    Clienteui graficaCliente = new Clienteui();
                    graficaCliente.MenuCliente();
                    break;

                default:
                    System.out.println("Opção Inválida");

            }


        } while (escolha != 0);

    }

}
