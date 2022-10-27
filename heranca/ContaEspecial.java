package heranca;

public class ContaEspecial extends Conta {

    protected double limite;
    protected double taxaManutencao;



     public ContaEspecial(int numero, double saldo, String nome, double limite, double taxaManutencao) {
        super(numero, saldo, nome);
        this.limite = limite;
        this.taxaManutencao = taxaManutencao;
    }



    

    @Override
    public void resumoExtrato() {
        super.resumoExtrato();
    }


    @Override
    public boolean sacar(double valorRetirar) {
        return super.sacar(valorRetirar);
    }
    
    @Override
    public void fazManutencao(){
        this.saldo = this.saldo - this.taxaManutencao;
    }





    public double getLimite() {
        return limite;
    }





    public void setLimite(double limite) {
        this.limite = limite;
    }





    public double getTaxaManutencao() {
        return taxaManutencao;
    }





    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }














}
