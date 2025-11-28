import java.util.*;
class Demo{
    public static void main(String[] args){
        int[] arr={1,2,34,5,10,11,19,5,6};
        Arrays.stream(arr)
              .filter(n->n>10)
              .forEach(System.out::println);
    }
}

class Demo1{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        Optional<Integer> sum=al.stream().reduce((acc,i)->acc+i);
        System.out.println(sum.get());
    }
}