class ATM{
    int balance=0;
    synchronized void deposit(int amount){
       this.balance+=amount;
       System.out.println("Amount Deposited");
       System.out.println("Available Balance: "+balance);
       notifyAll();
    }
    synchronized void  withdraw(int amount){
        while(balance<amount){
        try{
             System.out.println("Waiting for deposit");
            wait();
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
         this.balance-=amount;
        System.out.println("Amount WithDrawn successfully");
        System.out.println("Remaining Balance "+balance);
    }
}
class Customer extends Thread{
    ATM a;
    int amount;
    Customer(ATM a,int amount){
        this.a=a;
        this.amount=amount;
    }
    public void run(){
        a.withdraw(amount);
    }
}
class Bank extends Thread{
    ATM a;
    int amount;
    Bank(ATM a,int amount){
        this.a=a;
        this.amount=amount;
    }
    public void run(){
        a.deposit(amount);
    }
}
class Main{
    public static void main(String[] args){
        ATM a=new ATM();
        new Customer(a,1000).start();
        new Customer(a,2000).start();
        new Bank(a,4000).start();
    }
}

class Stocks{
    int t_shirts_count=50;
    synchronized void adds(int count){
        this.t_shirts_count+=count;
        System.out.println("Items Added");
        System.out.println("Available Items: "+t_shirts_count);
        notifyAll();
    }
    synchronized void remove(int count){
        while(t_shirts_count<count){
            try{
               System.out.println("Waiting for Loading...");
               wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        this.t_shirts_count-=count;
        System.out.println("Removes Items");
        System.out.println("Remaining Items: "+t_shirts_count);
    }
}
class Loading extends Thread{
    Stocks s;
    int count;
    Loading(Stocks s,int count){
        this.s=s;
        this.count=count;
    }
    public void run(){
        s.remove(count);
    }
}
class UnLoading extends Thread{
    Stocks s;
    int count;
    UnLoading(Stocks s,int count){
        this.s=s;
        this.count=count;
    }
    public void run(){
        s.adds(count);
    }
}
class Main2{
 public static void main(String[] args){
    Stocks s=new Stocks();
    new Loading(s,50).start();
    new Loading(s,30).start();
    new Loading(s,90).start();
    new Loading(s,20).start();
    new UnLoading(s,500).start();
 }
}