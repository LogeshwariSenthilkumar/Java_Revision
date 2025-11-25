import java.util.*;
class Demo{
    public static void main(String[] args){
        HashSet<String> hs=new HashSet<>();
        hs.add("Logu");
        hs.add("Janani");
        hs.add("Barani");
        hs.add("Chitra");
        hs.add("Logu");
        System.out.println(hs);
        ArrayList<String> al=new ArrayList<>(hs);
        System.out.println(al);
    }
}