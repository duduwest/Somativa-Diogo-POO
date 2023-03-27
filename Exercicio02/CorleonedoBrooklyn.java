package SomativaDiogo.Exercicio02;

import java.util.Scanner;

public class CorleonedoBrooklyn {
    public void corleonedoBrooklyn() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nº de natricula");
        int numMatricula = sc.nextInt();
        double decisao = numMatricula % 4;
        if (decisao == 0) {
            System.out.println("Time do Chris");
        } else if (decisao == 1) {
            System.out.println("Time do Greg");
        } else if (decisao == 2) {
            System.out.println("Time do Caruso");
        } else if (decisao == 3) {
            System.out.println("Time do Jerome");
        } else {
            System.out.println("VOCÊ NÃO SE ENCAIXA EM NENHUM TIME");
        }
        sc.close();
    }
}
