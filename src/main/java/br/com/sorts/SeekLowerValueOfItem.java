package br.com.sorts;

public class SeekLowerValueOfItem {

    private SeekLowerValueOfItem() {
        throw new IllegalStateException("Utility class");
    }

    public static Integer seekLowerPriceOfItem(Item[] items, Integer firstItem, Integer end) {
        Integer lowerValue = firstItem;

        for (int actual = firstItem; actual < end; actual++) {
            if (items[actual].getPrice() < items[lowerValue].getPrice()) {
                lowerValue = actual;
            }
        }

        return lowerValue;
    }
}
