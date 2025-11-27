import java.util.*;
import java.util.function.BiConsumer;
class Demo{
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Logu");
        hm.put(2,"Bharath");
        hm.put(3,"Janani");
        BiConsumer<Object,Object> prints=(num,str)->System.out.println(num+" "+str);
        for(Map.Entry m:hm.entrySet()){
            prints.accept(m.getKey(),m.getValue());
        }
    }
}


class Demo1{
    public static void main(String[] args){
      BiConsumer<Integer,Integer> sum=(n1,n2)->System.out.println(n1+n2);
      sum.accept(2,9);
    }
}