package Repositorios;

import ClassesModelos.Fornecedor;
import Excecoes.FornecedorException;

public interface IRepositorioFornecedor {
    public void cadastrarFornecedor(Fornecedor fornecedor)throws FornecedorException;

    public Fornecedor consultarFornecedorNomeFantasia(String nomeFantasia)throws FornecedorException;

    public boolean existeFornecedor(String cnpj);

    public boolean FornecedorCodigo(int codigo);

    public  void RemoverFornecedor(int code) throws FornecedorException;


}
