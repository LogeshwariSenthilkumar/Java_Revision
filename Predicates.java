import java.util.*;
import java.util.function.Predicate;
class Demo{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String");
      String str=sc.nextLine();
      Predicate<String> withA=(strs)->strs.startsWith("A");
      System.out.println(withA.test(str));
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

    Predicate<Integer> evens=(n)->n%2==0;

    for(Integer i:al){
      if(evens.test(i)){
        System.out.println(i);
      }
    }
  }
}