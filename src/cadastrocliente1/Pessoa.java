
package cadastrocliente1;


public class Pessoa {
    
    //Atributos da classe pessoa
    private int id;
    private String Nome;
    private String CPF;
    private String Sexo;
    private String Endereco;
    private String Cidade;
    private String Estado;
    
    
    //Construtor
    public Pessoa(String Nome, String CPF, String Sexo, String Endereco, String Cidade, String Estado) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Sexo = Sexo;
        this.Endereco = Endereco;
        this.Cidade = Cidade;
        this.Estado = Estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
}
