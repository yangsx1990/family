package com.family.algorithm.practice.trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/4/14 上午10:01
 * @modified By:
 */
public class Trie {
    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app")); // 返回 True
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
    private Node1 root;


    /** Initialize your data structure here. */
    public Trie() {
        root=new Node1("0");
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node1 node=root;
        for (char w:word.toCharArray()){
            String temp=w+"";
            node.children.putIfAbsent(temp,new Node1(temp));
            node=node.children.get(temp);
        }
        node.end++;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
       return forEach(word,1);
    }

    private boolean forEach(String word,int status){
        Node1 node=root;
        int index=0;
        while(node!=null){
            Node1 temp=node.children.get(word.charAt(index)+"");
            if(temp==null){
                return false;
            }
            if(index==word.length()-1 ){
                if(status==2){
                    return true;
                }
                if(temp.end>0){
                    return true;
                }else{
                    return false;
                }
            }
            index++;
            node=temp;
        }
        return false;
    }
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return forEach(prefix,2);
    }

    class Node1{
        String val;
        int end;
        private boolean status;
        Map<String, Node1> children=new HashMap<>();
        public Node1(String val){
            this.val=val;
        }
        public Node1(String val,Map children){
            this.children=children;
            this.val=val;
        }
    }
}
