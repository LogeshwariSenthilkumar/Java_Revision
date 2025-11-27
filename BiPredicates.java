import java.util.*;
import java.util.function.BiPredicate;
class Demo{
    public static void main(String[] args){
        BiPredicate<Integer,Integer> sumandeven=(n1,n2)->(n1+n2)%2==0;
        System.out.println(sumandeven.test(2,2));
        System.out.println(sumandeven.test(2,1));
    }
}

class Demo1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the UserName:");
    String uname=sc.nextLine();
    System.out.println("Enter the Password:");
    Integer upwd=Integer.valueOf(sc.nextInt());
    BiPredicate<String,Integer> verify=(name,pwd)->name.equals("Logu") && pwd==1234;
    if(verify.test(uname,upwd)){
        System.out.println("Login Successful");
    }
    else{
        System.out.println("Invalid Login");
    }
  }
}