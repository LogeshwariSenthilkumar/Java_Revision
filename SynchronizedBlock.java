class Demo{
    void printCharacters(String str){
        synchronized(this){
            for(int i=0;i<str.length();i++){
                System.out.println(str.charAt(i));
            }
        }
    }
}
class Thread1 extends Thread{
    Demo d;
    String str;
    Thread1(Demo d,String str){
        this.d=d;
        this.str=str;
    }
    public void run(){
        d.printCharacters(str);
    }
}
class Main{
    public static void main(String[] args){
        Demo d=new Demo();
        Thread1 t1=new Thread1(d,"Logu");
        Thread1 t2=new Thread1(d,"chitra");
        t1.start();
        t2.start();

    }
}


class PrintMessage{
    private int count=0;
    void display(String name){
        System.out.println(name+" Printing started");
        synchronized(this){
            count++;
            System.out.println(name+" counting added "+count);
        }
        System.out.println(name+" Printing ended");
    }
}
class Thread11 extends Thread{
    PrintMessage p;
    String name;
    Thread11(PrintMessage p,String name){
        this.p=p;
        this.name=name;
    }
    public void run(){
        p.display(name);
    }
}
class Main2{
    public static void main(String[] args){
        PrintMessage p=new PrintMessage();
        Thread11 t11=new Thread11(p,"Logu");
        Thread11 t22=new Thread11(p,"Chitra");
        Thread11 t33=new Thread11(p,"Senthil");
        t11.start();
        t22.start();
        t33.start();
    }
}