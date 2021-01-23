package com.family.algorithm.practice;

import java.util.*;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/12/10 上午10:14
 * @modified By:
 */
public class ListNodeTest {

    public static void main(String[] args) {
        /*int nums[]=new int[]{9,2,4,6,3,5};
        int target=8;
        int result[]=sum(nums,target);
        System.out.println(result[0]+","+result[1]);*/

        ListNode l1=new ListNode(-16557);
        ListNode l2=new ListNode(-8725);
       ListNode l3=new ListNode(-8725);
        ListNode l4=new ListNode(-16557);
        ListNode l5=new ListNode(1);
        /*  /*ListNode l6=new ListNode(9);
        ListNode l7=new ListNode(9);*/

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        //l4.next=l5;
       //l3.next=l2;
        /* l4.next=l5;*/
      /*   l5.next=l6;
        l6.next=l7;*/



        /*
        ListNode ll4=new ListNode(8);
        ll1.next=ll2;
        ll2.next=ll3;
        ll3.next=ll4;*/

      /*  ListNode listNode = combine(l1, ll1);
        print(listNode);*/
      //print(deleteDuplicates(l1));
       /* print(getIntersectionNode(l1,ll1));
        print(getIntersectionNodeV1(l1,ll1));*/
        //System.out.println(hasCycle(l1));
        //print(removeElements(l1,2));
        //System.out.println(isPalindrome(l1));

        ListNode ll1=new ListNode(1);
        ListNode ll2=new ListNode(2);
        ListNode ll3=new ListNode(4);
        ll1.next=ll2;
        ll2.next=ll3;
        ListNode t1=new ListNode(1);
        ListNode t2=new ListNode(3);
        ListNode t3=new ListNode(4);
        t1.next=t2;
        t2.next=t3;
        //print(mergeTwoLists(ll1,t1));
        print(removeNthFromEnd(ll1,2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l=head;
        Stack<ListNode> stack=new Stack();
        while(l!=null){
            stack.push(l);
            l=l.next;
        }
        ListNode temp=null;
        while(n>=0 && !stack.isEmpty()){
            if(n==0){
                temp=stack.pop();
                break;
            }
            stack.pop();
            n--;

        }
        if(temp!=null){
            temp.next=temp.next.next;
            return head;
        }
        return head.next;


    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode temp=result;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
            }else{
                temp.next=l2;
                l2=l2.next;
            }

            temp=temp.next;
        }
        temp.next=l1==null?l2:l1;
        return result.next;


    }
    /*public static ListNode reverseList(ListNode head) {
        if(head==null) return null;
        int
    }*/
    public static boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        if(head.next==null) return true;
        int mid=0;
        String s1="";
        String s2="";
        ListNode p=head;
        while (p!=null ){
           if(p.next==null){
               s2+=p.val+",";
               break;
           }
           if(p.next.next==null) {
               if(s1.equals("") && p.val==p.next.val){
                   return true;
               }
               s2+=p.val+",";
               s2+=p.next.val+",";
               break;
           }
           if(mid==1){
               s2+=p.val+",";
               p=p.next;
           }else
           if( p.val==p.next.next.val ){
               mid=1;
               s1+=(p.val+",");
               p=p.next.next;
           }else if( p.val==p.next.val) {
               mid=1;
               s1+=(p.val+",");
               p=p.next;
           }else {
               s1+=(p.val+",");
               p=p.next;
           }


        }
        System.out.println(s1);
        System.out.println(s2);

        String s11="";
        int endIndex=0;
        int startIndex=0;
        for (int i = s1.length()-1; i >=0 ; i--) {
            String ss=s1.substring(i,i+1);
            if(",".equals(ss)){
                if(endIndex==0){
                    endIndex=i;
                }else{
                    startIndex=i;
                    s11+=s1.substring(startIndex+1,endIndex);
                    endIndex=i;
                    startIndex=0;
                    s11+=",";
                }


            }

        }
        if(endIndex!=0){
            s11+=s1.substring(0,endIndex)+",";
        }
        System.out.println("s:"+s11);
        if(s11.equals(s2)) return true;

