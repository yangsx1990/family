package com.family.pattern.iterator;


import java.util.ArrayList;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:17 2019/8/15
 */
public class ListIterator implements Iterator {

    ArrayList items;
    int position=0;

    public ListIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.size()|| items.get(position)==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Object item = items.get(position);
        position=position+1;
        return item;
    }
}
