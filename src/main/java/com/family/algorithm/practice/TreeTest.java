package com.family.algorithm.practice;

import org.apache.poi.ss.formula.functions.T;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/12/21 上午10:31
 * @modified By:
 */
public class TreeTest {

    public static void main(String[] args) {

        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(1);
        TreeNode t3=new TreeNode(3);
        t1.right=t2;
        t2.right=t3;


        TreeNode t11=new TreeNode(1);
        TreeNode t13=new TreeNode(1);
        TreeNode t14=new TreeNode(3);
        t11.right=t13;
        t13.right=t14;
        //System.out.println(isSameTree(t1,t11));
        System.out.println(isSameTreeV1(t1,t11));
    }

    /**
     * 比较两个树是否相同-递归实现
     * @param p
     * @param q
     * @return
     */
    public static boolean isSameTreeV1(TreeNode p, TreeNode q) {
        if(p!=null && q!=null){
            if(p.val!=q.val) return false;
            return isSameTreeV1(p.left,q.left) && isSameTreeV1(p.right,q.right);
        }
        if(p==null && q==null) return true;
        return false;
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode t1=p;
        TreeNode t1Right=null;
        TreeNode t2=q;
        TreeNode t2Right=null;
        while(t1!=null && t2!=null){
            if(t1.val!=t2.val) return false;
            if(t1Right!=null && t2Right!=null){
                if(t1Right.val!=t2Right.val) return false;
            }
            if((t1Right==null && t2Right!=null)||(t1Right!=null && t2Right==null)) return false;
            t1Right=t1.right;
            t1=t1.left;

            t2Right=t2.right;
            t2=t2.left;

        }
        if(t1==null && t2!=null) return false;
        if(t1!=null && t2==null) return false;
        return true;
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
}
