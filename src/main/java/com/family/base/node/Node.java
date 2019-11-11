package com.family.base.node;

/**
 * @author yangsaixing
 * @description 链表
 * @date Created in 下午2:19 2019/8/1
 */
public class Node {
    public Object value;
    public Node next;

    Node(){}
    Node(Object value){
        this.value=value;
    }
    Node(Object value,Node node){
        this.value=value;
        this.next=node;
    }
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
