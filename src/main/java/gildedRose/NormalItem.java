package gildedRose;

public class NormalItem extends Item {
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.quality > 0) {
            this.quality = this.quality - 1;
        }
        this.sellIn = this.sellIn - 1;
        if(this.sellIn < 0 && quality >0){
            this.quality = this.quality - 1;
        }

    }


}
