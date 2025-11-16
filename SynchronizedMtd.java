class Table{
    synchronized void printTable(int n){
        for(int i=1;i<=5;i++){
           System.out.println(i+"X"+n+"="+(i*n)); 
        }
    }
}
class Thread1 extends Thread{
    Table t;
    int num;
    Thread1(Table t,int num){
        this.t=t;
        this.num=num;
    }
    public void run(){
      t.printTable(num);
    }
}
class Thread2 extends Thread{
     Table t;
    int num;
    Thread2(Table t,int num){
        this.t=t;
        this.num=num;
    }
    public void run(){
        t.printTable(num);
    }
}
class Main{
    public static void main(String[] args){
        Table t=new Table();
        Thread1 t1=new Thread1(t,2);
        Thread2 t2=new Thread2(t,3);
        t1.start();
        t2.start();
    }
}

class Bank{
    int balance=10000;
    synchronized void withdraw(int amount){
        if(amount>balance){
            System.out.println("INSUFFICIENT BALANCE");
        }
        else{
            System.out.println("WithDrawn successfully");
           this.balance-=amount;
            System.out.println("Remaining Balance : "+balance);
        }
    }
}
class Thread11 extends Thread{
    Bank b;
    int amount;
    Thread11(Bank b,int amount){
        this.b=b;
        this.amount=amount;
    }
    public void run(){
        b.withdraw(amount);
    }
}
class Thread22 extends Thread{
    Bank b;
    int amount;
    Thread22(Bank b,int amount){
        this.b=b;
        this.amount=amount;
    }
    public void run(){
        b.withdraw(amount);
    }
}
class Main2{
    public static void main(String[] args){
        Bank b=new Bank();
        Thread11 t11=new Thread11(b,2000);
        Thread22 t22=new Thread22(b,9000);
        t11.start();
        t22.start();
    }
}