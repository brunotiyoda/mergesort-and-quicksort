import br.com.sorts.Item;
import br.com.sorts.SeekLowerValueOfItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeekLowerValueOfItemTest {

    private final Item[] items = {
            new Item(0, "Car", 21000.00),
            new Item(1, "Apple", 669.00),
            new Item(2, "Computer", 2799.00),
            new Item(3, "Car", 13000.0),
            new Item(4, "Car", 12000.0)
    };

    @Test
    void then_seekLowerPriceOfItem() {
        Integer itemPosition = SeekLowerValueOfItem.seekLowerPriceOfItem(items, 0, items.length);

        assertEquals(itemPosition, items[1].getPosition());
    }

    @Test
    void then_seekLowerPriceOfItemChangePosition() {
        Integer itemPosition = SeekLowerValueOfItem.seekLowerPriceOfItem(items, 1, items.length);

        assertEquals(itemPosition, items[1].getPosition());
    }

    @Test
    void then_seekLowerPriceOfItemChangePosition2() {
        Integer itemPosition = SeekLowerValueOfItem.seekLowerPriceOfItem(items, 2, items.length);

        assertEquals(itemPosition, items[2].getPosition());
    }

    @Test
    void then_seekLowerPriceOfItemChangePosition3() {
        Integer itemPosition = SeekLowerValueOfItem.seekLowerPriceOfItem(items, 3, items.length);

        assertEquals(itemPosition, items[4].getPosition());
    }
}
