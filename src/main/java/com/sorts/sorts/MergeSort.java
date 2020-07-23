package com.sorts.sorts;

import com.sorts.domain.Nota;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        Nota[] classMorning = {
                new Nota("Bruno", 1.7),
                new Nota("Luiz", 3.3),
                new Nota("Ana", 7.6),
                new Nota("Julia", 2.9),
                new Nota("Julio", 0.9),
                new Nota("Alex", 5.9),
                new Nota("Marco", 4.1),
                new Nota("Andressa", 6.4),
                new Nota("Jonas", 8.3),
                new Nota("Pedro", 9.0),
                new Nota("Lucas", 10.0)
        };

        sort(classMorning, 0, classMorning.length, false);
        System.out.println();
        Arrays.stream(classMorning).map(nota -> nota.getName() + " - " + nota.getNota()).forEach(System.out::println);
    }

    private static void sort(Nota[] notas, int initial, int end, boolean sortByName) {
        int quantity = end - initial;
        if (quantity > 1) {
            int middle = (initial + end) / 2;

            System.out.println(quantity);
            System.out.println(initial + " " + end + " " + middle);
            System.out.println();

            sort(notas, initial, middle, sortByName);
            System.out.println(initial + " " + end + " " + middle);

            sort(notas, middle, end, sortByName);
            System.out.println(initial + " " + end + " " + middle);

            interlayer(notas, initial, middle, end, sortByName);
            System.out.println(initial + " " + end + " " + middle);
        }
    }

    private static void interlayer(Nota[] notas, int initial, int middle, int end, boolean sortByName) {
        Nota[] result = new Nota[end - initial];

        int actual = 0;
        int actual1 = initial;
        int actual2 = middle;

        while (actual1 < middle && actual2 < end) {
            Nota nota1 = notas[actual1];
            Nota nota2 = notas[actual2];

            if (sortByName) {
                if (nota1.getName().compareTo(nota2.getName()) < 0) {
                    result[actual] = nota1;
                    actual1++;
                } else {
                    result[actual] = nota2;
                    actual2++;
                }
            } else {
                if (nota1.getNota() < nota2.getNota()) {
                    result[actual] = nota1;
                    actual1++;
                } else {
                    result[actual] = nota2;
                    actual2++;
                }
            }
            actual++;
        }

        while (actual1 < middle) {
            result[actual++] = notas[actual1++];
        }

        while (actual2 < end) {
            result[actual++] = notas[actual2++];
        }

        if (actual >= 0) System.arraycopy(result, 0, notas, initial, actual);

    }
}
