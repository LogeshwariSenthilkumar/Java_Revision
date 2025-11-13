class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}

class Vehicle {
    void start(){
        System.out.println("Starting...");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Driving...");
    }
    public static void main(String[] args){
        Car c=new Car();
        c.start();
        c.drive();
    }
}