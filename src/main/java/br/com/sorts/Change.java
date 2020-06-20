package br.com.sorts;

public class Change {

    public Change() {
        throw new IllegalStateException("Utility class");
    }

    public static void change(Item[] items, int actual, int lower) {
        System.out.printf("Changing %d with %d%n", actual, lower);

        Item itemActual = items[actual];
        Item itemLower = items[lower];

        System.out.printf("Changing %s with %s%n", itemActual.getDescription(), itemLower.getDescription());

        items[actual] = itemLower;
        items[lower] = itemActual;
    }
}
