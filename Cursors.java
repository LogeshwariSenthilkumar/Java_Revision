import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        Iterator i=al.iterator();
        while(i.hasNext()){
            int num=(int)i.next();
            if(num%2!=0){
                i.remove();
            }
        }
        System.out.println(al);


    }
}

class Demo1{
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(20);
        ll.add(80);
        ll.add(89);
        ll.add(78);
        System.out.println(ll);
        ListIterator li=ll.listIterator();
        System.out.println("Forward::");
        while(li.hasNext()){
            System.out.print(li.next()+" ");
        }
        System.out.println("\nBackward::");
        while(li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }
        
    }
}