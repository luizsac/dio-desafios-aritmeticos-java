package one.digitalinnovation.desafio3;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ContagemRepetidaDeNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        SortedMap<Integer, Integer> numOcorrencias = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int numero = sc.nextInt();
            numOcorrencias.put(numero, numOcorrencias.containsKey(numero) ? numOcorrencias.get(numero) + 1 : 1);
        }

        numOcorrencias.forEach((numero, ocorrencias) -> System.out.printf("%d aparece %d vez(es)\n", numero, ocorrencias));

        sc.close();
    }

}
