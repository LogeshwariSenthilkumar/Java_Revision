import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayDeque<Integer> a=new ArrayDeque<>();
        a.offer(20);
        a.offer(30);
        a.offer(10);
        a.offer(50);
        a.offer(60);
        a.offer(70);
        a.offerFirst(89);
        a.offerLast(78);
        System.out.println(a);
    }
}

class Demo1{
    public static void main(String[] args){
        ArrayDeque<Integer> a1=new ArrayDeque<>();
        a1.offer(20);
        a1.offer(30);
        a1.offer(10);
        a1.offer(50);
        a1.offer(60);
        a1.offer(70);
        System.out.println(a1);
        a1.poll();
        System.out.println(a1);
    }
}