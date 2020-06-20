import br.com.sorts.Item;
import br.com.sorts.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectionSortTest {

    @Test
    public void then_testSort() {
        SelectionSort selectionSort = new SelectionSort();
        Item[] orderedItems = selectionSort.ordination();

        Item firstItem = orderedItems[0];
        Item lastItem = orderedItems[4];

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
