import java.util.*;
class Demo{
    public static void main(String[] args){
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Logu");
        ll.add("Chitra");
        ll.add("Janani");
        ll.add("Senthil");
        System.out.println(ll);
        Collections.reverse(ll);
        System.out.println(ll);
    }
}

class Demo1{
    public static void main(String[] args){
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Logu");
        ll.add("Chitra");
        ll.add("Janani");
        ll.add("Senthil");
        System.out.println(ll);
        ArrayList<String> al=new ArrayList<>(ll);
        System.out.println(al);
    }
}