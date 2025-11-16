class Message{
    static synchronized void display(String msg){
       System.out.println(msg+"Starting....");
       try{
        Thread.sleep(2000);
       }
       catch(InterruptedException e){
        System.out.println(e);
       }
        System.out.println(msg+"Ending...");
    }
}
class Thread1 extends Thread{
    Message m;
    String msg;
    Thread1(Message m,String msg){
        this.m=m;
        this.msg=msg;
    }
    public void run(){
        m.display(msg);
    }
}
class Main{
    public static void main(String[] args){
       Message m1=new Message();
       Message m2=new Message();
       Thread1 t1=new Thread1(m1,"user1");
       Thread1 t2=new Thread1(m2,"user2");
       t2.start();
       t1.start();
    }
}

class Login{
    static synchronized void serverLogin(String users){
        System.out.println(users+" Login successfully");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(users+" Loggedout Successfully");
    }
}
class Thread11 extends Thread{
    Login l;
    String users;
    Thread11(Login l,String users){
        this.l=l;
        this.users=users;
    }
    public void run(){
        l.serverLogin(users);
    }
}
class Main2
{
    public static void main(String[] args){
        Login l=new Login();
        Login l2=new Login();
        Thread11 t11=new Thread11(l,"USER-1");
        Thread11 t22=new Thread11(l2,"USER-2");
        t11.start();
        t22.start();
    }
}