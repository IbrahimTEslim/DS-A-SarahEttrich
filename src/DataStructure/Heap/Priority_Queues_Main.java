package DataStructure.Heap;

import java.util.PriorityQueue;

public class Priority_Queues_Main {
    public static void main(String[] arg) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(8);
        pq.add(16);
        pq.add(32);
        pq.add(64);
        pq.add(128);
        pq.add(256);
        pq.add(1024);
        pq.add(512);


//        System.out.println(pq.peek());
        pq.remove();
//        pq.poll();
//        System.out.println(pq.peek());
//        System.out.println("\n\n");
        Object[] o=pq.toArray();

        for(Object oo:o)
            System.out.println(oo);
    }
}
