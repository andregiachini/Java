import javax.sound.sampled.SourceDataLine;

public class Main{
    public static void main(String[] args) {
        //EXERCICIO 013
        System.out.println("EXERCICIO 01");
        System.out.println("--------------------------------------------------------");
        System.out.println("Programação I");
        System.out.println("\t -Professora: Andressa Sebben");
        System.out.println("\t -Aluno: André Giachini");
        System.out.println("\t -Objetivo: \n\t\t O objetivo dessa disciplina é compreender os conceitos fundamentais\n\t\t do paradigma de programaçao orientada a objetos e aplicá-los no\n\t\t desenvolvimento de soluções de software.");
        System.out.println("\t -Turno: Noturno");

        System.out.println("--------------------------------------------------------");

        //EXERICIO 02
        System.out.println("EXERCICIO 02");
        System.out.println("--------------------------------------------------------");
        int x = 4;
        int y = 5;
        double j = 4.5;
        double k = 5.4;
        int soma = x + y;
        double soma2 = j + k;
        System.out.println("A soma dos números inteiros é: " + soma);
        System.out.println("A soma dos números de ponto flutuante é: " + soma2);
        System.out.println("--------------------------------------------------------");


        //Exercicio 03
        System.out.println("EXERCICIO 03");
        System.out.println("--------------------------------------------------------");

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " x " + 5 + " = " + i*5);
            
        }
        System.out.println("--------------------------------------------------------");

        //Exercicio 04
        System.out.println("EXERCICIO 04");
        System.out.println("--------------------------------------------------------");

        for (int i = 1; i < 11; i++) {
            System.out.print(i + " x " + 6 + " = " + i*6);
            System.out.println("\t\t" + i + " x " + 2 + " = " + i*2);
        }
        System.out.println("--------------------------------------------------------");



        //Exercicio 05
        System.out.println("EXERCICIO 05");
        System.out.println("--------------------------------------------------------");

        
        for (int i = 1; i < 11; i++) {
            if (i == 1) {
                System.out.println(i + " Java atrapalha muita gente");                
            }
            else {
                System.out.print(i + " Java ");

                for (int l = 1; l < i+1; l++) {
                    System.out.print("atrapalham ");             
                }

                System.out.println("muita gente");
            }
        }
        System.out.println("--------------------------------------------------------");

        //Exercicio 06
        System.out.println("EXERCICIO 06");
        System.out.println("--------------------------------------------------------");
        
        int contador = 0;
        for (int i = 2; i <= 100; i++) {
            boolean primo = true;
            if (contador == 15) {
                break;
            }

            for (int l = 2; l < i; l++) {
                if (i % l == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);
                contador++;
            }
        }



        System.out.println("--------------------------------------------------------");

        //Exercicio 07
        System.out.println("EXERCICIO 07");
        System.out.println("--------------------------------------------------------");


        for (int i = 100; i <= 200; i++) {
            boolean primo = true;
        

            for (int l = 2; l < i; l++) {
                if (i % l == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }



        System.out.println("--------------------------------------------------------");













    }
}