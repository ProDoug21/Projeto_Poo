package Repositorios;

import ClassesModelos.Cliente;
import Excecoes.ClienteException;

import java.util.ArrayList;

public interface IRepositorioCliente {

    public void RemoverClientePeloCpf(String cpf) throws ClienteException;

    public boolean loginCliente(String senha, String nomeUser)throws ClienteException;

    public void CadastrarCliente(Cliente cliente) throws ClienteException;

    public Cliente ConsultarClientePorCodigo(int code) throws ClienteException;

    public ArrayList<Cliente> ListarClientes();

    public boolean ExisteCliente(String cpf);
}
