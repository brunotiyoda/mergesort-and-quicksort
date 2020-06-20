package br.com.sorts.selectionsort;

import br.com.sorts.Item;
import br.com.sorts.SeekLowerValueOfItem;

import static br.com.sorts.Change.change;

public class SelectionSort {

    private SelectionSort() {
        throw new IllegalStateException("Utility class");
    }

    public static Item[] selectionSort(Item[] items) {

        for (int actual = 0; actual < items.length; actual++) {
            System.out.printf("I'm in %d%n", actual);

            int lower = SeekLowerValueOfItem.seekLowerPriceOfItem(items, actual, items.length);

            change(items, actual, lower);
        }

        return items;
    }

}
