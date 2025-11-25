import java.util.*;
class Demo{
    public static void main(String[] args){
        TreeMap<Integer,String> t=new TreeMap<>();
        t.put(103,"Ikigai");
        t.put(105,"Atomic Habits");
        t.put(102,"The Alchemist");
        t.put(101,"Rich Dad Poor Dad ");
        t.put(104,"Think & Grow Rich");
        System.out.println(t);

        System.out.println(t.firstEntry());
        System.out.println(t.lastEntry());
        System.out.println(t.headMap(103));
        System.out.println(t.tailMap(103));
    }
}