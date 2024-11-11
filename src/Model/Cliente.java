package Model;

public class Cliente {
    private String nome;
    private int cpf;
    private int data_nascimento;
    private String endereco;
    private int telefone;
    private String email;
    //--------------------------------------------------------------
    public Cliente(String nome, int cpf, int data_nascimento, String endereco, int telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    //--------------------------------------------------------------
    public String getNome() {
        return nome;
    }
    public int getCpf() {
        return cpf;
    }
    public int getData_nascimento() {
        return data_nascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    //--------------------------------------------------------------
}
