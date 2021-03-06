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
        //System.out.println(lowestCommonAncestorV3(e1,e2,e9).val);

        TreeNode f1=new TreeNode(27);
        TreeNode f2=new TreeNode(34);
        TreeNode f3=new TreeNode(58);
        TreeNode f4=new TreeNode(50);
        TreeNode f5=new TreeNode(44);
        f1.right=f2;
        f2.right=f3;
        f3.left=f4;
        f4.left=f5;
        //f3.right=f5;
        //zigzagLevelOrder(f1);
        //zigzagLevelOrder(null);

        TreeNode g1=new TreeNode(90);
        TreeNode g2=new TreeNode(69);
        TreeNode g3=new TreeNode(49);
        TreeNode g4=new TreeNode(89);
        TreeNode g5=new TreeNode(52);
        g1.left=g2;
        g2.left=g3;
        g2.right=g4;
        g3.right=g5;
        //System.out.println(minDiffInBST(g1));
        //System.out.println(leftMiddleRight(g1));

        TreeNode g11=new TreeNode(1);
        TreeNode g12=new TreeNode(0);
        TreeNode g13=new TreeNode(48);
        TreeNode g14=new TreeNode(12);
        TreeNode g15=new TreeNode(49);
        g11.left=g12;
        g11.right=g13;
        g13.right=g15;
        g13.left=g14;
        //System.out.println(rangeSumBSTV1(g11,12,44));

        TreeNode s1=new TreeNode(3);
        TreeNode s2=new TreeNode(5);
        TreeNode s3=new TreeNode(1);
        TreeNode s4=new TreeNode(6);
        TreeNode s5=new TreeNode(2);
        TreeNode s6=new TreeNode(9);
        TreeNode s7=new TreeNode(8);
        TreeNode s8=new TreeNode(7);
        TreeNode s9=new TreeNode(4);
        s1.left=s2;s1.right=s3;
        s2.left=s4;s2.right=s5;
        s3.left=s6;s3.right=s7;
        s5.left=s8;s5.right=s9;
        TreeNode ss1=new TreeNode(3);
        TreeNode ss2=new TreeNode(5);
        TreeNode ss3=new TreeNode(1);
        TreeNode ss4=new TreeNode(6);
        TreeNode ss5=new TreeNode(7);
        TreeNode ss6=new TreeNode(4);
        TreeNode ss7=new TreeNode(2);
        TreeNode ss8=new TreeNode(9);
        TreeNode ss9=new TreeNode(8);
        ss1.left=ss2;ss1.right=ss3;
        ss2.left=ss4;ss2.right=ss5;
        ss3.left=ss6;ss3.right=ss7;
        ss7.left=ss8;ss7.right=ss9;
        //System.out.println(leafSimilarV2(s1,ss1));

        /*TreeNode u1=new TreeNode(1);
        TreeNode u2=new TreeNode(2);
        TreeNode u3=new TreeNode(3);
        u1.left=u2; u1.right=u3;
        System.out.println(findTilt(u1));*/
        TreeNode u1=new TreeNode(4);
        TreeNode u2=new TreeNode(2);
        TreeNode u3=new TreeNode(9);
        TreeNode u4=new TreeNode(3);
        TreeNode u5=new TreeNode(5);
        TreeNode u6=new TreeNode(7);
        u1.left=u2; u1.right=u3; u2.left=u4;u2.right=u5;u3.right=u6;
        //System.out.println(findTilt(u1));
        //System.out.println(findTiltV2(u1));
    }

    private static int getInt(TreeNode root,Map<String,Integer> map) {
        if(root==null) return -1;
        int left=root.left==null?0:root.left.val;
        int right=root.right==null?0:root.right.val;

        int leftValue=getInt(root.left,map);

        //
       //
       // if(leftValue!=-1){
            //System.out.println("root:"+root.val);
            //System.out.println("right:"+right);
        //}

        int rightValue=getInt(root.right,map);

        if(rightValue!=-1){
            map.put("left",map.getOrDefault("left",0)+left);
            map.put("right",map.getOrDefault("right",0)+right);
            map.put("v",map.getOrDefault("v",0)+(map.get("left")-map.get("right")>0?map.get("left")-map.get("right"):map.get("right")-map.get("left")));
            map.put("left",map.get("left")+map.get("right")+root.val);
            map.put("right",0);
        }
        return map.getOrDefault("v",0);
        //int value=map.get("left")-map.get("right")>0?map.get("left")-map.get("right"):map.get("right")-map.get("left");
        //return value+leftValue+rightValue ;
    }

    public static boolean leafSimilarV2(TreeNode root1, TreeNode root2) {
        if(root1==null) return false;
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        searchNode(root1,list1);
        searchNode(root2,list2);
        if(list1.size()!=list2.size()){
            return false;
        }
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        for (int i = 0; i <list1.size() ; i++) {
            if(list1.get(i)!=list2.get(i)){
                return false;
            }
        }
        return true;
    }

    private static void searchNode(TreeNode root,List<Integer> list1) {
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            list1.add(root.val);
        }
        System.out.println(root.val);
        searchNode(root.left,list1);
        searchNode(root.right,list1);
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> queue1=new ArrayDeque<>();
        Queue<TreeNode> queue2=new ArrayDeque<>();
        TreeNode p=root1;
        TreeNode q=root2;
        if(p!=null) queue1.offer(p);
        if(q!=null) queue2.offer(q);
        Integer preValue=null;
        while(!queue1.isEmpty() && !queue2.isEmpty()){
            TreeNode temp1=queue1.poll();
            System.out.println("queue1……");
            Integer value1=handle(temp1,queue1,preValue);
            if(value1==null || value1!=-1){
                preValue=value1;
            }else{
                return false;
            }

            TreeNode temp2=queue2.poll();
            System.out.println("queue2……");
            Integer value2=handle(temp2,queue2,preValue);
            if(value2==null || value2!=-1){
                preValue=value2;
            }else{
                return false;
            }

        }
        return true;
    }

    private static Integer handle(TreeNode temp2, Queue<TreeNode> queue2, Integer preValue) {
        System.out.println("temp value："+temp2.val);
        if(temp2.left==null && temp2.right==null){
            System.out.println(temp2.val+"：是叶子结点,"+"prevalue:"+preValue);
            if(preValue==null) {
                preValue=temp2.val;
            }else if(preValue!=temp2.val){
                return -1;
            }else{
                preValue=null;
            }
        }else{
            if(temp2.left!=null) queue2.offer(temp2.left);
            if(temp2.right!=null) queue2.offer(temp2.right);
        }
        System.out.println("处理结束："+preValue);
        return preValue;
    }

    public static  int rangeSumBSTV1(TreeNode root, int low, int high) {
        return forEachV2(root,low,high,0);
    }
    public static int forEachV2(TreeNode root,int low,int high,int sum){
        if(root==null) return 0 ;
        if(root.val>=low && root.val<=high){
            sum+=root.val;
        }
        int v1=forEachV2(root.left,low,high,sum);
        int v2=forEachV2(root.right,low,high,sum);
        return sum;
    }
    public static int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> list=new ArrayList<>();
        forEachV1(root,list);
        int sum=0;
        for (Integer id:list){
            if(id>=low && id<=high){
                sum+=id;
            }
        }
        return sum;
    }

    public  static void forEachV1(TreeNode root,List<Integer> list){
        if(root==null) return ;
        list.add(root.val);
        forEachV1(root.left,list);
        forEachV1(root.right,list);
    }
    public static int leftMiddleRight(TreeNode root){
        List<Integer> list=new ArrayList<>();
        forEach(root,list);
        Integer min=Integer.MAX_VALUE;
        for (int i = 1; i <list.size(); i++) {
            int value=list.get(i)-list.get(i-1);
            value=value>0?value:-value;
            min=Math.min(min,value);
        }
        return min;
    }

    public static void forEach(TreeNode root,List<Integer> list){
        if(root==null) return;
        if(root.left==null && root.right==null){
            list.add(root.val);
            return;
        }
        forEach(root.left,list);
        list.add(root.val);
        forEach(root.right,list);
    }
    public static int minDiffInBST(TreeNode root) {
        if(root==null) return -1;
        if(root.left==null && root.right==null){
            return -1;
        }
        int v1=Integer.MAX_VALUE;
        int v2=Integer.MAX_VALUE;
        if(root.right!=null){
            v2=minDiffInBST(root.right);
            int value=getMin(root,false);
            if(v2==-1){
                v2=value;
            }else{
                v2=Math.min(value,v2);
            }

        }

        if(root.left!=null){
            v1=minDiffInBST(root.left);
            int a=getMin(root,true);
            if(v1==-1){
                v1=a;
            }else{
                v1=Math.min(a,v1);
            }
        }

/*

        if(v1==-1) return v2;
        if(v2==-1) return v1;*/
        return v1>v2?v2:v1;

    }

    public static int getMin(TreeNode root,boolean isLeft) {
        int value=0;
        if(isLeft){
            value=root.val-root.left.val;
        }else {
            value=root.val-root.right.val;
        }
        return value>0?value:-value;
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> resultList=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        boolean isOrderLeft=true;

        while(!queue.isEmpty()){
            Deque<Integer> levelDeque=new LinkedList<>();
            int size=queue.size();
            while(size>0){
                TreeNode top=queue.poll();
                if(isOrderLeft){
                    levelDeque.offerLast(top.val);
                }else {
                    levelDeque.offerFirst(top.val);
                }
                if(top.left!=null) {
                    queue.add(top.left);
                }
                if(top.right!=null) {
                    queue.add(top.right);
                }
                size--;
            }

            resultList.add(new LinkedList<>(levelDeque));
            isOrderLeft=!isOrderLeft;

        }

        return resultList;
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
