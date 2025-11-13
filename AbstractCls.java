abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
  void start(){
    System.out.println("Car is Starting...");
  }
}
class Bike extends Vehicle{
  void start(){
    System.out.println("Bike is Starting...");
  }
}
class Main{
    public static void main(String[] args){
        Car c=new Car();
        c.start();
        Bike b=new Bike();
        b.start();
    }
}

abstract class Shape{
    abstract void area();
    abstract void perimeter();
}
class Rectangle extends Shape{
    void area(){
        System.out.println("Rectangle Area");
    }
    void perimeter(){
        System.out.println("Rectangle Perimeter");
    }
}
class Circle extends Shape{
    void area(){
        System.out.println("Circle Area");
    }
    void perimeter(){
        System.out.println("Circle Perimeter");
    }
}
class Main2{
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        r.area();
        r.perimeter();
        Circle c=new Circle();
        c.area();
        c.perimeter();
    }
}