package com.family.algorithm.practice.graph;

import java.util.*;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/3/27 上午10:04
 * @modified By:
 */
public class CourseSchedule {

    public static void main(String[] args) {
        printArray(new CourseSchedule().findOrderV3(4,new int[][]{{1,0},{2,0},{3,1},{3,2}}));
        //printArray(findOrder(2,new int[][]{{1,0},{0,1}}));
        //printArray(new CourseSchedule().findOrderV2(3,new int[][]{{1,0},{0,1},{1,2}}));
    }

    /**
     * 广度优先-根据入度
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public  int[] findOrderV3(int numCourses, int[][] prerequisites) {
        //初始化集合，设置初始值list
        edges=new ArrayList<>();
        inDegree=new int[numCourses];
        arrays=new int[numCourses];

        for (int i = 0; i < numCourses; ++i) {
            edges.add(new ArrayList<Integer>());
        }

        //遍历图，设置每个节点的入度
        for (int[] tempList:prerequisites) {
            edges.get(tempList[1]).add(tempList[0]);
            ++inDegree[tempList[0]];
        }

        Queue<Integer> queue=new LinkedList<>();
        //将入度为0的先放入队列
        for (int i = 0; i <numCourses ; i++) {
            if(inDegree[i]==0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            //从队首取出元素，先放入结果集中
            int first=queue.poll();
            arrays[arraysIndex++]=first;
            //根据队首元素，从list中获取后继节点，入度减一后，放入队列中。
            for (int value:edges.get(first)){
                //入度减一
                --inDegree[value];
                if(inDegree[value]==0){
                    queue.offer(value);
                }
            }
        }
        if(arraysIndex!=numCourses){
            return new int[0];
        }
        return arrays;
    }
    // 存储有向图
    List<List<Integer>> edges;
    //节点状态：0-未搜索到 1-搜索中 2-已完成
    int[] visited;
    //数组模拟栈
    int[] stack;
    //栈下标
    int stackIndex;
    //有向图中是否有环
    boolean valid=true;


    //入度
    int[] inDegree;
    //存储返回数组
    int[] arrays;
    //数组下标
    int arraysIndex;

    /**
     * 深度优先
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public  int[] findOrderV2(int numCourses, int[][] prerequisites) {
        edges=new ArrayList<>();
        //初始化集合
        for(int i=0;i<numCourses;i++){
            edges.add(new ArrayList<>());
        }
        visited=new int[numCourses];
        stack=new int[numCourses];
        stackIndex=numCourses-1;

        //遍历有向图，将节点关系放入集合中
        for (int[] info:prerequisites){
            edges.get(info[1]).add(info[0]);
        }
        //开始深度优先搜索，寻找未搜索的节点
        for(int i=0;i<numCourses && valid; ++i){
            if(visited[i]==0){
                //递归遍历
                dfs(i);
            }
        }
        if(!valid){
            return new int[0];
        }

        return stack;

    }

    private void dfs(int i) {
        //标记为搜索中
        visited[i]=1;
        for (int v:edges.get(i)){
            if(visited[v]==0){
                dfs(v);
                if(!valid){
                    return;
                }
            }else if(visited[v]==1){
                valid=false;
                return;
            }
        }
        //标记为已完成
        visited[i]=2;
        //节点入栈
        stack[stackIndex--]=i;
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer,Integer> map=new HashMap<>();

        for (int i=numCourses-1;i>=0;i--){
            map.put(i,0);
        }
        for (int[] nums:prerequisites){
            map.put(nums[0],map.getOrDefault(nums[0],0)+1);
        }
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<map.size();i++){
            result.add(i,new ArrayList<>());
        }
        for (Integer key:map.keySet()){
            Integer newKey=map.get(key);
            List<Integer> tempList=result.get(newKey);
            if(tempList!=null && !tempList.isEmpty()){
                result.get(newKey).add(key);
            }else {
                result.get(newKey).add(key);
            }


        }
        if(result.get(0).isEmpty()){
            return new int[]{};
        }
        int[] arrays=new int[numCourses];
        int index=0;
        for(int j=0;j<result.size();j++){
            List<Integer> temp=result.get(j);
            if(temp!=null &&!temp.isEmpty()){
                for(Integer value:temp){
                    arrays[index]=value;
                    index++;
                }
            }
        }
        return arrays;
    }



    public static void printArray(int[] arrays){
        for (int a:arrays){
            System.out.println(a);
        }
    }
}
