import java.util.*;
import java.util.function.Consumer;
class Demo{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        Consumer<Integer> prints=(num)->System.out.println(num);
        for(Integer i:al){
            prints.accept(i);
        }
    }
}

class Demo1{
    public static void main(String[] args){
        Consumer<String> upper=(str)->System.out.println(str.toUpperCase());
        upper.accept("logeshwari");
    }
}