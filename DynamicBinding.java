class Animal{
    void sound(){
        System.out.println("Animal Sound Mtd");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barking");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}
class Main{
    public static void main(String[] args){
        Animal a=new Dog();
        a.sound();
        Animal a1=new Cat();
        a1.sound();
    }
}

class Shape{
    void draw(){
        System.out.println("Drawing Shapes");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
}
class Main2{
    public static void main(String[] args){
        Shape s=new Circle();
        s.draw();
        Shape s1=new Square();
        s1.draw();
    }
}