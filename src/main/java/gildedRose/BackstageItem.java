package gildedRose;

public class BackstageItem extends Item {
    public BackstageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.sellIn = this.sellIn - 1;
        updateQualityWhenQualityLessThanFifty(this);
        if (this.sellIn < 11 ) {
            updateQualityWhenQualityLessThanFifty(this);
        }
        if (this.sellIn < 6) {
           updateQualityWhenQualityLessThanFifty(this);
        }
        if (this.sellIn < 0 ) {
            this.quality = 0;
        }

    }
    private void updateQualityWhenQualityLessThanFifty(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
