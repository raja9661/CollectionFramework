import java.util.*;
public class PriorityQueue_java {
    public static void main(String args[])
    {
        PriorityQueue pq=new PriorityQueue();
        pq.add(23);
        pq.add(56);
        pq.add(90);
        pq.add(30);
        //pq.add("raja");
        System.out.println(pq);
        PriorityQueue pq1=new PriorityQueue();
        pq1.addAll(pq);
        // pq1.add("raja");
        System.out.println(pq1);
    }
}
