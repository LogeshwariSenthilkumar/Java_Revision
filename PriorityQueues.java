import java.util.*;
class Demo{
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(20);
        pq.offer(30);
        pq.offer(3);
        pq.offer(1);
        pq.offer(7);
        pq.offer(17);
        pq.offer(70);
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}

class Demo1{
    public static void main(String[] args){
        PriorityQueue<String> p=new PriorityQueue<>();
        p.offer("Logu");
        p.offer("Senthil");
        p.offer("Sanjay");
        p.offer("Chitra");
        p.offer("Janani");
        System.out.println(p);
        System.out.println(p.peek());
        System.out.println(p);
    }
}