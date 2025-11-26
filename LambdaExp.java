import java.util.*;
@FunctionalInterface
interface One{
    String oddOrEven(int num);
}
class Demo{
    public static void main(String[] args){
        One o=(n)->(n%2==0)?"Even":"Odd";
        System.out.println(o.oddOrEven(7));
    }
}


class Demo1{
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<>();
        al.add("Logu");
        al.add("Janani");
        al.add("Chitra");
        Collections.sort(al,(a,b)->b.compareTo(a));
        System.out.println(al);
       
    }
}