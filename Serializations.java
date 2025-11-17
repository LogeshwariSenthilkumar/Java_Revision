import java.io.*;
class Student implements Serializable{
    int id;
    String name;
    int marks;
    Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public String toString(){
        return id+" "+name+" "+marks;
    }
}
class Demo{
    public static void main(String[] args) throws IOException{
        FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\file5.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fous);
        Student s1=new Student(101,"Logu",89);
        Student s2=new Student(102,"Janu",87);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.close();
        fous.close();
        System.out.println("Success");

    }
}

class Employee implements Serializable{
    int id;
    String name;
    int salary;
    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
     public String toString(){
        return id+" "+name+" "+salary;
    }
}
class Demo1{
    public static void main(String[] args) throws IOException{
        FileOutputStream fous1=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\file6.txt");
        ObjectOutputStream oos1=new ObjectOutputStream(fous1);
        Employee e1=new Employee(101,"Logu",50000);
        Employee e2=new Employee(102,"Chitra",60000);
        Employee e3=new Employee(103,"Senthil",40000);
        oos1.writeObject(e1);
        oos1.writeObject(e2);
        oos1.writeObject(e3);
        oos1.close();
        fous1.close();
        System.out.println("Success");

    }
}