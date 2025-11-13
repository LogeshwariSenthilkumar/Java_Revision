class Animal{
    Animal(){
        System.out.println("Animal Created");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog Created");
    }
    public static void main(String[] args){
        Dog d=new Dog();
    }
}

class Person{
    void display(){
        System.out.println("Person Display Mtd");
    }
}
class Teacher extends Person{
    void display(){
        super.display();
        System.out.println("Teacher Display Mtd");
    }
    public static void main(String[] args){
        Teacher t=new Teacher();
        t.display();
    }
}