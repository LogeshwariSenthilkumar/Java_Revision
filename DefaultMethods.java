interface One{
    void printMsg();
    default void show(){
        System.out.println("Show Methods");
    }
}
class Demo {
    public static void main(String[] args)
    {
        One o=()->System.out.println("Hi");
        o.printMsg();
        o.show();
    }
}

interface Area{
    default double calculateArea(int r){
      return 3.14*r*r;
    }
}
class Demo1 implements Area{
    public static void main(String[] args){
      Demo1 d=new Demo1();
      System.out.println(d.calculateArea(5));
    }
}
