package com.family.base.node;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/10/18 上午11:02
 * @modified By:
 */
public class Reverse {

    public static void main(String[] args) {
        Node node=new Node(1);
        Node n1=new Node(8);
        Node n2=new Node(3);
        Node n3=new Node(2);
        node.next=n1;n1.next=n2;n2.next=n3;
        reserse(node);

    }

    public static Node reserse(Node node){
        Node head=new Node();
        head.next=node;
        Node p=head;
        if(node==null){
            return node;
        }
        while(node.next!=null){
            Node temp=new Node(node.next.value);
            //切断连接
            node.next=node.next.next;
            //插入节点
            temp.next=head.next;
            p.next=temp;
            //node=node.next;
            if(node==null){
                break;
            }
        }
        return head.next;

    }
}
