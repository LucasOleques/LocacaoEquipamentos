package Model;
public class Cliente {
    private int id_cliente;
    private String nome;
    private String cpf;
    private String endereco;
    private int telefone;
    private String email;
    private String login;
    private String senha;
    //--------------------------------------------------------------
    public Cliente(int id_cliente , String nome , String cpf , String endereco , int telefone ,
                   String email , String login , String senha) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.login = login;
        this.senha = senha;

    }
    //--------------------------------------------------------------
    public int getId_cliente() {
        return id_cliente;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
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
    public String getLogin() {
        return login;
    }
    public String getSenha() { return senha; }
    //--------------------------------------------------------------
}
