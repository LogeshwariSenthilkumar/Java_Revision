import java.util.*;
class Demo{
    public static void main(String[] args){
        Vector<Integer> v=new Vector<>();
        v.add(85);
        v.add(85);
        v.add(85);
        v.add(85);
        v.add(85);
        int sum=0;
        for(Integer i:v){
            sum+=i;
        }
        int avg=sum/5;
        System.out.println(avg);

    }
}

class Demo1{
    public static void main(String[] args){
        int index=4;
        Vector<Integer> v1=new Vector<>();
        v1.add(30);
        v1.add(40);
        v1.add(50);
        v1.add(60);
        v1.add(80);
        v1.add(90);
        v1.add(100);
        System.out.println(v1);
        v1.insertElementAt(70,index);
        System.out.println(v1);
    }
}