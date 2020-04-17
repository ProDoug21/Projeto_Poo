package Repositorios;

import ClassesModelos.Cliente;
import Excecoes.ClienteException;

import java.util.ArrayList;

public class RepositorioCliente implements IRepositorioCliente {
    private static RepositorioCliente instancia;
    private ArrayList<Cliente> listaClientes;


    public static RepositorioCliente getInstancia() {
        if (instancia == null) {
            instancia = new RepositorioCliente();
        }
        return instancia;
    }

    private RepositorioCliente() {
        listaClientes = new ArrayList<Cliente>();
    }



    @Override
    public void RemoverClientePeloCpf(String cpf) throws ClienteException {
        for (Cliente cliente:listaClientes){
            if (cliente.getCPF().equals(cpf)){
                listaClientes.remove(cliente);
            }
        }
    }

    @Override
    public boolean loginCliente(String senha, String nomeUser) throws ClienteException {

        for (Cliente cliente : listaClientes) {
            if (cliente.getNomeDeUsuario().equals(nomeUser) && cliente.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void CadastrarCliente(Cliente cliente) throws ClienteException {
        listaClientes.add(cliente);

    }

    @Override
    public Cliente ConsultarClientePorCodigo(int code) throws ClienteException {

        for (Cliente cliente : listaClientes) {
            if (cliente.getCode() == code) {
                return cliente;
            }
        }

        return null;
    }

    @Override
    public ArrayList<Cliente> ListarClientes() {

        ArrayList<Cliente> clienteArrayList = RepositorioCliente.getInstancia().listaClientes;

        return clienteArrayList;

    }

    @Override
    public boolean ExisteCliente(String cpf) {

        for (Cliente c : listaClientes) {
            if (c.getCPF().equals(cpf)) {
                return true;
            }
        }
        return false;
    }


}
