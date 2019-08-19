package gildedRose;

public class AgedBrieItem extends Item {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.sellIn = this.sellIn - 1;
       updateQualityWhenQualityLessThanFifty(this);
       if(this.sellIn < 0 ){
           updateQualityWhenQualityLessThanFifty(this);
       }



    }
    private void updateQualityWhenQualityLessThanFifty(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

}
