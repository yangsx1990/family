package com.family.base;

import java.util.Comparator;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/11/30 上午10:27
 * @modified By:
 */
public class ComparatorModel implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        ComparableModel m1=(ComparableModel) o1;
        ComparableModel m2=(ComparableModel)o2;
        return m1.getAge()-m2.getAge();
    }




}
