package com.family.base.node;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午2:25 2019/8/1
 */
public class SingleLinkedList<T> {

    private Node head;


    /**
     * 添加节点
     * @param value
     */
    public void add(Object value){
        //创建一个节点
        Node toAddNode=new Node(value);
        if(head==null){
            head=toAddNode;
            return;
        }
        Node node=head;
        while(node.next!=null){
            node=node.next;
        }
        node.next=toAddNode;
    }


    /**
     * 遍历链表
     */
    public void traverse(){
        Node node=head;
        while(node!=null){
            System.out.println("节点："+node.value);
            node=node.next;
        }
    }

    public void reverse(){
        Node node=head;
        if(node==null){
            return;
        }
        while(node.next!=null){
            node.next.next=node;
            node=node.next;
        }

    }
    public void insert(int index,Object value){

    }

    public void delete(int index){
        if(index==0){
            head=null;
            return;
        }
        Node node=head;
        int curPoint=1;
        while(node!=null){
            if(curPoint==index){
                if(node.next==null){
                    return;
                }
                node.next=node.next.next;
                return;
            }
            node=node.next;
            curPoint++;
        }

    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> list=new SingleLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        /*list.delete(2);
        list.traverse();*/
        list.reverse();
        list.traverse();

    }
}
