public class main {

    public static void main(String[] args){
        Item el1 = new Item("Aged Brie",10,35);
        Item el2 = new Item("Cheese",15,4);
        Item el3 = new Item("Ham",13,6);
        Item el4 = new Item("Onion",7,20);
        Item[] items = new Item[4];
        items[0] = el1;
        items[1] = el2;
        items[2] = el3;
        items[3] = el4;
        Refactoring m = new Refactoring(items);
        m.updateQuality();


        System.out.println(el1);
        System.out.println(el2);
        System.out.println(el3);
        System.out.println(el4);


    }
}
