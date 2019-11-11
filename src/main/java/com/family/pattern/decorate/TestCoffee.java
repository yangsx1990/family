package com.family.pattern.decorate;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午2:46 2019/7/23
 */
public class TestCoffee {
    public static void main(String[] args) {
      /*  Beverage beverage=new Espresso();
        System.out.println(beverage.getDesc()+":"+beverage.cost());
*/
        Beverage beverage1=new HouseBlend();
        beverage1=new Mocha(beverage1);
        System.out.println(beverage1.getDesc()+":"+beverage1.cost());

    }
}
