package acampamento;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //Produto arrayListProduto[] = new Produto[10];

        int opcao = 10;
        while (opcao != 9) {
            

            System.out.println("\n");
            System.out.println("+--------------------------------------+");
            System.out.println("|                 MENU                 |");
            System.out.println("+--------------------------------------+");
            System.out.println(
                "| 1 - Cadastrar produto |\n" +
                "| 2 - Consultar estoque |\n" +
                "| 3 - Remover unidades |\n" +
                "| 4 - Adicionar unidades |\n" +
                "| 9 - Sair                            |"
            );
            System.out.println("+--------------------------------------+\n\n");

            Scanner s = new Scanner(System.in);
            opcao = s.nextInt();


            switch (opcao) {
            case 1: 

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 9  :

                break;
            default: System.out.println ("Resposta inválida");
            }
            
            
        }















    }
}