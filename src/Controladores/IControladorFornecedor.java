package Controladores;

import ClassesModelos.Fornecedor;
import Excecoes.FornecedorException;

public interface IControladorFornecedor {

    public void CadastrarFornecedor(Fornecedor fornecedor)throws FornecedorException;

    public Fornecedor ConsultarFornecedorNomeFantasia(String nomeFantasia)throws FornecedorException;

    public void RemoverFornecedorPeloCodigo(int code)throws FornecedorException;

}
