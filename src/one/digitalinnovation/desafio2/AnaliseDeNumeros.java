package one.digitalinnovation.desafio2;

import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            int n = leitor.nextInt();
            if (n % 2 == 0)
                pares++;
            else
                impares++;
            if (n > 0)
                positivos++;
            else if (n < 0)
                negativos++;
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }

}
