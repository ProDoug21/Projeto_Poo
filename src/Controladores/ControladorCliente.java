package Controladores;

import ClassesModelos.Cliente;
import Excecoes.ClienteException;
import Repositorios.IRepositorioCliente;
import Repositorios.RepositorioCliente;

import java.util.ArrayList;

public class ControladorCliente implements IControladorCliente {

    private IRepositorioCliente repositorioCliente;

    private static ControladorCliente instancia;

    protected static ControladorCliente getInstancia() {
        if (instancia == null) {
            instancia = new ControladorCliente();
        }
        return instancia;
    }

    private ControladorCliente() {

        repositorioCliente = RepositorioCliente.getInstancia();
    }


    @Override
    public void CadastrarCliente(Cliente cliente) throws ClienteException {
        if (repositorioCliente.ExisteCliente(cliente.getCPF())) {
            throw new ClienteException("Já existe um cliente com esse CPF.");
        } else {
            repositorioCliente.CadastrarCliente(cliente);

        }
    }

    @Override
    public void RemoverClientePeloCpf(String cpf) throws ClienteException {
        if (repositorioCliente.ExisteCliente(cpf)){
            repositorioCliente.RemoverClientePeloCpf(cpf);
        }
        else {
            throw new ClienteException("Cliente Não Removido");
        }
    }


    @Override
    public Cliente ConsultarClientePorCodigo(int code) throws ClienteException {
        Cliente cliente = repositorioCliente.ConsultarClientePorCodigo(code);

        if (cliente == null) {
            throw new ClienteException("Nenhum cliente encontrado com esse código.");
        } else {
            return cliente;
        }
    }

    @Override
    public ArrayList<Cliente> ListarClientes() {
    ArrayList<Cliente> clientes = repositorioCliente.ListarClientes();
    return clientes;
    }

    @Override
    public boolean loginCliente(String senha, String nomeUsuario) throws ClienteException {
        if (!repositorioCliente.loginCliente(senha, nomeUsuario)) {
            throw new ClienteException("Senha ou Nome de Usuário Incorretos");
        } else {
            return repositorioCliente.loginCliente(senha, nomeUsuario);
        }
    }


}
