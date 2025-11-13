class Display{
    void show(){
        System.out.println("No Parameter Show Mtd");
    }
    void show(String name){
        System.out.println("String Parameter Mtd");
    }
    public static void main(String[] args){
        Display d=new Display();
        d.show();
        d.show("Logu");
    }
}

class MathOperation{
    void add(int a,int b){
        System.out.println("Addition: "+(a+b));
    }
    void add(double a,double b,double c){
        System.out.println("Addition : "+(a+b+c));
    }
    public static void main(String[] args){
        MathOperation m=new MathOperation();
        m.add(4,7);
        m.add(5.2,4.8,9.8);
    }
}

class Bank{
    void getInterestRate(){
        System.out.println("Interest rate is done");
    }
}
class SBI extends Bank{
    public void getInterestRate(){
        System.out.println("Interest Rate by SBI");
    }
}
class HDFC extends Bank{
    public void getInterestRate(){
        System.out.println("Interest Rate by HDFC");
    }
}
class Main{
    public static void main(String[] args){
        SBI sbi=new SBI();
        sbi.getInterestRate();
        HDFC hdfc=new HDFC();
        hdfc.getInterestRate();
        Bank bank=new Bank();
        bank.getInterestRate();
    }
}

class Shape{
    void area(){
        System.out.println("Area of Shapes");
    }
}
class Circle extends Shape{
  void area(){
    System.out.println("Area of Circle");
  }
}
class Rectangle extends Shape{
    void area(){
        System.out.println("Area of Rectangle");
    }
}
class Main2{
    public static void main(String[] args){
        Shape s=new Shape();
        s.area();
        Circle c=new Circle();
        c.area();
        Rectangle r=new Rectangle();
        r.area();
    }
}