package com.family.leetcode;

/**
 * @author yangsaixing
 * @description 237-删除链表中的结点
 * @date Created in 下午5:48 2019/7/8
 */
public class DeleteLinkedNode {

    private  ListNode listNode=new ListNode(4);

    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }
  public  void deleteNode(ListNode node){
        node=new ListNode(9);
        Integer nodeVal=node.val;
        node=listNode;
        while(node!=null){
            if(nodeVal.equals(node.val)) {
                listNode=node.next;
                break;
            }
            if(node.next==null) {
                break;
            }
            if(nodeVal.equals(node.next.val)) {
                if(node.next.next!=null) {
                    node.next=node.next.next;
                }else{
                    node.next=null;
                }
            }else {
                node = node.next;
            }

        }
        print(listNode);

  }

    private void print(ListNode listNode) {
      while(listNode!=null){
          System.out.println(listNode.val);
          listNode=listNode.next;
      }
    }

    public static void main(String[] args) {
        DeleteLinkedNode deleteLinkedNode=new DeleteLinkedNode();
        ListNode listNode=deleteLinkedNode.initNode();
       /* deleteLinkedNode.deleteNode(listNode);*/

        System.out.println("需删除的点是："+listNode.next.val);
        deleteLinkedNode.deleteNodeNew(listNode.next);
    }

    private  ListNode initNode() {
      ListNode l1=new ListNode(9);
      ListNode l2=new ListNode(1);
      ListNode l3=new ListNode(5);
      ListNode l4=new ListNode(0);
      l1.next=l2;
      l2.next=l3;
      l3.next=l4;
      return l1;
    }

    private void deleteNodeNew(ListNode node){

          node.val=node.next.val;
          node.next=node.next.next;


    }

}
