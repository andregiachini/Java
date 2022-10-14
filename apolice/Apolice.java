package apolice;

public class Apolice {
    int numApolice;
    String nomeSegurado;
    int idade;
    float valorPremio;
    int ultimoNumApolice = 0;

    public void Apolice(){
        this.ultimoNumApolice++;
        this.numApolice = this.ultimoNumApolice;

    }

    public void Apolice(String nomeSegurado, int idade, float valorPremio){
        this.ultimoNumApolice++;
        this.numApolice = this.ultimoNumApolice;
        this.nomeSegurado = nomeSegurado;
        this.valorPremio = valorPremio;


    }

    public void imprimir(){
        System.out.println("Número da apólice: " + this.numApolice);
        System.out.println("Nome do Segurado: " + this.nomeSegurado);
        System.out.println("Idade: " + this.idade);
        System.out.println("Valor Prêmio: " + this.valorPremio);

    }

    public void calcularPremio(){
        if (this.idade >= 18 && this.idade <= 25) {
            this.valorPremio = this.valorPremio * 1.2f;

        }else if (this.idade > 25 && this.idade <= 36) {
            this.valorPremio *= 1.15f; 
            
        }else if (this.idade > 36) {
            this.valorPremio *= 1.1f;
            
        }   
    }

    public float oferecerDesconto(String cidade){
        if (cidade == "Florianópolis") {
            this.valorPremio = this.valorPremio * 0.95f;

            
        }   else if (cidade == "Chapecó") {
            this.valorPremio = this.valorPremio * 0.94f;


        } else if (cidade == "Joaçaba") {
            this.valorPremio = this.valorPremio * 0.93f;


        } else if (cidade == "Joinville") {
            this.valorPremio *= 0.92f;

        }
        
        return this.valorPremio;
    }

    public void exibeUltimoNum(){
        System.out.println("Número da última apólice criada: " + ultimoNumApolice);

    }

    


}
