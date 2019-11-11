package com.family.pattern.iterator;

import java.util.ArrayList;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:12 2019/8/15
 */
public class Test {
    public static void main(String[] args) {
        Item[] items={new Item(1),new Item(2),new Item(3),new Item(4)};
        ArrayList<Item> itemList=new ArrayList<>();
        itemList.add(new Item(5));
        itemList.add(new Item(6));
        Iterator dinerMenuIterator=new ArrayIterator(items);
        Iterator iterator=new ListIterator(itemList);
        forEach(dinerMenuIterator);
        forEach(iterator);

    }

    private static void forEach(Iterator iterator) {
        while (iterator.hasNext()){
            Item item=(Item)iterator.next();
            System.out.println(item.getId());
        }
    }
}
