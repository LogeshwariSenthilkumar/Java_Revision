import java.util.*;
class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "PersonCls";
    }
    public boolean equals(Object o){
       if(this==o)return true;
       if(!(o instanceof Person))return false;
        Person p=(Person)o;
        return this.id==p.id && this.name.equals(p.name);
    }
}
class Demo{
    public static void main(String[] args){
        Person p1=new Person(101,"Logu");
        Person p2=new Person(102,"Janu");
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
    }
}

class Car{
    int id;
    String model;
    Car(int id,String model){
        this.id=id;
        this.model=model;
    }
    public String toString(){
        return id+" "+model;
    }
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof Car))return false;
        Car c=(Car)o;
        return this.id==c.id && this.model.equals(c.model);
    }
    public int hashCode(){
        return Objects.hash(id,model);
    }
}
class Demo1{
    public static void main(String[] args){
        HashSet h1=new HashSet();
        h1.add(new Car(101,"BMW"));
        h1.add(new Car(102,"Hero"));
        h1.add(new Car(103,"Thar"));
        h1.add(new Car(104,"Benz"));
        h1.add(new Car(102,"Hero"));
        System.out.println(h1);
       
    }
    
    
}
