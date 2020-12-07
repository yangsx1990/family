package com.family.base;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/11/30 上午10:40
 * @modified By:
 */
public class PriorityQueueTest {


    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>(7);
        Random random=new Random();
        for (int i = 0; i <7 ; i++) {
            queue.add(new Integer(random.nextInt(100)));
        }

        for (int i = 0; i <7 ; i++) {
            Integer in=queue.poll();
            System.out.println("Processing integer:"+in);
        }

        //优先队列
        Queue<QueueModel> priorityQueue=new PriorityQueue<>(7,idComparatort);
        addQueue(priorityQueue);
        pollQueue(priorityQueue);
    }

    private static void pollQueue(Queue<QueueModel> priorityQueue) {
        while (true){
            QueueModel model=priorityQueue.poll();
            if(model==null){
                break;
            }
            System.out.println("process model with id="+model.getId());
        }
    }

    private static void addQueue(Queue<QueueModel> priorityQueue) {
        Random random=new Random();
        for (int i = 0; i <7 ; i++) {
            int id=random.nextInt(100);
            priorityQueue.add(new QueueModel(id,id+"&"+i));
        }
    }

    private static Comparator<QueueModel> idComparatort=new Comparator<QueueModel>(){

        @Override
        public int compare(QueueModel o1, QueueModel o2) {
            return o1.getId()-o2.getId();
        }
    };
}
