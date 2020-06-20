package insertionsorttest;

import br.com.sorts.Item;
import br.com.sorts.insertionsort.InsertionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionSortTest {

    @Test
    void then_() {
        Item[] orderedItems = InsertionSort.insertionSort(Item.buildItems());

        Item firstItem = orderedItems[0];
        Item lastItem = orderedItems[5];

        assertEquals("Apple", firstItem.getDescription());
        assertEquals(669.00, firstItem.getPrice());
        assertEquals(21000.00, lastItem.getPrice());

        for (Item orderedItem : orderedItems) {
            System.out.printf("%d %s %s%n",
                    orderedItem.getPosition(),
                    orderedItem.getDescription(),
                    orderedItem.getPrice());
        }
    }
}
