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
    @Test
    public void should_quality_0_when_updateQuality_given_normal_item_sellIn_10_and_quality_is_0(){
        Item item = new Item("oocl full stack",10,0);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(0,item.getQuality());

    }
    @Test
    public void should_quality_50_when_updateQuality_given_item_name_Sulfuras_Hand_of_Ragnaros_sellIn_10_and_quality_is_50(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",10,50);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(50,item.getQuality());

    }
    @Test
    public void should_quality_50_when_updateQuality_given_item_name_Aged_Brie_sellIn_10_and_quality_is_49(){
        Item item = new Item("Aged Brie",10,49);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(50,item.getQuality());

    }
    @Test
    public void should_quality_51_when_updateQuality_given_item_name_Aged_Brie_sellIn_10_and_quality_is_51(){
        Item item = new Item("Aged Brie",10,51);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(51,item.getQuality());

    }
    @Test
    public void should_quality_50_when_updateQuality_given_item_name_Backstage_passes_to_a_TAFKAL80ETC_concert_sellIn_10_and_quality_is_48(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",10,48);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(50,item.getQuality());

    }
    @Test
    public void should_quality_49_when_updateQuality_given_item_name_Backstage_passes_to_a_TAFKAL80ETC_concert_sellIn_12_and_quality_is_48(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",12,48);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(49,item.getQuality());

    }
    @Test
    public void should_sellIn_9_when_updateQuality_given_normal_item_sellIn_10_and_quality_is_50(){
        Item item = new Item("oocl full stack",10,50);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(9,item.getSellIn());

    }
    @Test
    public void should_sellIn_10_when_updateQuality_given_item_name_Sulfuras_Hand_of_Ragnaros_sellIn_10_and_quality_is_50(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",10,50);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(10,item.getSellIn());

    }
    @Test
    public void should_quality_48_when_updateQuality_given_normal_item_sellIn_0_and_quality_is_50(){
        Item item = new Item("oocl full stack",0,50);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(48,item.getQuality());

    }
    @Test
    public void should_quality_48_when_updateQuality_given_normal_item_sellIn_0_and_quality_is_0(){
        Item item = new Item("oocl full stack",0,0);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(0,item.getQuality());

    }
    @Test
    public void should_quality_50_when_updateQuality_given_item_name_Aged_Brie_sellIn_0_and_quality_is_48(){
        Item item = new Item("Aged Brie",0,48);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(50,item.getQuality());

    }
    @Test
    public void should_quality_0_when_updateQuality_given_item_name_Backstage_passes_to_a_TAFKAL80ETC_concert_sellIn_0_and_quality_is_48(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",0,48);
        GildedRose gildedRose = new GildedRose(singletonList(item));

        gildedRose.updateQuality();

        Assert.assertEquals(0,item.getQuality());

    }



}
