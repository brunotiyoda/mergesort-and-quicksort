package br.com.sorts;

public class SelectionSort {

    public Item[] ordination() {
        Item[] items = buildItems();

        for (int actual = 0; actual < items.length; actual++) {
            System.out.printf("I'm in %d%n", actual);

            int lower = SeekLowerValueOfItem.seekLowerPriceOfItem(items, actual, items.length);
            System.out.printf("Changing %d with %d%n", actual, lower);

            Item itemActual = items[actual];
            Item itemLower = items[lower];
            System.out.printf("Changing %s with %s%n", itemActual.getDescription(), itemLower.getDescription());

            items[actual] = itemLower;
            items[lower] = itemActual;
        }

        return items;
    }

    private Item[] buildItems() {
        return new Item[]{
                new Item(0, "Ferrari", 21000.00),
                new Item(1, "Apple", 669.00),
                new Item(2, "Computer", 2799.00),
                new Item(3, "BMW", 13000.0),
                new Item(4, "Mustang", 12000.0)
        };
    }

}
