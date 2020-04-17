package Repositorios;

import ClassesModelos.Fornecedor;
import Excecoes.FornecedorException;

import java.util.ArrayList;

public class RepositorioFornecedor implements IRepositorioFornecedor {
    private ArrayList<Fornecedor> listaFornecedores;

    private static RepositorioFornecedor instancia;

    public static RepositorioFornecedor getInstancia() {
        if (instancia == null) {
            instancia = new RepositorioFornecedor();
        }
        return instancia;
    }

    private RepositorioFornecedor() {
        listaFornecedores = new ArrayList<Fornecedor>(1000);
    }

    @Override
    public void cadastrarFornecedor(Fornecedor fornecedor) throws FornecedorException {

        listaFornecedores.add(fornecedor);
    }

    @Override
    public Fornecedor consultarFornecedorNomeFantasia(String nomeFantasia) throws FornecedorException {

        for (Fornecedor fornecedor : listaFornecedores) {
            if (fornecedor.getNomeFantasia().equals(nomeFantasia)) {
                return fornecedor;
            }
        }
        return null;
    }

    @Override
    public boolean existeFornecedor(String cnpj) {
        for (Fornecedor fornecedor:listaFornecedores){
            if (fornecedor.getCNPJ().equals(cnpj)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean FornecedorCodigo(int codigo) {
        for (Fornecedor f:listaFornecedores){
            if (f.getCode() == codigo){
                listaFornecedores.remove(f);
                return true;
            }
        }
        return false;
    }

    @Override
    public void RemoverFornecedor(int code) throws FornecedorException {
        for (Fornecedor fornecedor : listaFornecedores) {
            if (fornecedor.getCode() == code) {
                listaFornecedores.remove(fornecedor);
            }
        }


    }
}

