class Bank{
    interface Rates{
        void interest();
    }
}
class SBI implements Bank.Rates{
    public void interest(){
        System.out.println("Interest is calculated");
    }
    public static void main(String[] args){
        SBI s=new SBI();
        s.interest();
    }
}

interface Vehicle{
    interface Engine{
        void start();
    }
}
class Car implements Vehicle.Engine{
    public void start(){
        System.out.println("Car Engine has Started");
    }
    public static void main(String[] args){
        Car c=new Car();
        c.start();
    }
}