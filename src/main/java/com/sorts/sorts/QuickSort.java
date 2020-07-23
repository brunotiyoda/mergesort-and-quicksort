package com.sorts.sorts;

import com.sorts.domain.Nota;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        Nota[] notas = {
                new Nota("Bruno", 1.7),
                new Nota("Luiz", 3.3),
                new Nota("Julio", 0.9),
                new Nota("Julia", 2.9),
                new Nota("Lucas", 10.0),
                new Nota("Alex", 5.9),
                new Nota("Marco", 4.1),
                new Nota("Andressa", 6.4),
                new Nota("Jonas", 8.3),
                new Nota("Pedro", 9.0),
                new Nota("Ana", 7.6)
        };

        quickSort(notas, 0, notas.length);
        System.out.println();
        Arrays.stream(notas).map(nota -> nota.getName() + " - " + nota.getNota()).forEach(System.out::println);

        int found = search(notas, 9.0);
        System.out.println("Found at position: " + found);
    }

    private static void quickSort(Nota[] notas, int from, int to) {
        int elements = to - from; // Calcula tamanho do trecho.  número de elementos no trecho a ser ordenado

        if (elements > 1) {
            int pivo = partition(notas, from, to);
            quickSort(notas, from, pivo);
            quickSort(notas, pivo + 1, to);
        }

    }

    private static int partition(Nota[] notas, int inicial, int end) {
        int menoresEncontrados = 0;
        Nota pivo = notas[end - 1];

        for (int analisando = 0; analisando < end - 1; analisando++) {
            Nota atual = notas[analisando];
            if (atual.getNota() <= pivo.getNota()) {
                change(notas, analisando, menoresEncontrados);
                menoresEncontrados++;
            }
        }

        change(notas, end - 1, menoresEncontrados);

        return menoresEncontrados;
    }

    private static void change(Nota[] notas, int de, int para) {
        Nota nota1 = notas[de];
        Nota nota2 = notas[para];
        notas[para] = nota1;
        notas[de] = nota2;
    }

    private static int binarySearchPosition(Nota[] notas, int from, int to, double wanted) {
        System.out.println("Search " + wanted + " between " + from + " and " + to);

        if (from > to) {
            return -1;
        }

        int middle = (to + from) / 2;
        Nota nota = notas[middle];

        if (wanted == nota.getNota()) {
            return middle;
        }

        if (wanted < nota.getNota()) {
            return binarySearchPosition(notas, from, middle - 1, wanted); // left
        }

        return binarySearchPosition(notas, middle + 1, to, wanted); // right

    }

    private static int search(Nota[] notas, double wanted) {
        return binarySearchPosition(notas, 0, notas.length - 1, wanted);
    }
}
