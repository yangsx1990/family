package com.family.algorithm.practice;

import org.apache.poi.ss.formula.functions.T;

import java.util.*;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/12/21 上午10:31
 * @modified By:
 */
public class TreeTest {

    public static void main(String[] args) {

        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(11);
        TreeNode t6=new TreeNode(121);
        TreeNode t3=new TreeNode(2);
        TreeNode t4=new TreeNode(111);
        TreeNode t5=new TreeNode(21);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t6;
        t3.right=t5;


        TreeNode t11=new TreeNode(1);
        TreeNode t13=new TreeNode(2);
        TreeNode t14=new TreeNode(22);
        TreeNode t15=new TreeNode(11);
        TreeNode t16=new TreeNode(111);
        TreeNode t17=new TreeNode(222);
        TreeNode t18=new TreeNode(112);
        TreeNode t19=new TreeNode(1112);
        t11.right=t13;
        t11.left=t15;
        t15.left=t16;
        t13.right=t14;
        t14.right=t17;
        t15.right=t18;
        t18.right=t19;

        TreeNode a1=new TreeNode(1);
        TreeNode a2=new TreeNode(2);
        TreeNode a3=new TreeNode(3);
        TreeNode a4=new TreeNode(4);
        TreeNode a5=new TreeNode(5);
        a1.right=a2;
        a2.right=a3;
        a3.right=a4;
        a4.right=a5;
        //System.out.println(isSameTree(t1,t11));
       /* System.out.println(isSameTreeV1(t1,t11));
        printDeep(t1);
        printWidth(t1);*/
       // System.out.println(maxDepth1(t11));
        //System.out.println(maxDepthByWidth(t11));
        //System.out.println(maxDepthAnswer(t11));
       /* System.out.println(minDepth1(a1));
        System.out.println(minDepth(a1));*/
        //System.out.println(minDepth());
        //System.out.println(t1);
        TreeNode l1=new TreeNode(3);
        TreeNode l2=new TreeNode(1);
        TreeNode l3=new TreeNode(4);
        TreeNode l4=new TreeNode(2);
//        TreeNode l5=new TreeNode(7);
        l1.left=l2;
        l1.right=l3;
        l2.right=l4;
        //l3.right=l5;
        //System.out.println(isBalanced2(l1));
        //kthLargest(l1,0);

        TreeNode b1=new TreeNode(3);
        TreeNode b2=new TreeNode(9);
        TreeNode b3=new TreeNode(20);
        TreeNode b4=new TreeNode(15);
        TreeNode b5=new TreeNode(7);
        b1.left=b2;
        b1.right=b3;
        b3.left=b4;
        b3.right=b5;

        TreeNode c1=new TreeNode(1);
        TreeNode c2=new TreeNode(2);
        TreeNode c3=new TreeNode(3);
        TreeNode c4=new TreeNode(4);
        TreeNode c5=new TreeNode(5);
        c1.left=c2;
        c2.left=c4;
        c1.right=c3;
        c2.right=c5;
        //System.out.println(levelOrder(b1));
        //System.out.println(levelOrderBottom(b1));
       // System.out.println(maxDepthV3(b1));
        TreeNode d1=new TreeNode(5);
        TreeNode d2=new TreeNode(4);
        TreeNode d3=new TreeNode(8);
        TreeNode d4=new TreeNode(11);
        TreeNode d5=new TreeNode(13);
        TreeNode d6=new TreeNode(4);
        TreeNode d7=new TreeNode(7);
        TreeNode d8=new TreeNode(2);
        TreeNode d9=new TreeNode(1);
        d1.left=d2;
        d1.right=d3;
        d2.left=d4;
        d4.left=d7;
        d4.right=d8;
        d3.left=d5;
        d3.right=d6;
        d6.right=d9;
        //System.out.println(hasPathSum(d1,10));
        TreeNode o1=new TreeNode(3);
        TreeNode o2=new TreeNode(4);
        TreeNode o3=new TreeNode(5);
        TreeNode o4=new TreeNode(1);
        TreeNode o5=new TreeNode(2);
        o1.left=o2;
        o1.right=o3;
        o2.left=o4;
        o2.right=o5;
        TreeNode o22=new TreeNode(4);
        TreeNode o42=new TreeNode(1);
        o22.left=o42;

       // System.out.println(isSubStructure(o1,o22));

        TreeNode e1=new TreeNode(3);
        TreeNode e2=new TreeNode(5);
        TreeNode e3=new TreeNode(1);


        TreeNode e4=new TreeNode(6);
        TreeNode e5=new TreeNode(2);
        TreeNode e6=new TreeNode(0);

        TreeNode e7=new TreeNode(8);
        TreeNode e8=new TreeNode(7);
        TreeNode e9=new TreeNode(4);

        e1.left=e2;
        e1.right=e3;
        e2.left=e4;
        e2.right=e5;
        e5.left=e8;
        e5.right=e9;
        e3.left=e6;
        e3.right=e7;
        System.out.println(lowestCommonAncestorV3(e1,e2,e9).val);
    }

