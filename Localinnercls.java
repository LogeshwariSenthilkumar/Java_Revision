class Outer{
    void display(){
        class Message{
            void show(){
                System.out.println("Hello");
            }
        }
        Message m=new Message();
        m.show();
    }
}
class Main{
    public static void main(String[] args){
        Outer o=new Outer();
        o.display();
    }
}

class Outer2{
    void calculate(){
        class Square{
            int compute(int n){
                return n*n;
            }
        }
        Square s=new Square();
        System.out.println(s.compute(5));
    }
}
class Main2{
    public static void main(String[] args){
        Outer2 oo=new Outer2();
        oo.calculate();
    }
}