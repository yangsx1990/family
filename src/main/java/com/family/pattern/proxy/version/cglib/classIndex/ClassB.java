package com.family.pattern.proxy.version.cglib.classIndex;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/2/19 上午10:33
 * @modified By:
 */
public class ClassB {
    public int getIndex(String signature){
        switch (signature.hashCode()){
            case 3014151:
                return 1;
            case 3014521:
                return 2;
        }
        return -1;
    }

    public void invoke(int index,Object object,Object[] objects){
        ClassA classA=new ClassA();
        switch (index){
            case 1:
                classA.a1();
                return ;
            case 2:
                classA.a2();
                return ;
        }

    }
}