    public static TreeNode lowestCommonAncestorV3(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p || root==q) return root;
        if(root==null) return null;
        TreeNode lNode=lowestCommonAncestorV3(root.left,p,q);
        TreeNode rNode=lowestCommonAncestorV3(root.right,p,q);
        if(lNode==null) return rNode;
        if(rNode==null) return lNode;
        return root;
    }
    public static TreeNode lowestCommonAncestorV2(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node=null;
        dfs(root,p,q,node);
        return node;
    }

    private static boolean dfs(TreeNode root, TreeNode p, TreeNode q,TreeNode node) {
        if(root==null) return false;
        boolean lson=dfs(root.left,p,q,node);
        boolean rson=dfs(root.right,p,q,node);
        if(lson && rson){
            node=root;
            System.out.println(node==null?"--":node.val);
        }
        if((root.val==p.val || root.val==q.val) && (lson || rson)){
            node=root;
            System.out.println(node==null?"--":node.val);
        }
        return lson || rson ||(root.val==p.val || root.val ==q.val);
    }

    public static TreeNode lowestCommonAncestorV1(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val==p.val || root.val==q.val) return root;
        TreeNode t1=forEachNode(root,p);
        TreeNode t2=forEachNode(root,q);
        if(t1==t2){
            return t1;
        }else{
            return lowestCommonAncestorV1(root,t1,t2);
        }
    }

    private static TreeNode forEachNode(TreeNode root, TreeNode p) {
        if(root.val==p.val){
            return root;
        }
        if(root.left!=null){
            if(root.left.val==p.val){
                return root;
            }else {
                forEachNode(root.left,p);
            }
        }
        if(root.right!=null){
            if(root.right.val==p.val){
                return root;
            }else {
                forEachNode(root.right,p);
            }
        }
        return null;
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        Stack<TreeNode> stack1=new Stack();
        containNode(p,queue,stack1);

        Stack<TreeNode> stack2=new Stack();
        containNode(q,queue,stack2);
        return stack1.size()>stack2.size()?stack2.pop():stack1.pop();


    }

    private static void containNode(TreeNode treeNode,Queue<TreeNode> queue,Stack stack){
        TreeNode root=queue.poll();
        if(root.val==treeNode.val){
            return;
        }
        if(root.left!=null){
            queue.add(root.left);
        }
        if(root.right!=null){
            queue.add(root.right);
        }
        if(root.right.val!=treeNode.val){
            stack.push(root.val);
        }
        containNode(treeNode,queue,stack);
    }

    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A!=null && B!=null) &&( recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B));
    }

    private static boolean recur(TreeNode a, TreeNode b) {
        if(b==null) return true;
        if(a==null || a.val!=b.val) return false;
        return recur(a.left,b.left) && recur(a.right,b.right);
    }

    private static Queue readTree(TreeNode A) {
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(A);
        while(!queue.isEmpty()){
            TreeNode head = queue.poll();

            System.out.println(head.val);
            if(head.left!=null) queue.add(head.left);
            if(head.right!=null) queue.add(head.right);
        }
        return queue;
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return sum==root.val;
        }
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }

    private static int getPath(TreeNode root,int sum) {
        if(root==null){
            return 0;
        }else{
            System.out.println(root.val);
        }
         int v1=getPath(root.left,sum)+1;
         int v2=getPath(root.right,sum)+1;
         return v1+v2;
    }

    public static int maxDepthV3(TreeNode root) {
        if(root==null){
            return 0;
        }

        return Math.max(maxDepthV3(root.left)+1,maxDepthV3(root.right)+1);
    }
    public static int[] levelOrderV1(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        List<Integer> list=new ArrayList<>();
        while(queue.size()>0){
            TreeNode temp=queue.poll();
            list.add(temp.val);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        int[] nums=new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            nums[i]=list.get(i);
        }
        return nums;
    }

    private static void printArrays(TreeNode root, List<Integer> array) {
        if(root==null){
            return;
        }else{
            array.add(root.val);
            printArrays(root.left,array);
            printArrays(root.right,array);
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        queue.add(root);
        while(!queue.isEmpty()){

            List<Integer> tempList=new ArrayList<>();
            for (int i = queue.size(); i >0 ; i--) {
                TreeNode treeNode=queue.poll();
                tempList.add(treeNode.val);
                if(treeNode.left!=null) queue.add(treeNode.left);
                if(treeNode.right!=null) queue.add(treeNode.right);
            }
            list.add(tempList);

        }
        return list;
    }



    public static int kthLargest(TreeNode root, int k) {
        if(root==null) return 0;
        int left=kthLargest(root.left,0);
        if(left==0){
            System.out.println(root.val);
        }
        int right=kthLargest(root.right,0);
        if(right==0){
            System.out.println(root.val);
        }

        printLeft(root);
        printRight(root);
        return 0;
    }

    private static int printLeft(TreeNode root) {
        if(root==null) return 0;
        int left=printLeft(root.left);
        if(left==0){
            System.out.println(root.val);
        }
        return -1;
    }
    private static int printRight(TreeNode root) {
        if(root==null) return 0;
        int left=printLeft(root.right);
        if(left==0){
            System.out.println(root.val);
        }
        return -1;
    }



    public static int isBalanced1(TreeNode root) {

        if(root==null){
            return 0;
        }else {
            System.out.println(root.val);
            int left=isBalanced1(root.left);
            int right=isBalanced1(root.right);
            return Math.max(left,right)+1;
        }
    }

    /**
     * 递归-自顶向下
     * @param root
     * @return
     */
    public static boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }else{
            return Math.abs(getHeight(root.left)-getHeight(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private static int getHeight(TreeNode root) {
        if(root==null){
            return 0;
        }else {
            return Math.max(getHeight(root.left),getHeight(root.right))+1;
        }
    }

    /**
     * 自底向上
     * @param root
     * @return
     */
    public static boolean isBalanced2(TreeNode root) {
        return height(root)>=0;
    }

    private static int height(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        if(left==-1 || right==-1 || Math.abs(left-right)>1){
            return -1;
        }else{
            return Math.max(left,right)+1;
        }
    }

     public static List<List<Integer>> levelOrderBottom(TreeNode root) {
         Queue<TreeNode> queue=new LinkedList<>();
         List<List<Integer>> list=new ArrayList<>();
         if(root==null) return list;
         queue.add(root);
         while(!queue.isEmpty()){

             List<Integer> tempList=new ArrayList<>();
             for (int i = queue.size(); i >0 ; i--) {
                 TreeNode treeNode=queue.poll();
                 tempList.add(treeNode.val);
                 if(treeNode.left!=null) queue.add(treeNode.left);
                 if(treeNode.right!=null) queue.add(treeNode.right);
             }
             list.add(0,tempList);

         }
         return list;
     }
    public static boolean isSymmetric(TreeNode root) {
        TreeNode left=root;
        TreeNode right=root;

       // left=
        return false;
    }
    public static int minDepth(TreeNode root) {
        if(root==null) {
            return 0;
        }
        if(root.left==null && root.right==null) {
            return 1;
        }
        int min=Integer.MAX_VALUE;
        if(root.left!=null){
             min=Math.min(minDepth(root.left),min);
        }
        if(root.right!=null){
            min=Math.min(minDepth(root.right),min);
        }

        return min+1;
    }

    public static int minDepth1(TreeNode root) {
        if(root==null) {
            return 0;
        }
        if(root.left==null && root.right==null) {
            return 1;
        }
        int leftHeight = minDepth1(root.left);
        int rightHeight = minDepth1(root.right);
        return Math.min(leftHeight, rightHeight) + 1;
    }
    public static int maxDepthAnswer(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepthAnswer(root.left);
            int rightHeight = maxDepthAnswer(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }


    public  static int maxDepth1(TreeNode root) {
        int leftLevel=0;
        int rightLevel=0;
        return hasNode(root,0);
    }

    private static int hasNode(TreeNode node,Integer left) {
        if(node==null){
            return left;
        }else{
            left++;
            System.out.println(node.val);
            return Math.max(hasNode(node.left,left) , hasNode(node.right,left));
        }
    }

    /**
     * 广度优先遍历
     * @param root
     * @return
     */
    public static int maxDepthByWidth(TreeNode root){
        if(root==null) return 0;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        int ans=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size>0){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }
    public  static int maxDepth(TreeNode root) {
        int leftValue=0;
        int rightValue=0;
        TreeNode leftNode=root;
        TreeNode rightNode=null;
        while(leftNode!=null || rightNode!=null){
            if(leftNode!=null){
                leftValue++;
                leftNode=leftNode.left;
                rightNode=leftNode.right;
            }else if(rightNode!=null){
                rightValue++;

            }

        }
        return leftValue;

    }
//    public  static int maxDepth(TreeNode root) {
//
//        TreeNode t1=root;
//        TreeNode t2=root;
//        int level=0;
//        while(t1!=null || t2!=null){
//            level++;
//            if(t1!=null){
//                t1=t1.left;
//            }
//
//        }
//    }
    /**
     * 树遍历-广度优先
     * @param t1
     */
    private static void printWidth(TreeNode t1) {
        TreeNode p=t1;
        TreeNode q=null;
        while(p!=null || q!=null){
            if(p!=null) System.out.println(p.val);
            if(q!=null) System.out.println(q.val);
            q=p.right;
            p=p.left;
        }
    }

    /**
     * 树遍历-深度优先
     * @param t1
     */
    private static void printDeep(TreeNode t1) {
        if(t1!=null){
            System.out.println(t1.val);
            printWidth(t1.left);
            printWidth(t1.right);
        }
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
