package com.family;

import lombok.Data;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/10/9 下午4:09
 * @modified By:
 */
public class TestA {
    public static void main(String[] args) {
       Node1 node1=new Node1(1) ;
       Node1 node2=new Node1(3) ;
       Node1 node3=new Node1(5) ;
       node1.next=node2;
       node2.next=node3;

        Node1 node11=new Node1(2) ;
        Node1 node12=new Node1(4) ;
        Node1 node13=new Node1(6) ;
        node11.next=node12;
        node12.next=node13;

        Node1 node=convert(node1,node11);
        forEach(node);
    }

    private static void forEach(Node1 node) {
        while(node!=null){
            System.out.println(node.value);
            node=node.next;
        }
    }

    private static Node1 convert(Node1 node1, Node1 node11) {
        Node1 head=new Node1(0);
        Node1 result=head;
        Node1 response=result;
        Node1 p1=node1;
        Node1 p2=node11;
        while(p1!=null || p2!=null){
            //只有p2有值
            if(p1==null){
                result.next=new Node1(p2.value);
                p2=p2.next;
                //只有p1有值
            }else if(p2==null){
                result.next=new Node1(p1.value);;
                p1=p1.next;
                //p1和p2都有值
            }else{
                if(p1.value<=p2.value){
                    result.next=new Node1(p1.value);
                    p1=p1.next;
                }else{
                    result.next=new Node1(p2.value);;
                    p2=p2.next;
                }

            }
            result=result.next;

        }
        return response.next;

    }

}

@Data
class Node1{
    Node1 next;
    int value;
    Node1(int value){
        this.value=value;
    }
}
