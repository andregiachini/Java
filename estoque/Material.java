package estoque;

public class Material {
    private int codigo;
    private String nome;
    private int quantidadeEstoque;
    
    public Material(int codigo, String nome, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Material(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEstoque = 0;
    }
}
