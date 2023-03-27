package SomativaDiogo.Exercicio01;

import java.util.Scanner;

public class millennium {
    public void millennium() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe qual operação deseja fazer (adiçao =1; subtração =2; multiplicação 3; divisão=4; )");
        int operaçoes = sc.nextInt();
        System.out.println("Informe seu 1º número");
        // ler primeiro numero
        double numero1 = sc.nextDouble();
        // ler segundo valor
        System.out.println("Informe seu 2º número");
        double numero2 = sc.nextDouble();
        double total;
        // calcular operaçoes
        if (operaçoes == 1) {
            total = numero1 + numero2;
            System.out.println("O Valor da soma é " + total);
        } else if (operaçoes == 2) {
            total = numero1 - numero2;
            System.out.println("O Valor da subtração é " + total);
        } else if (operaçoes == 3) {
            total = numero1 * numero2;
            System.out.println("O Valor da multiplicação é " + total);
        } else if (operaçoes == 4) {
            total = numero1 / numero2;
            System.out.println("O Valor da divisão é " + total);
        } else {
            System.out.println("!!OPERAÇÃO INVALIDA!!");
        }

    }
}
