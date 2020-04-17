package ClassesModelos;


public class Fornecedor {
    private String CNPJ;
    private String NomeFantasia;
    private String Endereco;
    private String DataDeAbertura;
    private String telefone;
    private int code;
    private String nome;


    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        NomeFantasia = nomeFantasia;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getDataDeAbertura() {
        return DataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        DataDeAbertura = dataDeAbertura;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
