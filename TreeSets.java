import java.util.*;
class Demo{
    public static void main(String[] args){
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(20);
        ts.add(40);
        ts.add(10);
        ts.add(50);
        ts.add(30);
        System.out.println(ts);
        System.out.println(ts.descendingSet());
        System.out.println(ts.higher(30));
        System.out.println(ts.lower(30));
        System.out.println(ts.ceiling(30));
        System.out.println(ts.floor(30));

    }
}