package Controladores;

import ClassesModelos.Cliente;
import ClassesModelos.Fornecedor;
import ClassesModelos.Produto;
import Excecoes.ClienteException;
import Excecoes.FornecedorException;
import Excecoes.ProdutosException;

import java.util.ArrayList;

public class Fachada implements IControladorCliente,IControladorFornecedor,IControladorProduto {
    private IControladorProduto controladorProduto;
    private IControladorFornecedor controladorFornecedor;
    private IControladorCliente controladorCliente;

    private static Fachada instancia;

    public static Fachada getInstancia(){
        if (instancia == null){
            instancia = new Fachada();
        }
        return instancia;
    }

    private Fachada(){
        controladorProduto = ControladorProduto.getInstancia();
        controladorFornecedor = ControladorFornecedor.getInstancia();
        controladorCliente = ControladorCliente.getInstancia();
    }

    @Override
    public void CadastrarCliente(Cliente cliente) throws ClienteException {
        controladorCliente.CadastrarCliente(cliente);

    }

    @Override
    public void RemoverClientePeloCpf(String cpf) throws ClienteException {
        controladorCliente.RemoverClientePeloCpf(cpf);

    }



    @Override
    public Cliente ConsultarClientePorCodigo(int code) throws ClienteException {
        return controladorCliente.ConsultarClientePorCodigo(code);

    }

    @Override
    public ArrayList<Cliente> ListarClientes(){
        return controladorCliente.ListarClientes();
    }

    @Override
    public boolean loginCliente(String senha, String nomeUsuario) throws ClienteException {
      return   controladorCliente.loginCliente(senha,nomeUsuario);
    }

    @Override
    public void CadastrarFornecedor(Fornecedor fornecedor) throws FornecedorException {
        controladorFornecedor.CadastrarFornecedor(fornecedor);

    }

    @Override
    public Fornecedor ConsultarFornecedorNomeFantasia(String nomeFantasia) throws FornecedorException {
        return controladorFornecedor.ConsultarFornecedorNomeFantasia(nomeFantasia);
    }

    @Override
    public void RemoverFornecedorPeloCodigo(int code) throws FornecedorException {
        controladorFornecedor.RemoverFornecedorPeloCodigo(code);

    }

    @Override
    public void CadastrarProduto(Produto produto) throws ProdutosException {
        controladorProduto.CadastrarProduto(produto);

    }

    @Override
    public void RemoverProdutoPeloCodigo(int code) throws ProdutosException {
        controladorProduto.RemoverProdutoPeloCodigo(code);

    }

    @Override
    public Produto ConsultarProdutoPeloNome(String nome) throws ProdutosException {
        return controladorProduto.ConsultarProdutoPeloNome(nome);
    }

    @Override
    public Produto[] PRODUTOS() {
        return new Produto[0];
    }

    @Override
    public ArrayList<Produto> ListarProdutos() {
        return null;
    }
}
