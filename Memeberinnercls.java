class Outer{
    int x=10;
    class Inner{
        void prints(){
            System.out.println(x);
        }
    }
}
class Main{
    public static void main(String[] args){
        Outer o=new Outer();
        Outer.Inner i=o.new Inner();
        i.prints();
    }
}

class Car{
    class Engine{
        void showHp(){
            System.out.println("Prints HousePower");
        }
    }
}
class Main2{
    public static void main(String[] args){
        Car c=new Car();
        Car.Engine e=c.new Engine();
        e.showHp();
    }
}