package Model;

public class Equipamento {
    private int id_equipamento;
    private String nome;
    private String quantidade;
    private String valor;
    private String categoria;
    private String estoque;
    //--------------------------------------------------------------
    public Equipamento(int id_equipamento, String nome, String quantidade, String valor, String categoria, String estoque) {
        this.id_equipamento = id_equipamento;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.categoria = categoria;
        this.estoque = estoque;
    }
    //--------------------------------------------------------------
    public int getId_equipamento() {
        return id_equipamento;
    }
    public String getNome() {
        return nome;
    }
    public String getQuantidade() {
        return quantidade;
    }
    public String getValor() {
        return valor;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getEstoque() {
        return estoque;
    }
    //--------------------------------------------------------------
}
