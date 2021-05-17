package com.family.algorithm.practice.trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/4/13 上午10:08
 * @modified By:
 */
public class Solution {

    public static void main(String[] args) {
        String[] words=new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};
        System.out.println(new Solution().longestWord(words));
    }
    public String longestWord(String[] words){
        Trie trie=new Trie();
        int index=0;
        for (String word:words){
            trie.insert(word,++index);
        }
        trie.words=words;
        return trie.dfs();
    }

    class Trie{
        Node root;
        String[] words;
        public Trie(){
            root=new Node('0');
        }

        /**
         *
         * @param word 要插入的字符串
         * @param index 索引值
         */
        public void insert(String word,int index){
            Node cur=root;
            for (char c:word.toCharArray()){
                //如果c在当前节点的子节点中，否则添加新节点c。
                cur.children.putIfAbsent(c,new Node(c));
                //将当前节点的子节点当做当前节点
                cur=cur.children.get(c);
            }
            //将当前结点的end值更新
            cur.end=index;
        }
        public String dfs(){
            String ans="";
            Stack<Node> stack=new Stack<>();
            stack.push(root);
            //在栈中取出元素
            while(!stack.empty()){
                Node node=stack.pop();
                if(node.end>0 || node==root){
                    if(node!=root){
                        String word=words[node.end-1];
                        if(word.length()>ans.length() || word.length()==ans.length() && word.compareTo(ans)<0){
                            ans=word;
                        }
                    }
                    //将子节点入栈
                    for (Node nei:node.children.values()){
                        stack.push(nei);
                    }
                }
            }
            return ans;
        }
    }
    class Node{
        char val;
        int end;
        Map<Character,Node> children=new HashMap<>();
        public Node(char val){
            this.val=val;
        }
        public Node(char val,Map children){
            this.children=children;
            this.val=val;
        }
    }
}
