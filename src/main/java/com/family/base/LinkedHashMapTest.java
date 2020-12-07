package com.family.base;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: lru
 * @author: yangsaixing
 * @date: Created in 2020/12/1 上午10:53
 * @modified By:
 */
public class LinkedHashMapTest {
    Node head;

    Node tail;


    public static void main(String[] args) {
        /*LinkedHashMapTest test=new LinkedHashMapTest();
        test.add(1);
        test.add(2);
        System.out.println(test.head);
        System.out.println(test.head.next);
        test.remove();
        System.out.println(test.head);
        Map map=new HashMap<>();
        map.put(null,null);
        map.put("a",null);
        map.put("a","1");
        System.out.println(map);*/
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
    void remove(){
        if(head==null){
            return;
        }
        if(head.next ==null){
            tail=null;
            return;
        }
        Node tailNext=head.next;
        tailNext.pre=null;
        head.next=null;
        head=tailNext;
        return;

    }
    void add(int object){
        if(head==null){
          head=new Node(object);
          tail=head;
          return;
        }
        //在tail后追加
        Node newNode=new Node(object);
        tail.next=newNode;
        newNode.pre=tail;
        tail=newNode;
    }
    class Node{
        Node pre;
        Node next;
        private int id;

        @Override
        public String toString() {
            return "Node{" +

                    "id=" + id +
                    '}';
        }

        Node(int id){
            this.id=id;
        }
        public Node getPre() {
            return pre;
        }

        public void setPre(Node pre) {
            this.pre = pre;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
