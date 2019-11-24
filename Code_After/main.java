public class main {

    public static void main(String[] args){
        Item el1 = new Item("Aged Brie",10,35);
        Item el2 = new Item("Cheese",15,4);
        Item el3 = new Item("Ham",13,6);
        Item el4 = new Item("Onion",7,20);
        Item el5 = new Item("Backstage passes to a TAFKAL80ETC concert",10,23);
        Item el6 = new Item("Sulfuras, Hand of Ragnaros",10,10);
        Item[] items = new Item[6];
        items[0] = el1;
        items[1] = el2;
        items[2] = el3;
        items[3] = el4;
        items[4] = el5;
        items[5] = el6;
        Refactoring m1 = new Refactoring(items);
        m1.updateQuality();
        System.out.println(el1);
        System.out.println(el2);
        System.out.println(el3);
        System.out.println(el4);
        System.out.println(el5);
        System.out.println(el6);
        Refactoring m2 = new Refactoring(items);
        m2.updateQuality();
        System.out.println(el1);
        System.out.println(el2);
        System.out.println(el3);
        System.out.println(el4);
        System.out.println(el5);
        System.out.println(el6);
    }
}
