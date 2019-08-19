package gilded_rose;

import gildedRose.GildedRose;
import gildedRose.Item;
import org.junit.Assert;
import org.junit.Test;

import static java.util.Collections.singletonList;


public class GildedRoseTest {
    @Test
    public void should_quality_49_when_updateQuality_given_normal_item_sellIn_10_and_quality_is_50(){
        Item item = new Item("oocl full stack",10,50);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(49,item.getQuality());

    }
}
