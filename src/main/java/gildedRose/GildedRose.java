package gildedRose;

import java.util.List;

public class GildedRose {
   private List<Item> items;

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        items.forEach(Item::updateQuality);
    }

}