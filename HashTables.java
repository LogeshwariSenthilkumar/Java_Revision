import java.util.*;
class Demo{
    public static void main(String[] args){
        Hashtable<String,Integer> h=new Hashtable<>();
        h.put("Logu",123);
        h.put("Chitra",456);
        h.put("Senthil",678);
        h.put("Sanjay",890);
        System.out.println(h);
        String username="Logu";
        Integer pass=1234;
        int flag=0;
        for(Map.Entry m:h.entrySet()){
            if(m.getKey()==username && m.getValue()==pass){
                System.out.println("Login successful");
                flag=1;
            }
        }
        if(flag==0){
              System.out.println("Invalid");
        }
    }
}

class Example extends Thread{
    Hashtable<Integer,String> ht;
    Example(Hashtable<Integer,String> ht){
        this.ht=ht;
    }
    public void run(){
        for(int i=0;i<3;i++){
            ht.put(i,getName());
            System.out.println(getName()+" added key "+i);
        }
    }
}
class Demo1{
    public static void main(String[] args){
        Hashtable<Integer,String> ht=new Hashtable<>();
        Example t1=new Example(ht);
        Example t2=new Example(ht);
        t1.setName("T1");
        t2.setName("T2");
        t1.start();
        t2.start();
    }
}