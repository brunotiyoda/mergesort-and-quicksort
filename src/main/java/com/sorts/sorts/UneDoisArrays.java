package com.sorts.sorts;

import com.sorts.domain.Nota;

public class UneDoisArrays {

    public static void main(String[] args) {

        Nota[] classMorning = {
                new Nota("Bruno", 1.7),
                new Nota("Luiz", 3.3),
                new Nota("Julia", 7.6)
        };

        Nota[] classAfternoon = {
                new Nota("Ana", 2.9),
                new Nota("Marco", 4.1),
                new Nota("Andressa", 6.4),
                new Nota("Jonas", 8.3),
                new Nota("Pedro", 10.0)
        };

        Nota[] notas = une(classAfternoon, classMorning, true);
        for (Nota nota : notas) {
            System.out.println(nota.getName() + " - " + nota.getNota());
        }
    }

    private static Nota[] une(Nota[] class1, Nota[] class2, boolean sortByName) {
        int totalTurmaA = class1.length + class2.length;

        Nota[] result = new Nota[totalTurmaA];

        int positionClass1 = 0;
        int positionClass2 = 0;
        int actual = 0;

        while (positionClass1 < class1.length && positionClass2 < class2.length) {
            Nota nota1 = class1[positionClass1];
            Nota nota2 = class2[positionClass2];

            if (sortByName) {
                if (nota1.getName().compareTo(nota2.getName()) < 0) {
                    result[actual] = nota1;
                    positionClass1++;
                } else {
                    result[actual] = nota2;
                    positionClass2++;
                }
            } else {
                if (nota1.getNota() < nota2.getNota()) {
                    result[actual] = nota1;
                    positionClass1++;
                } else {
                    result[actual] = nota2;
                    positionClass2++;
                }
            }
            actual++;
        }

        while (positionClass1 < class1.length) {
            result[actual++] = class1[positionClass1++];
        }

        while (positionClass2 < class2.length) {
            result[actual++] = class2[positionClass2++];
        }

        return result;
    }

}
