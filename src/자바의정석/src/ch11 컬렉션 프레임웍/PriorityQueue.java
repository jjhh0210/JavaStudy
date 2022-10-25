import java.util.*;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue pq = new java.util.PriorityQueue();
        pq.offer(3);
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq); //1,2,5,3,4로 출력되는 이유: 힙으로 저장돼서
        Object obj = null;
        while ((obj = pq.poll()) != null) {
            //요소가 null이 아닐동안 꺼냄
            System.out.println(obj);
        }
    }
}
