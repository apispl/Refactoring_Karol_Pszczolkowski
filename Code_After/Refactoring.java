public class Refactoring {
    Item[] items;
    String oldCheese = "Aged Brie";
    String backstageTicket = "Backstage passes to a TAFKAL80ETC concert";
    String legendary = "Sulfuras, Hand of Ragnaros";
    public Refactoring(Item[] items) {
        this.items = items;
    }
    public int isItLegendary(int i){
        if (!items[i].name.equals(legendary))
             items[i].quality = items[i].quality - 1;
        return items[i].quality;
    }
    public int checkQualityAboveZero(int i){
        if (items[i].quality > 0)
            return items[i].quality;
        else
            return 0;
    }
    public int itIsLegendary(int i){
        if (!items[i].name.equals(legendary))
            items[i].sellIn = items[i].sellIn - 1;
        return items[i].sellIn;
    }
    public int backstagePassesLess6(int i){
        if (items[i].sellIn < 6 && items[i].quality < 50)
            items[i].quality = items[i].quality + 1;
        return items[i].quality;
    }
    public int backstagePassesLess11(int i){
        if (items[i].sellIn < 11 && items[i].quality < 50)
            items[i].quality = items[i].quality + 1;
        return items[i].quality;
    }
    public int qualityCheck(int i){
        if (items[i].quality < 50)
            items[i].quality = items[i].quality + 1;
        return items[i].quality;
    }
    public int ifBackstageTicket(int i){
        if(backstagePassesLess11(i) != 0)
            return items[i].quality;
        if (backstagePassesLess6(i) != 0)
            return items[i].quality;
        return 0;
    }
    public void ifNoBackstageTicket(int i){
        if (!items[i].name.equals(backstageTicket)) {
            checkQualityAboveZero(i);
            isItLegendary(i);
        } else {
            items[i].quality = items[i].quality - items[i].quality;
        }
    }
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(oldCheese) && !items[i].name.equals(backstageTicket)) {
                checkQualityAboveZero(i);
                isItLegendary(i);
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                    ifBackstageTicket(i);
                }
            }
            itIsLegendary(i);
            if (items[i].sellIn < 0) {
                if (!items[i].name.equals(oldCheese)) {
                    ifNoBackstageTicket(i);
                } else
                    qualityCheck(i);
            }
        }
    }
}
