import java.util.*;
import java.util.function.Function;
class Demo{
    public static void main(String[] args){
        Function<String,Integer> len=(str)->str.length();
        System.out.println(len.apply("Logu"));
    }
}

class Demo1{
    public static void main(String[] args){
        Function<Integer,Integer> square=(n)->n*n;
        System.out.println(square.apply(4));
    }
}