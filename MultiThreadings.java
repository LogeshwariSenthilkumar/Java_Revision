class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}
class Main{
    public static void main(String[] args){
        Thread1 t=new Thread1();
        t.start();
    }
}

class Thread2 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Message");
        }
    }
}
class Main2{
    public static void main(String[] args){
        Thread2 t1=new Thread2();
        Thread tt=new Thread(t1);
        tt.start();
    }
}