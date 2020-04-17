package Controladores;

import ClassesModelos.Cliente;
import Excecoes.ClienteException;

import java.util.ArrayList;

public interface IControladorCliente {

    public void  CadastrarCliente(Cliente cliente) throws ClienteException;

    public void RemoverClientePeloCpf(String cpf) throws ClienteException;

    public Cliente ConsultarClientePorCodigo(int code) throws ClienteException;

    public ArrayList<Cliente> ListarClientes();

    public boolean loginCliente(String senha, String nomeUsuario)throws ClienteException;


}
