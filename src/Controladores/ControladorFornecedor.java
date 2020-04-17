package Controladores;

import ClassesModelos.Fornecedor;
import Excecoes.FornecedorException;
import Repositorios.IRepositorioFornecedor;
import Repositorios.RepositorioFornecedor;

public class ControladorFornecedor implements IControladorFornecedor {

    private IRepositorioFornecedor repositorioFornecedor;
    private static ControladorFornecedor instancia;

    protected static ControladorFornecedor getInstancia(){
        if (instancia == null){
            instancia = new ControladorFornecedor();
        }
        return instancia;
    }

    private ControladorFornecedor() {
        repositorioFornecedor = RepositorioFornecedor.getInstancia();
    }

    @Override
    public void CadastrarFornecedor(Fornecedor fornecedor) throws FornecedorException {
        if (repositorioFornecedor.existeFornecedor(fornecedor.getCNPJ())) {
            throw new FornecedorException("Já existe um fornecedor com esse CNPJ.");
        } else {
            repositorioFornecedor.cadastrarFornecedor(fornecedor);
        }
    }

    @Override
    public Fornecedor ConsultarFornecedorNomeFantasia(String nomeFantasia) throws FornecedorException {
        Fornecedor f = repositorioFornecedor.consultarFornecedorNomeFantasia(nomeFantasia);

        if (f == null) {
           throw new FornecedorException("Nome Fantasia Incorreto");

        } else {
            return f;
        }

    }

    @Override
    public void RemoverFornecedorPeloCodigo(int code) throws FornecedorException {
        if (repositorioFornecedor.FornecedorCodigo(code)){

            repositorioFornecedor.RemoverFornecedor(code);
        }
        else {
            throw new FornecedorException("Fornecedor não removido");
        }
    }

}