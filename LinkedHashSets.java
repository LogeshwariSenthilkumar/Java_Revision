import java.util.*;
class Demo{
    public static void main(String[] args){
        LinkedHashSet<Integer> ll=new LinkedHashSet<>();
        ll.add(20);
        ll.add(50);
        ll.add(40);
        ll.add(30);
        ll.add(10);
        System.out.println(ll);
    }
}

class Demo1{
    public static void main(String[] args){
        LinkedHashSet<Integer> ll1=new LinkedHashSet<>();
        ll1.add(2);
        ll1.add(5);
        ll1.add(4);
        ll1.add(3);
        ll1.add(1);
        System.out.println(ll1);
        Iterator i=ll1.iterator();
        while(i.hasNext()){
            int num=(int)i.next();
            if(num%2==0){
                i.remove();
            }
        }
        System.out.println(ll1);

    }
}