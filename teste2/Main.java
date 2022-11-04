package teste2;

public class Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(); 
        Quadrado q2 = q1; 
        q1.exibeDados(); 
        q2.setLado(6); 
        q1.exibeDados(); 
        q1.setLado(10); 
        q2.exibeDados();
        q2.msg();
        q2.setLado(-1);
        q2.exibeDados();
        Quadrado.msg2();



        
    }
}
