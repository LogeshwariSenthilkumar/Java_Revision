import java.util.function.BiFunction;
class Demo{
    public static void main(String[] args){
        BiFunction<Integer,Integer,Integer> sum=(n1,n2)->n1+n2;
        System.out.println(sum.apply(1,2));
    }
}

class Demo1{
    public static void main(String[] args){
        BiFunction<String,String,String> fullname=(first,last)->first.concat(last);
        System.out.println(fullname.apply("Logu"," Senthil"));
    }
}