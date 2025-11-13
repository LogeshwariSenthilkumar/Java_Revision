class Greeting{
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
       System.out.println("Hello "+name);
    }
    public static void main(String[] args){
        Greeting.sayHello();
        Greeting.sayHello("Logu");
    }
}

class MathUtils{
    static void multiply(int a,int b){
        System.out.println("Addition: "+(a+b));
    }
    static void multiply(double a,double b){
        System.out.println("Addition Double: "+(a+b));
    }
    public static void main(String[] args){
        MathUtils.multiply(2,3);
        MathUtils.multiply(3.4,4.6);
    }
}