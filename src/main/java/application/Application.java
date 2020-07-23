package application;

import br.com.sorts.Item;
import br.com.sorts.insertionsort.InsertionSort;
import br.com.sorts.selectionsort.SelectionSort;

public class Application {

    public static void main(String[] args) {
        Item[] items = Item.buildItems();

        SelectionSort.selectionSort(items);
        InsertionSort.insertionSort(items);
    }
}
