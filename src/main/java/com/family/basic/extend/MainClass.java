package com.family.basic.extend;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/11/26 下午5:36
 * @modified By:
 */
public class MainClass {
    public static void main(String[] args) {
        /*new SecondClass().add();
        new ThirdClass().add();*/


        AbstractFirstClass abstractFirstClass =new SecondClass();
        abstractFirstClass.add();

        SecondClass secondClass=new FourthClass();

        if(secondClass instanceof SecondClass){
            FourthClass fourthClass=(FourthClass)secondClass;
        }

        /*SecondClass secondClass=new SecondClass();
        FourthClass fourthClass=(FourthClass)secondClass;

        fourthClass.add();




        System.out.println(secondClass instanceof  FourthClass);
        System.out.println(secondClass instanceof  SecondClass);*/

        /*if(firstClass instanceof SecondClass){
            SecondClass secondClass=(SecondClass) firstClass;
            secondClass.add();
        }*/


    }
}
