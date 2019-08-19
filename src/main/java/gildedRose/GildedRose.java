package gildedRose;

import java.util.List;

public class GildedRose {
   private List<Item> items;

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateEachQuality(item);
        }
    }

    private void updateEachQuality(Item item) {
        if (isNormal(item)) {
            updateNoramlQuality(item);
        } else {
            updateSpecialQuality(item);
        }

        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }

        if (item.sellIn < 0) {
            if (!item.name.equals("Aged Brie")) {
                updateNormalQualityWhenSellInLessThanZero(item);
            } else {
                updateQualityWhenQualityLessThanFifty(item);
            }
        }
    }

    private void updateNormalQualityWhenSellInLessThanZero(Item item) {
        if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            updateNoramlQuality(item);
        } else {
            item.quality = 0;
        }
    }

    private void updateSpecialQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;

            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.sellIn < 11) {
                    updateQualityWhenQualityLessThanFifty(item);
                }
            }
        }
    }

    private void updateQualityWhenQualityLessThanFifty(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void updateNoramlQuality(Item item) {
        if (item.quality > 0) {
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality = item.quality - 1;
            }
        }
    }

    private boolean isNormal(Item item) {
        return !item.name.equals("Aged Brie")
                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }
}