import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(20);
        al.add(10);
        al.add(30);
        al.add(60);
        al.add(70);
        al.forEach(System.out::println);

    }
}

interface One{
    void show();
}
class Demo1{
    void display(){
        System.out.println("Display Method");
    }
    public static void main(String[] args){
        Demo1 d=new Demo1();
        One o=d::display;
        o.show();
    }
}