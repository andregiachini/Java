package apolice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Apolice a1 = new Apolice();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do segurado: ");
        a1.nomeSegurado = s.nextLine();
        System.out.println("Digite a idade do segurado: ");
        a1.idade = s.nextInt();
        System.out.println("Digite o valor do prêmio: ");
        a1.valorPremio = s.nextFloat();
        System.out.println("DIgite a cidade: ");
        String cidade = s.nextLine();

        a1.calcularPremio();
        
        a1.imprimir();

        a1.oferecerDesconto(cidade);

        a1.imprimir();
    }
}
