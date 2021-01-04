package sorting_examples.sort1;

import java.util.ArrayList;


public class Item implements Comparable<Item> {
    String name;
    int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Item o) {
        return this.price - o.price;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Item) {
           Item other = (Item) obj;
           return this.compareTo(other) == 0;
        }
        return false;
    }
}

class TestSortingItem {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("tv", 200));
        items.add(new Item("ring", 1000));
        items.add(new Item("cat food", 3));

        //Collections.sort(items);

        for (Item item : items) {
            System.out.println(item.getPrice());
        }
    }
}
