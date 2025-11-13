class Account{
    private int accNo;
    private double balance;
    Account(int accNo,double balance){
        this.accNo=accNo;
        this.balance=balance;
    }
    public void setAccno(int accNo){
        this.accNo=accNo;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public int getAccno(){
        return accNo;
    }
    public double getBalance(){
        return balance;
    }
}
class Main{
    public static void main(String[] args){
        Account a=new Account(9090,50000);
        System.out.println(a.getAccno());
        System.out.println(a.getBalance());
        a.setAccno(30303);
        a.setBalance(45000.50);
         System.out.println(a.getAccno());
        System.out.println(a.getBalance());

    }
}

class Student{
    private int rollNo;
    private String name;
    private int marks;
    Student(int rollNo,String name,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    public void setrollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
}
class Main2{
    public static void main(String[] args){
        Student s=new Student(101,"Logu",89);
        System.out.println(s.getRollNo());
        System.out.println(s.getName());
        System.out.println(s.getMarks());
        s.setName("Janu");
        s.setrollNo(102);
        s.setMarks(79);
        System.out.println(s.getRollNo());
        System.out.println(s.getName());
        System.out.println(s.getMarks());


    }
}