        return false;

    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.next.val==val ){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        ListNode l2=head;

        while(l2!=null && l2.val==val){
            l2= l2.next;

        }

        return l2;
    }

    /**
     * 判断链表是否有环
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {

        ListNode currA=head;
        ListNode currB=head;
        int count=1;
        if(head.next==null) return false;
        while(currA!=null && currB!=null){
            if(count %2==0) {
                currB=currB.next;
            }
            count++;
            currA=currA.next;
            if(currA==currB) return true;

        }
        return false;
    }

    /**
     * 判断两链表是否相交-(m+n)
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNodeV1(ListNode headA, ListNode headB) {
        ListNode currA=headA;
        ListNode currB=headB;
        while(currA!=null || currB!=null){
            if(currA==null) currA=headB;
            if(currB==null) currB=headA;
            if(currA==currB) return currA;
            currA=currA.next;
            currB=currB.next;
        }
        return null;
    }
    /**
     * 判断两链表是否相交-(m-n)
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int headALength=getLength(headA);
        int headBLength=getLength(headB);
        int step=headALength>headBLength?(headALength-headBLength):(headBLength-headALength);

        int temp=0;
        ListNode currA=headA;
        ListNode currB=headB;
        while (currA!=null  && currB!=null){
            if(temp!=step){
                if(headALength>=headBLength) currA=currA.next;
                if(headBLength>headALength) currB=currB.next;
                temp++;
            }else{
                if(currA==currB){
                    return currA;
                }else{
                    currA=currA.next;
                    currB=currB.next;
                }
            }

        }
        return null;

    }

    private static int getLength(ListNode headA) {
        int count=0;
        while (headA!=null){
            count++;
            headA=headA.next;
        }
        return count;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {


    }
    public static ListNode deleteDuplicates(ListNode head) {
       /* ListNode currNode=node;
        ListNode p=node;
        if(node==null || node.val==0) return node;
        while(p.next!=null){
            if(currNode==null) currNode=p.next;
            if(p.next.val!=currNode.val){
                currNode=p.next;
                p=p.next;
            }else{
                p.next=p.next.next;
            }

        }
        return node;*/
      /* ListNode p=head;
       ListNode pre=null;
       ListNode preHead=null;
       while(p!=null){
           if(pre==null){
               pre=new ListNode(p.val);
               preHead=pre;
           }
           if(p.val!=pre.val){
               pre.next=new ListNode(p.val);
               pre=pre.next;
           }
           p=p.next;
       }
       return preHead;*/
      ListNode curr=head;
      while(curr!=null){
          curr=curr.next;
      }
      return head;
    }
    private static void print(ListNode listNode) {
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }

    /**
     * 合并两个升序的链表
     * @param l1
     * @param l2
     * @return
     */
    private static ListNode combine(ListNode l1,ListNode l2){
        ListNode head=null;
        ListNode tail=null;
        while(l1!=null || l2!=null){
            int value=0;
            if(l1==null){
                value=l2.val;
                l2=l2.next;
            }else if(l2==null){
                value=l1.val;
                l1=l1.next;
            }else {
                if(l1.val<l2.val){
                    value=l1.val;
                    l1=l1.next;
                }else{
                    value=l2.val;
                    l2=l2.next;
                }
            }

            if(head==null){
                head=new ListNode(value);
                tail=head;
            }else{
                ListNode listNode=new ListNode(value);
                tail.next=listNode;
                tail=listNode;
            }
        }
        return head;
    }
    public static ListNode sum2(ListNode l1,ListNode l2){
        int first=l1.val;
        int second=l2.val;

        ListNode p=l1;
        int firstNum=1;
        while(p.next!=null){
            firstNum=firstNum*10;
            first+=p.next.val*firstNum;
            p=p.next;
        }

        ListNode q=l2;
        int secondNum=1;
        while(q.next!=null){
            secondNum=secondNum*10;
            second+=q.next.val*secondNum;
            q=q.next;
        }
        int sum=first+second;
        System.out.println("first:"+first);
        System.out.println("second:"+second);
        System.out.println("sum:"+sum);
        String str=  sum+"";
        int[] resultArray=new int[str.length()];
        for (int i = 1; i <= str.length(); i++) {
            int val=Integer.valueOf(str.substring(str.length()-i,str.length()-i+1));
            resultArray[i-1]=val;
        }
        List<ListNode> nodes=new ArrayList<>();
        for(int val:resultArray){
             ListNode listNode=new ListNode(val);
             nodes.add(listNode);
        }
        for (int i = 0; i <nodes.size()-1 ; i++) {
             nodes.get(i).next=nodes.get(i+1);
        }
        return nodes.get(0);

    }

    public static ListNode sum3(ListNode l1,ListNode l2){
        int num=0;
        ListNode head=null;
        List<Integer> list=new ArrayList<>();
        while(l1!=null || l2!=null){
            int v2=0;
            v2=(l1==null?0:l1.val)+(l2==null?0:l2.val);
            if(num>0){
                v2+=1;
                num=0;
            }
            if(v2!=0){
                if(v2>=10 ){
                    num=1;
                }
                v2=v2 % 10;

            }
            list.add(v2);
            l1=l1==null?null:l1.next;
            l2=l2==null?null:l2.next;

        }
        if(num==1){
            list.add(1);
        }
        List<ListNode> nodes=new ArrayList<>();
        for(int val:list){
            ListNode listNode=new ListNode(val);
            nodes.add(listNode);
        }
        for (int i = 0; i <nodes.size()-1 ; i++) {
            nodes.get(i).next=nodes.get(i+1);
        }
        return nodes.get(0);
    }


    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val,ListNode next){this.val=val;this.next=next;}
    }

    private static int[] sum(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            throw new RuntimeException("异常");
        }
        Map<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (hashmap.containsKey(target-nums[i])) {
                return new int[]{hashmap.get(target - nums[i]), i};
            }
            hashmap.put(nums[i],i);
        }
        throw new RuntimeException("异常");
    }

    private static void remove(List<Integer> nums){
        Iterator<Integer> iterator= nums.iterator();
        while(iterator.hasNext()){
            Integer next=iterator.next();
            System.out.println(next);
            iterator.remove();
        }
    }
}
