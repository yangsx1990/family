package com.family.algorithm.practice;

import java.util.*;

/**
 * @description: 双指针 降级
 * @author: yangsaixing
 * @date: Created in 2020/12/15 上午9:55
 * @modified By:
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] nums = new int[]{9};
        //System.out.println("去重后的长度："+getLength(nums));
        //System.out.println("abc".substring(1,3));
        //System.out.println(getIndexStr("mississippi","issipi"));
        //System.out.println("mississippi".substring(7,7+13));
        /*int target=0;
        System.out.println(searchInsert(nums,target));
        System.out.println(searchInsertV1(nums,target));*/
        //System.out.println(countAndSay(3));
        //System.out.println(19 % 10);
        //printArray(plusOne(nums));
        //printArray(plusOneV1(nums));
        //System.out.println(lengthOfLastWord("b   a    "));
        // System.out.println(binaryToTen("1111"));
        /*int[] numss=new int[]{1,2,3,1};
        System.out.println(rob(numss));*/
       /* int[] numss=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(numss));*/
       /*int[] ns=new int[]{1,2,2,2,1};
        System.out.println(majorityElement(ns));*/
        /*int[] ns=new int[]{4,5,6,0,0,0};
        int[] ns1=new int[]{1,2,3};
        //printArray(twoSum(ns,-1));
        merge(ns,3,ns1,3);*/
        int[] numss = new int[]{8, -19, 5, -4, 20};
        //System.out.println(containsDuplicate(numss));
        //System.out.println(containsNearbyDuplicate(numss,1));

       /* List<String> strings = summaryRanges(numss);
        System.out.println(strings);*/

        //System.out.println(maxSubArray1(numss));
       /* List<List<Integer>> generate = generate(3);
        System.out.println(generate);*/
        //System.out.println(countAndSayV1(4));
        //System.out.println(getString("21"));
        //System.out.println(getRow(3));
        //System.out.println(isSubsequence("abc","adddbdec"));
        // System.out.println("1234".substring(1,3));
        int[] num = new int[]{0, 1, 2, 4};
        //System.out.println(missingNumber(num));
        int[] n = new int[num.length];
        n = num;
        //printArray(n);


        //System.out.println(transpose(a));

        int[] s = new int[]{-1, -2, -3, -4};
        int[] t = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        //System.out.println(largestPerimeterV1(s));
        /*char[] chars=new char[]{'a','b'};
        reverseString(chars);*/
        //printArray(merge1(s,3,t,3));
        //System.out.println(maxProfit(s));
        //System.out.println(climbStairs(6));
        //System.out.println(minCostClimbingStairs1(t));
        //System.out.println(maximumProduct(s));
        int[][] a = new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        //System.out.println(maximumUnits(a,10));
        int[] a1 = new int[]{4, 2, 5, 7};
        //printArray(sortArrayByParityII(a1));

        int[] temp = new int[]{4};
        /*for (int i=0;i<temp.length;i++){
            temp[i]=temp[i]*10000-temp[i]+10000;
            System.out.println(temp[i]);
        }

        for (int i = 0; i <temp.length ; i++) {
            System.out.println(10000-temp[i]%10000);
        }*/
        //printArray(sortByBits(temp));
        //printArray(sortByBits1(temp));
       /* List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int[] l1=new  int[4];
        l1[0]=3;
        l1[1]=1;
        l1[2]=5;
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(l1[o1]<l1[o2]){
                    return -1;
                }else if(l1[o1]>l1[o2]){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(list);*/
        //System.out.println(minSubsequence(temp));
        //allCellsDistOrder(80,57,19,38);

        // System.out.println(majorityElement1(nn));
        //printArray(searchRange(nn,8));
        //printArray(sortedSquares(nn));
        //System.out.println(sumOddLengthSubarrays(nn));
        int[] nn = new int[]{1, 3};
        int[] n1 = new int[]{2, 6};
        int[][] aa = new int[][]{{1, 4}, {5, 6}};
        //int[][] tt=merge(aa);
        //System.out.println(tt);
        int[] str = new int[]{2, 2, 0, 2};
        //System.out.println(removeDuplicates1(str));
        //System.out.println(missingNumber1(new int[]{0}));
        //int[] str=new int[]{10,1,10,10,10};
        //System.out.println(minArrayBinarySearch(str));
        int[] temp1 = new int[]{2,1,4};
        //printArray(twoSumV1(temp1,9));
        //printArray(maxSlidingWindow(temp1,3));
        //printArray(exchange(temp1));
        //System.out.println(isStraight(temp1));
        //System.out.println(maxProfitV2(temp1));
        //System.out.println(massage(new int[]{2}));
        int[] n11=new int[]{-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
        //System.out.println("result:"+maxSubArrayV3(n11));
        //System.out.println(checkArithmeticSubarrays(n11,new int[]{0,1,6,4,8,7},new int[]{4,4,9,7,9,10}));
        int[] nums1=new int[]{-1,-100,3,99};
        //rotate(nums1,2);
    /*    Map map=new HashMap();
        map.put("a",1);

        Map map1=new HashMap();
        map1.put("a",1);
        System.out.println(map.equals(map1));
        System.out.println(map==map1);
        */

       String[] strs=new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
       //groupAnagrams(strs);
        String[] strss=new String[]{"a","aa","aaa"};
        topKFrequent(strss,1);

    }
    public static List<String> topKFrequent(String[] words, int k) {
        if(words==null || words.length==0) return null;
        Map<String,Integer> map=new HashMap<>();
        int max=0;
        for (String str:words){
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
                max=Math.max(max,map.get(str));
            }else{
                map.put(str,1);
            }
        }
        max=max==0?1:max;
        Map<Integer,List<String>> resultMap=new HashMap<>();
        for (String key:map.keySet()){
             Integer value=map.get(key);
            if(resultMap.containsKey(value)){
                List tempList=resultMap.get(value);
                tempList.add(key);
                resultMap.put(value,tempList);
            }else {
                List<String> tempList=new ArrayList<>();
                tempList.add(key);
                resultMap.put(value,tempList);
            }
        }
        List<String> strList=new ArrayList<>();
        int currentSize=0;
        for (int i = max; i >= 0; i--) {
            if(k<=0){
                break;
            }
            if(resultMap.containsKey(i)){
                List<String> list=resultMap.get(i);
                String[] tempStr= list.toArray(new String[list.size()]);
                Arrays.sort(tempStr);
                strList.addAll(Arrays.asList(Arrays.copyOf(tempStr,k-currentSize>tempStr.length?tempStr.length:k-currentSize)));
                k=k-list.size();
            }
        }
        return strList;
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for (String str:strs){
            char[] arrays=str.toCharArray();
            Arrays.sort(arrays);
            String key=new String(arrays);
            List<String> list=map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());
    }



    public static void rotate(int[] nums, int k) {
        if(k==0) return;
        int start=0;
        int index=0;
        int temp=Integer.MAX_VALUE;
        int size=0;
        while(index>=0){
            int expectIndex=index+k;
            if(expectIndex>= nums.length){
                expectIndex=expectIndex-nums.length;
            }
            if(temp==Integer.MAX_VALUE){
                temp=nums[expectIndex];
                nums[expectIndex]=nums[index];
            }else{
                int t=nums[expectIndex];
                nums[expectIndex]=temp;
                temp=t;
            }
            size++;
            index=expectIndex;
            if(size==nums.length){
                break;
            }
            if(index<=start){
                index++;
                start++;
            }
        }

        printArray(nums);
    }
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list=new ArrayList<>();
        for (int i = 0; i <l.length ; i++) {
            int[] temp=Arrays.copyOfRange(nums,l[i],r[i]+1);
            Arrays.sort(temp);
            if(temp.length<2){
                list.add(true);
            }else {
                int tempValue=temp[1]-temp[0];
                Boolean status=true;
                for (int j = 2; j <temp.length ; j++) {
                    if(temp[j]-temp[j-1]!=tempValue){
                        status=false;
                        break;
                    }
                }
                list.add(status);
            }

        }
        return list;

    }

    public static int maxSubArrayV3(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int preSum=dp[0];
        int max=preSum;
        int result=max;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]<0){
                max=Math.max(dp[i-1],nums[i]);
                preSum+=nums[i];
            }else{
                if(preSum<0) preSum=0;
                preSum+=nums[i];
                max=Math.max(preSum,nums[i]);
            }
            dp[i]=max;
            result=Math.max(result,max);
            System.out.println(max);
        }
        return result;
    }

    public static int massage(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int max=Math.max(nums[0],nums[1]);
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0],nums[1]);
        for (int i = 2; i <nums.length ; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            System.out.println(dp[i]);
            max=Math.max(dp[i],max);
        }
        return max;
    }
    public static int maxProfitV2(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int p=1;
        int max=0;
        int minNumber=prices[0];
        while(p<prices.length){
            if(prices[p]<prices[p-1]){
                minNumber=Math.min(minNumber,prices[p]);
                p++;
            }else{
                max=Math.max(max,prices[p]-minNumber);
                minNumber=Math.min(minNumber,prices[p-1]);
                p++;
            }
        }
        return max;
    }
    public static boolean isStraight(int[] nums) {
        int min = 14;
        int max = 0;
        int zeroCount = 0;
        for (int n : nums) {
            if (n == 0) {
                zeroCount++;
            } else {
                min = Math.min(n, min);
                max = Math.max(n, max);
            }
        }
        if (max - min > 4) {
            return false;
        }
        int[] temp = new int[14];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] = 1;
        }

        int count = 0;
        boolean status = false;
        for (int i = 1; i < temp.length; i++) {

            if (temp[i] == 1) {
                count++;
                status = true;
            } else if (status) {
                if (zeroCount == 0) {
                    return false;
                }
                zeroCount--;
                count++;
            }
            if (count == 5) {
                return true;
            }
            if(i==temp.length-1 &&  5-count==zeroCount){
                return true;
            }
        }
        return false;

    }
    public static int[] exchange(int[] nums) {
        int p=0;
        int q=nums.length-1;
        while(p<q){
            if(nums[q] %2 ==0){
                q--;
            }else if(nums[p] %2!=0){
                p++;
            }else if(nums[p] %2==0){
                int temp=nums[q];
                nums[q]=nums[p];
                nums[p]=temp;
                q--;
                p++;
            }
        }
        return nums;
    }
    public static int[] maxSlidingWindow(int[] nums,int k) {
        if(nums==null || nums.length==0) return new int[]{};
        int[] result=new int[nums.length-k+1];
        int index=0;
        boolean status=true;
        for (int i = 0; i <nums.length-k+1  ; i++) {
            int newAddIndex=i+k-1;
            if(index>0 && newAddIndex<nums.length&& result[index-1]<nums[newAddIndex]){
                result[index]=nums[newAddIndex];
            }else if(!status && newAddIndex< nums.length){
                result[index]=Math.max(result[index-1],nums[newAddIndex]);
            }else {
                int max=Integer.MIN_VALUE;
                for (int j = i; j <i+k && j<nums.length; j++) {
                    max=Math.max(max,nums[j]);
                }
                result[index]=max;
            }
            if(result[index]!=nums[i]) {
                status=false;
            }else{
                status=true;
            }
            index++;
        }
        return result;
    }


    public static int[] twoSumV1(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int n:nums){
            if(map.containsKey(n)){
                return new int[]{map.get(n),n};
            }else {
                map.put(target-n,n);
            }
        }
        return null;
    }

    public static int minArrayBinarySearch(int[] numbers) {
        if(numbers==null || numbers.length==0) return 0;
        if(numbers.length==1) return numbers[0];
        int left=0;
        int right=numbers.length-1;
        boolean status=false;
        if(numbers[left]<numbers[right]) status=true;
        while(left<right){
            if(left==right-1){
                return Math.min(numbers[left],numbers[right]);
            }
            int mid=(left+right)/2;
            if(numbers[left]>numbers[mid]){
                right=mid;
            }else if(numbers[left]==numbers[right]) {
                left++;
                if(numbers[left]<numbers[right]) status=true;
            }else {
                if(status){
                    right=mid;
                }else {
                    left = mid;
                }
            }


        }
        return -1;
    }
    public static int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
        for (int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                return nums[i];
            }
        }
        return 0;
    }


    public static int missingNumber1(int[] nums) {
        if(nums.length>0 && nums[0]!=0) return 0;
        int big=nums[nums.length-1];
        int sum=big*(big+1)/2;
        int numSum=0;
        for(int n:nums){
            numSum+=n;
        }
        if(sum-numSum==0){
            return big+1;
        }else{
            return sum-numSum;
        }
    }
    public static int removeDuplicates1(int[] nums) {
        int i=1,count=1,length=nums.length;
        while(i<length){
            if(nums[i]==nums[i-1]){
                count++;
                if(count>2){
                    removeElements(nums,i);
                    i--;
                    length--;
                }
            }else {
                count=1;
            }
                i++;
        }
        return length;
    }

    private static void removeElements(int[] nums, int i) {
        for (int j = i+1; j <nums.length ; j++) {
            nums[j-1]=nums[j];
        }
    }

    /*public static int removeDuplicates(int[] nums) {
        int temp=nums[0];
        int count=1;
        int toModify=0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]==temp){
                count++;
                if(count>2){
                    toModify=i;
                }
            }else if(toModify>0) {
                //要替换
                nums[toModify]=nums[i];
                temp=nums[i];
                count=1;
                nums[i]=-10001;
            }else{
                temp=nums[i];
                count=1;
            }
        }

    }*/
    public static int[][] merge(int[][] intervals) {
        int[][] result=new int[intervals.length][];
        int index=0;
        int temp=intervals[0][intervals[0].length-1];
        for (int i = 1; i <intervals.length ; i++) {
            if(temp>=intervals[i][0]){
                int[] a=new int[]{intervals[i-1][0],intervals[i][intervals[i].length-1]};
                result[index]=a;
            }else{
                if(i==1){
                    result[index]=intervals[i-1];
                    index++;
                }
                result[index]=intervals[i];
            }
            index++;
            temp=intervals[i][intervals[i].length-1];


        }
        return  Arrays.copyOfRange(result,0,index);
    }

   /* public static int[] sort(int[] a){
        int[] result
    }*/


    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    public static int[] searchRange(int[] nums, int target) {
        int mid=(nums.length-1)/2;
        int n1=0;
        int n2=0;
        if(nums[mid]>target){
            n1=binarySearch(nums,0,mid,target,true);
            n2=binarySearch(nums,0,mid,target,false);
        }else if(nums[mid]<=target){
            n1=binarySearch(nums,mid,nums.length-1,target,true);
            n2=binarySearch(nums,mid,nums.length-1,target,false);

        }
        if(n1==n2-1){
            return new int[]{-1,-1};
        }
        return Arrays.copyOfRange(nums,n1,n2);
    }
    private static int binarySearch(int[] nums,int left,int right,int target,boolean isBigger){
        while(left<right-1){
            int mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]>target){
                left=mid+1;
            }
        }

        if(left==right-1){
            if(isBigger){
                if(nums[right]>target){
                    return right;
                }
            }else{
                if(nums[right]>=target){
                    return left;
                }
            }
        }
        return 0;

    }
   /* public static int majorityElement1(int[] nums) {

    }*/
    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] result=new int[101*101][2];
        int index=0;
        Map<String,List> map=new HashMap<>();
        for (int i = 0; i <R ; i++) {
            for (int j = 0; j <C ; j++) {
                int sum=Math.abs(i-r0)+Math.abs(j-c0);
                result[index]=new int[]{i,j};
                if(map.containsKey(sum+"")){
                    List<Integer> list2=map.get(sum+"");
                    list2.add(index);
                    map.put(sum+"",list2);
                }else {
                    List<Integer> list1=new ArrayList<>();
                    list1.add(index);
                    map.put(sum+"",list1);
                }
                index++;
            }
        }
        result=Arrays.copyOf(result,index);
        int rIndex=0;
        int[][] r=new int[result.length][2];
        for (int i = 0; i <R+C ; i++) {
            if(map.containsKey(i+"")){
                List<Integer> list=map.get(i+"");
                for(Integer l:list){
                    r[rIndex]=result[l];
                    rIndex++;
                }
            }

        }

        return r;
    }
    public static List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
        }
        int temp=0;
        List<Integer> list=new ArrayList<>();
        for (int i = nums.length-1; i >=0; i--) {
            if(temp+nums[i]<=sum-nums[i]-temp){
                list.add(nums[i]);
                temp+=nums[i];
            }else {
                list.add(nums[i]);
                return list;
            }
        }
        return null;
    }
    public static int[] sortByBits1(int[] arr) {
        int[] bit=new int[10001];
        List<Integer> list=new ArrayList<>();
        for (int x:arr){
            list.add(x);
            bit[x]=getBinary(x);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                if(bit[x]!=bit[y]){
                    return bit[x]-bit[y];
                }else {
                    return x-y;
                }
            }
        });

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=list.get(i);
        }
        return arr;

    }



    /*public static int[] sortByBits1(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int a:arr){
            max=Math.max(max,a);
        }
        int[] nums=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            nums[i]=getBinary(arr[i]);
            if(arr[i]==0){
                nums[i]=-1;
            }
        }
        Arrays.sort(nums);
        int[] result=new int[arr.length];
        int index=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                result[index]=
            }
        }
    }*/
    static int getBinary(int x){
        int res = 0;
        while (x != 0) {
            res += x % 2;
            x /= 2;
        }
        return res;
    }
    public static int[] sortByBits(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int a:arr){
            max=Math.max(max,a);
        }
        int[] nums=new int[max+1];
        int numsMax=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            int number=getBinary(arr[i]);
            nums[i]=number;
            numsMax=Math.max(numsMax,nums[i]);
        }
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=nums[i]*10000-nums[i]+10000;
        }
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=10000-nums[i]%10000;
        }
        return nums;
    }
    public static int[] sortArrayByParityII(int[] A) {
        int a1=0;
        int a2=0;
        int[] a=new int[A.length/2];
        int[] b=new int[A.length/2];
        for(int i=0;i<A.length;i++){
            if(A[i] %2==0) {
                b[a2]=A[i];
                a2++;
            }else {
                a[a1]=A[i];
                a1++;
            }
        }
        int i1=0;
        int i2=0;
        int index=0;
        int[] array=new int[A.length];
        while(index<A.length){
            if(index %2==0){
                //双数
                array[index]=b[i2];
                i2++;
            }else{
                //单数
                array[index]=a[i1];
                i1++;
            }
            index++;

        }
        return array;
    }

    /*public static boolean canFormArray(int[] arr, int[][] pieces) {
        Map<String,Object> map1=new HashMap<>();
        Map<String,Object> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map1.put(i+"",arr[i]);
        }
        for (int i = 0; i < pieces.length; i++) {
            int[] temp=pieces[i];
            map.put(i+"",temp);
        }

        for (int i = 0; i <map.size() ; i++) {
            int[] temp= (int[]) map.get(i+"");

        }
    }*/

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int sum=0;
        Arrays.sort(boxTypes,(o1,o2)->(o2[1]-o1[1]));
        for (int i = 0; i <boxTypes.length && truckSize>0 ; i++) {
            int num=Math.min(truckSize,boxTypes[i][0]);
            truckSize=truckSize-num;
            sum+=num*boxTypes[i][1];
        }
        return sum;
    }
    public static int maximumProduct(int[] nums) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        for (int n:nums){
            if(n>=0){
                a.add(n);
            }else {
               b.add(n);
            }
        }
        Collections.sort(a);
        Collections.sort(b);
        if(b.size()==0){
            return a.get(a.size()-1)*a.get(a.size()-2)*a.get(a.size()-3);
        }else if(b.size()==1){
            if(a.size()<3){
                return a.get(0)*a.get(1)*b.get(0);
            }else{
                return a.get(a.size()-1)*a.get(a.size()-2)*a.get(a.size()-3);
            }
        }else if(b.size()>=2){
            if(a.size()==0){
                return b.get(b.size()-1)*b.get(b.size()-3)*b.get(b.size()-2);
            }else  if(a.size()==1){
                return a.get(0)*b.get(0)*b.get(1);
            }else if(a.size()==2){
                return a.get(a.size()-1)*b.get(0)*b.get(1);
            }else{
                return Math.max(a.get(a.size()-1)*a.get(a.size()-2)*a.get(a.size()-3),b.get(1)*b.get(0)*a.get(a.size()-1));
            }
        }
        return 0;


    }
    public static int minCostClimbingStairs1(int[] cost) {
        int n=cost.length;
        int pre=0;
        int curr=0;
        for (int i = 2; i <=n ; i++) {
            int next=Math.min(curr+cost[i-1],pre+cost[i-2]);
            pre=curr;
            curr=next;
            System.out.println("i="+i);
            System.out.println(next);
        }
        return curr;
    }
    public static int minCostClimbingStairs(int[] cost) {
        if(cost==null || cost.length<2) return 0;
        int[] dp=new int[cost.length];
        dp[0]=Math.min(cost[0],cost[1]);

        dp[1]=dp[0];
        int step=0;
        if(cost[0]>cost[1]){
            step=1;
            dp[2]=cost[1]+cost[2];
        }else {
            step=2;
            dp[2]=cost[0]+cost[2];
        }
        for (int i = 3; i <cost.length ; i++) {
            if(dp[i-1]+cost[i]<dp[i-2]+cost[i]){
                dp[i]=dp[i-1]+cost[i];
                step=1;
            }else{
                dp[i]=dp[i-2]+cost[i];
                step=2;
            }


            System.out.println("step:"+step);
            System.out.println("i="+i+","+dp[i]);

        }
        return dp[cost.length-1];
    }
    public static int climbStairs(int n) {
        if(n<1) return 0;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <=n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
            System.out.println("i="+i+",dp:"+dp[i]);
        }
        return dp[n];
    }

    public static int maxProfit(int[] prices) {
        if(prices==null || prices.length<2) return 0;
        int[] dp=new int[prices.length];
        int min=prices[0];
        dp[0]=0;
        dp[1]=Math.max(prices[1]-min,dp[0]);
        min=Math.min(min,prices[1]);
        for (int i = 2; i <prices.length ; i++) {
            dp[i]=Math.max(prices[i]-min,dp[i-1]);
            min=Math.min(min,prices[i]);
        }
        return dp[prices.length-1];
    }
    public static int largestPerimeterV1(int[] A) {
        Arrays.sort(A);
        for (int i = A.length-1; i >=2 ; i--) {
            if(A[i]<A[i-1]+A[i-2]){
                return A[i-1]+A[i-2]+A[i];
            }
        }
        return 0;
    }
    public static int[] merge1(int[] A, int m, int[] B, int n) {

        int length=m+n;
        while(m>0 && n>0){
            if(A[m-1]>B[n-1]){
                A[length-1]=A[m-1];
                m--;
            }else{
                A[length-1]=B[n-1];
                n--;
            }
            length--;
        }
        if(m==0 && n>0){
            for(int i=0;i<n;i++){
                A[i]=B[i];
            }
        }
        return A;
    }
    public static int missingNumber(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int numsSum=0;
        int sum=nums.length*(nums.length+1)/2;
        for (int i = 0; i <nums.length ; i++) {
            numsSum+=nums[i];
        }
        return sum-numsSum;
    }

    public static void reverseString(char[] s) {
        if(s==null || s.length==0) return;
        for (int i = 0; i <=s.length/2 ; i++) {
            if(i<s.length-1-i){
                char temp=s[s.length-1-i];
                s[s.length-1-i]=s[i];
                s[i]=temp;
                System.out.println(s[i]);
            }
        }
        return;
    }


    public static boolean isSubsequence(String s, String t) {
        int start=0;
        for (int i = 0; i <s.length() ; i++) {
            String str=s.substring(i,i+1);
            boolean status=false;
            if(start>t.length()-1) return false;
            for (int j = start; j <t.length() ; j++) {
                if(str.equals(t.substring(j,j+1))){
                    start=j+1;
                    status=true;
                    break;
                }
            }
            if(!status){
                return false;
            }
        }

        return true;
    }
    private static String countAndSayV1(int n){
        if(n<1) return "";
        if(n==1) return "1";
        String[] dp=new String[n];
        dp[0]="1";

        for (int i = 1; i <n ; i++) {
            dp[i]=getString(dp[i-1]);
        }
        return dp[n-1];
      /*  String temp="1";
        for (int i = 2; i <=n ; i++) {
            String result="";
            String index=temp.substring(0,1);
            int size=1;
            for (int j = 1; j <temp.length() ; j++) {

            }
        }*/
    }
    private static String countAndSay(int n){
        return getString(n-1);
    }
    private static String getString(int n) {
        //if(n=1)
        return getString(n-1);
    }
    private static String getString(String desc) {
        String result="";
        int count=0;
        String temp="";
        for (int i = 0; i <desc.length() ; i++) {
            String currStr=desc.substring(i,i+1);
            if("".equals(temp)){
                temp=currStr;
                count=1;
                continue;
            }
            if(temp.equals(currStr)) {
                count++;
            }else{
                result+=(count+temp);
                temp=currStr;
                count=1;
            }
        }
        if(count!=0){
            result+=(count+temp);
        }
        System.out.println("before:"+desc+",after:"+result);
        return result;
    }
    public static int maxSubArray2(int[] nums) {
        int pre=0;
        int max=nums[0];
        for(int x:nums){
            pre=Math.max(pre+x,x);
            max=Math.max(max,pre);
        }
        return max;
    }
    public static int maxSubArray1(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int preSum=nums[0];
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for (int i = 1; i <nums.length; i++) {
            if(nums[i]<=0){
                System.out.println("nums[i]<=0");
                dp[i]=Math.max(dp[i-1],nums[i]);
            }else {
                System.out.println("nums[i]>0");
                if (preSum < 0) {
                    System.out.println("preSum <= 0,preSum="+preSum);
                    //dp[i] = Math.max(preSum+nums[i],nums[i]);
                    dp[i] =Math.max(dp[i-1],nums[i]);
                } else {
                    System.out.println("preSum > 0,preSum="+preSum);
                    dp[i] = Math.max(preSum + nums[i],dp[i-1]);
                }
            }
            if(dp[i]==nums[i] || preSum<0) preSum=0;
            preSum+=nums[i];
            System.out.println("round 1 over，i="+i+",dp="+dp[i]);
            System.out.println("preSum="+preSum);
        }
        return dp[nums.length-1];
    }
    public static List<String> summaryRanges(int[] nums) {
        if(nums==null || nums.length==0) return new ArrayList<>();
        int start=nums[0];
        int pre=nums[0];
        int end=nums[0];
        List<String> list=new ArrayList<>();
        int length=1;
        while(length<=nums.length){
            if(length==nums.length) {
                if(start==end){
                    list.add(start+"");
                }else {
                    list.add(start + "->" + end);
                }
                return list;
            }
            if(pre!=(nums[length]-1)){
                if(start==end){
                    list.add(start+"");
                }else {
                    list.add(start + "->" + end);
                }
                start=nums[length];
                pre=start;
                end=start;
            }else{
                pre++;
                end=nums[length];
            }
            length++;
        }
        return list;

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null || nums.length==0) return false;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else{
                int index=map.get(nums[i]);
                int value=i-index>0?i-index:index-i;
                if(value<=k ){
                    return true;
                }else{
                    map.put(nums[i],i);
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0) return false;
        Set<Integer> sets=new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            sets.add(nums[i]);
        }
        if(sets.size()<nums.length)return  true;
        return false;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        if(rowIndex==0){
            return list;
        }
        List<Integer> rows=getRow(rowIndex-1);
        for (int i = 0; i <rows.size()-1 ; i++) {
            list.add(rows.get(i)+rows.get(i+1));
        }
        list.add(1);
        return list;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0) return result;
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        result.add(list1);

        for (int i = 1; i <numRows ; i++) {
            List<Integer> list=result.get(i-1);
            List<Integer> numbers=new ArrayList<>();
            numbers.add(1);
            for (int j = 0; j < list.size()-1; j++) {
                int number=list.get(j)+list.get(j+1);
                numbers.add(number);
            }
            numbers.add(1);
            result.add(numbers);
        }
        return result;

    }

    List<Integer> create(int rows,List<Integer> preList){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        for (int i = 0; i <preList.size()+2 ; i++) {

        }
        return list;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums1.length==0) return;
        if(nums2==null || nums2.length==0) return;
        int i=m-1;
        int j=n-1;
        int pointer=1;
        while(j>=0 && i>=0){
            if(nums1[i]<=nums2[j]){
                nums1[nums1.length-pointer]=nums2[j];
                j--;
            }else{
                nums1[nums1.length-pointer]=nums1[i];
                i--;

            }
            pointer++;
        }
        System.arraycopy(nums2,0,nums1,0,j+1);

        printArray(nums1);

    }

    public static int[] twoSum(int[] numbers, int target) {
        if(numbers==null || numbers.length==0) return new int[]{};
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <numbers.length ; i++) {
            if(!map.containsKey(numbers[i])) {
                map.put(target - numbers[i], i+1);
            }else{
                return new int[]{map.get(numbers[i]),i+1};
            }

        }
        return new int[]{};
    }


    public static int majorityElement(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int preValue=nums[0];
        int preValueNum=1;
        for (int i = 1; i <nums.length ; i++) {
            if(preValue==nums[i]){
                preValueNum++;
            }else {
                preValueNum--;
                if(preValueNum==0){
                    preValue=nums[i];
                    preValueNum=1;
                }
            }
        }
        return preValue;
    }
    public static int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0]+nums[1],dp[0]);
        dp[1]=Math.max(dp[1],nums[1]);
        System.out.println("1:"+dp[1]);
        for (int i = 2; i <nums.length ; i++) {
            dp[i]=Math.max(dp[i-1]+nums[i],dp[i-1]);
            for (int j = i-1; j >0; j--) {
                dp[i]=Math.max(dp[i],dp[i]-nums[j]);
            }
            System.out.println(dp[i]);
        }

        return dp[nums.length-1];
    }

    /**
     * 相隔数组最大值
     * @param nums
     * @return
     */
    public static int rob(int[] nums) {
        /*int value1=0;
        int value2=0;
        for (int i = 0; i <nums.length ; i++) {
            if(i % 2==0) {
                value2+=nums[i];
            }else {
                value1+=nums[i];
            }
        }
        return value1>value2?value1:value2;*/
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }

    /**
     * 二进制相加
     * 输入: a = "11", b = "1"
     * 输出: "100"
     * 重点考虑：进位 需加一位的问题
     * @param a
     * @param b
     * @return
     */
    public static  String addBinary(String a, String b) {
        int number1=binaryToTen(a);
        int number2=binaryToTen(b);
        return tenToBinary(number1+number2);
    }

    private static String tenToBinary(int number) {
        if(number==0)return "";
        int value=0;
        int result=1;
        String resultStr="";
        while(number==0){
            value=number/2;
            if(value==0)

            for (int i = 1; i <=value ; i++) {
                result=result*2;
            }
            number=number-result;
            result=1;
        }

        return "";
    }

    private static int binaryToTen(String a) {
        int number=0;
        int step=1;
        for (int i = a.length()-1; i >=0 ; i--) {
            if("1".equals(a.substring(i,i+1))){
                if(step==1){
                    number=1;
                }else{
                    number=number+2*step;
                }
                step=step*2;
            }
        }
        return number;
    }

    public static int lengthOfLastWord(String s) {
        int count=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(" ".equals(s.substring(i,i+1))){
                if(count==0) continue;
                return count;
            }else {
                count++;
            }
        }
        return count;
    }
    private static void printArray(int[] plusOne) {
        for (int i = 0; i <plusOne.length ; i++) {
            System.out.println("i="+plusOne[i]);
        }
    }
    public static int[] plusOneV1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    private static int[] plusOne(int[] digits){
        if(digits[0]==0){
            digits[0]=1;
            return digits;
        }
        int last=digits[digits.length-1];
        if(last<9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        }else{
            int value=0;
            for (int i = digits.length-1; i >=0 ; i--) {
                int temp=digits[i]+value;
                if(i== digits.length-1) temp++;
                digits[i]=(temp)% 10;
                value=(temp)/10;
            }
        }
        return digits;
    }



    private static int searchInsertV1(int[] nums,int target){
         int length=nums.length;
        int left=0;
        int right=length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
       return left;
    }
    private static int searchInsert(int[] nums,int target){
        /*int temp=nums[0];
        if(nums.length==1 && target>temp) return nums.length;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target && temp<target){
                return i;
            }
            if(i==nums.length-1 && target>nums[i]) return i+1;
            temp=nums[i];
        }
        return 0;*/
       /* for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>=target) return i;

        }
        return nums.length;*/

      return midSearch(nums,0, nums.length-1,target);



    }

    private static int midSearch(int[] nums, int startIndex, int endIndex, int target) {
        if(startIndex>=endIndex){
            return startIndex+1;
        }
        int mid=(endIndex-startIndex)/2+1;
        if(nums[mid]<target){
           return midSearch(nums,mid+1,endIndex,target);
        }else{
           return midSearch(nums,startIndex,mid-1,target);
        }

    }
    /**
     * 实现strStr()
     * @param haystack
     * @param needle
     * @return
     */
    private static int getIndexStr(String haystack,String needle){
        if( needle.length()==0) return 0;
        if(needle.length()>haystack.length()) return -1;
        int j=0;
        String indexStr=needle.substring(j,j+1);
        for (int i = 0; i <haystack.length() ; i++) {
            if(haystack.substring(i,i+1).equals(indexStr)){
                System.out.println("i="+i);
                if(i+needle.length()>haystack.length()){
                    return -1;
                }
                if(needle.equals(haystack.substring(i,i+needle.length()))){
                    return i;
                }
            }

        }

        return -1;
    }
    private static int getLengthV1(int[] nums) {
        if(nums.length==0) return 0;
        int i=0;
        for (int j = 1; j <nums.length ; j++) {
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    /**
     * 移除有序数组中的重复项
     * @param nums
     * @return
     */
    private static int getLength(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int pointer=0;
        int preInt=nums[0];
        for (int i = 1; i <nums.length; i++) {
            if(nums[i]!=preInt){
                nums[pointer+1]=nums[i];
                pointer++;


            }
            preInt=nums[i];
        }

        int[] result=new int[pointer+1];
        int i=0;
        for (int j = 0; j <=pointer ; j++) {
            result[i]=nums[j];
            System.out.println(result[i]);
            i++;
        }

        return pointer+1;
    }


}
