class Calculator{
void add(int a,int b){
    System.out.println("Addition : "+(a+b));
}
void subtract(int a,int b){
    System.out.println("Subtraction : "+(a-b));
}
public static void main(String[] args){
    Calculator c1=new Calculator();
    c1.add(20,30);
    c1.subtract(40,30);
}
}

class Temperature{
    void toCelisus(double temp){
        temp=(temp-32)*(5/9);
        System.out.println("Celisus : "+temp);
    }
    public static void main(String[] args){
        Temperature t1=new Temperature();
        t1.toCelisus(32);
    }
}