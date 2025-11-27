@FunctionalInterface
interface One{
    void printMsg();
}
class Demo{
    public static void main(String[] args)
    {
        One o=()->System.out.println("Hello");
        o.printMsg();
    }
}

@FunctionalInterface
interface Calculator{
    void operate(int a,int b);
}
class Demo1{
    public static void main(String[] args){
        Calculator c=(a,b)->System.out.println(a+b);
        c.operate(5,6);
    }
}