import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(40);
        al.add(50);
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
    }
}

class Demo1{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(20);
        al.add(40);
        al.add(10);
        al.add(50);
        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));
    }
}