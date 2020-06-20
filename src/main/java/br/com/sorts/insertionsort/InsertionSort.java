package br.com.sorts.insertionsort;

import br.com.sorts.Item;

import static br.com.sorts.Change.change;

public class InsertionSort {

    private InsertionSort() {
        throw new IllegalStateException("Utility class");
    }

    public static Item[] insertionSort(Item[] items) {

        for (int actual = 1; actual < items.length; actual++) {
            int analyze = actual;

            while (analyze > 0 && items[analyze].getPrice() < items[analyze - 1].getPrice()) {
                change(items, analyze, analyze - 1);
                analyze--;
            }
        }

        return items;
    }

}
