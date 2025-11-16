class Outer{
    static class Inner{
        void show(){
            System.out.println("Showing..");
        }
    }
}
class Main{
    public static void main(String[] args){
        Outer.Inner i=new Outer.Inner();
        i.show();
    }
}

class MathUtil{
    static class Operation{
        void add(int a,int b){
            System.out.println(a+b);
        }
    }
}
class Main2{
    public static void main(String[] args){
         MathUtil.Operation m=new MathUtil.Operation();
         m.add(10,20);
    }
}