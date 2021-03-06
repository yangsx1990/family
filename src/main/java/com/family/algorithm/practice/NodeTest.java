package com.family.algorithm.practice;

import java.util.*;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/1/9 上午11:19
 * @modified By:
 */
public class NodeTest {


    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(3);
        Node n3=new Node(2);
        Node n4=new Node(4);
        Node n5=new Node(5);
        Node n6=new Node(6);
        List<Node> l1=new ArrayList<>();
        l1.add(n2);l1.add(n3);l1.add(n4);
        n1.children=l1;
        List<Node> l2=new ArrayList<>();
        l2.add(n5);l2.add(n6);
        n2.children=l2;
        List<List<Integer>> lists = levelOrder(n1);
        System.out.println(lists);
        //preorder(n1);
       // System.out.println(preorder(n1));
        String[] strs=new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};
        //System.out.println(longestWord(strs));
        Arrays.sort(strs);
        System.out.println(strs);
    }


    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        if(root!=null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();

            int length=queue.size();
            for (int i = 0; i <length ; i++) {
                Node top=queue.poll();
                list.add(top.val);
                if(top.children!=null){
                    for(Node node:top.children){
                        queue.offer(node);
                    }
                }

            }
            lists.add(list);
            /*if(top.children!=null){
                int index=0;
                while(index<top.children.size()){
                    Node temp=top.children.get(index);
                    queue.offer(temp);
                    //list.add(temp.val);
                    index++;
                }
                lists.add(list);
            }*/
        }
        return lists;
    }

    public static List<Integer> preorder(Node root) {
        List<Integer> list=new ArrayList<>();
         forEach(root,list);
        return list;
    }
    public static void forEach(Node root,List<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        System.out.println(root.val);
        if(root.children==null){
            return;
        }

        for (int i = 0; i <root.children.size() ; i++) {
            forEach(root.children.get(i),list);
        }
    }



    static class Node{
        int val;
        List<Node> children;
        public Node(){}
        public Node(int val){
            this.val=val;
        }
        public Node(int val,List<Node> children){
            this.children=children;
            this.val=val;
        }
    }
}
