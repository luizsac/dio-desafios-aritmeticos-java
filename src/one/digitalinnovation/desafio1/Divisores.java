package one.digitalinnovation.desafio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisores {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numeros = br.readLine().split(" ");
        int a = Integer.parseInt(numeros[0]); // divisor
        int b = Integer.parseInt(numeros[1]); // não divisor
        int c = Integer.parseInt(numeros[2]); // múltiplo
        int d = Integer.parseInt(numeros[3]); // não múltiplo
        int n = -1;

        br.close();

        for (int i = a; i <= c; i += a) { // a <= n <= c, se a é divisor, incrementar de a em a
            if (i % a == 0 && i % b != 0 && c % i == 0 && d % i != 0) {
                n = i;
                break;
            }
        }
        System.out.println(n);
    }

}
