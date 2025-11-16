class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
        try{
            Thread.sleep(1000);
            System.out.println("Daemon Thread running");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        }
    }
}
class Main{
    public static void main(String[] args){
        Thread1 t=new Thread1();
        t.setDaemon(true);
        t.start();
        try{
            Thread.sleep(3000);
            System.out.println("Start...");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("End...");
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(1000);
                System.out.println("Daemon Thread");
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Thread3 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
                System.out.println("User Thread");
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Main2{
    public static void main(String[] args){
        Thread2 t1=new Thread2();
        Thread3 t2=new Thread3();
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}