package acampamento;


public class Produto {
    private String nome;
    private float valor;
    private int quantidade;


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public boolean verificarDisponibilidade(int qtde){
        if (this.quantidade == qtde) {
            return true;
        } else{
            return false;
        }
    }

    public void adicionarUnidades(int qtde){
        this.quantidade += qtde;
    }

    public boolean removerUnidades(int qtde){
        if (verificarDisponibilidade(qtde)){
            this.quantidade -= qtde;
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade + "]";
    }


}
