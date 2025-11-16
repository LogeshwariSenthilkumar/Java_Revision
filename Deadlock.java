class Resource1{

}
class Resource2{

}
class Thread1 extends Thread{
    Resource1 r1;
    Resource2 r2;
    Thread1(Resource1 r1,Resource2 r2){
        this.r1=r1;
        this.r2=r2;
    }
    public void run(){
        synchronized(r1){
            System.out.println("Thread1 locking Resource1");
            try{Thread.sleep(100);}catch(Exception e){System.out.println(e);}
            System.out.println("Thread1 waiting for Resource2");
        }
          synchronized(r2){
            System.out.println("Thread1 locking Resource2");
        }
    }
}
class Thread2 extends Thread{
    Resource1 r1;
    Resource2 r2;
    Thread2(Resource1 r1,Resource2 r2){
        this.r1=r1;
        this.r2=r2;
    }
    public void run(){
        synchronized(r2){
            System.out.println("Thread2 locking Resource2");
            try{Thread.sleep(100);}catch(Exception e){System.out.println(e);}
            System.out.println("Thread2 waiting for Resource1");
        }
          synchronized(r1){
            System.out.println("Thread2 locking Resource1");
        }
    }
}
class Main{
    public static void main(String[] args){
        Resource1 r1=new Resource1();
        Resource2 r2=new Resource2();
        Thread1 t1=new Thread1(r1,r2);
        Thread2 t2=new Thread2(r1,r2);
        t1.start();
        t2.start();
    }
}

class Demo{
    synchronized void methodA(Demo d){
        System.out.println("MethodA");
        d.methodB();

    }
    synchronized void methodB(){
        System.out.println("MethodB");
    }
}
class Thread11 extends Thread{
    Demo d;
    Demo d1;
    Thread11(Demo d,Demo d1){
        this.d=d;
        this.d1=d1;
    }
    public void run(){
        d.methodA(d1);
    }

}
class Main2{
    public static void main(String[] args){
        Demo d=new Demo();
        Demo d1=new Demo();
        Thread11 t1=new Thread11(d,d1);
        Thread11 t2=new Thread11(d1,d);
        t1.start();
        t2.start();
    }
}