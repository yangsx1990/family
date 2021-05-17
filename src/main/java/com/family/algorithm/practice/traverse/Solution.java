package com.family.algorithm.practice.traverse;
/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/4/8 下午4:35
 * @modified By:
 */
public class Solution {

    int tilt=0;

    public  int findTilt(TreeNode root) {
        traver(root);
        return tilt;
    }

    private  int traver(TreeNode root) {
        if(root==null) return 0;
        int left=traver(root.left);
        int right=traver(root.right);
        tilt+=Math.abs(left-right);
        //System.out.println("left:"+left+",right:"+right+",tilt:"+tilt);
        return left+right+root.val;
    }

    public static void main(String[] args) {
        TreeNode u1=new TreeNode(4);
        TreeNode u2=new TreeNode(2);
        TreeNode u3=new TreeNode(9);
        TreeNode u4=new TreeNode(3);
        TreeNode u5=new TreeNode(5);
        TreeNode u6=new TreeNode(7);
        u1.left=u2; u1.right=u3; u2.left=u4;u2.right=u5;u3.right=u6;
        System.out.println(new Solution().findTilt(u1));
    }
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
}
