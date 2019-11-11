package com.family.pattern.iterator;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:04 2019/8/15
 */
public class ArrayIterator implements Iterator{

    Item[] items;
    int position=0;

    public ArrayIterator(Item[] items){
        this.items=items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.length|| items[position]==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Item item=items[position];
        position=position+1;
        return item;
    }
}
