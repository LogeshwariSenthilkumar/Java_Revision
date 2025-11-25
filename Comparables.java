import java.util.*;
class Student implements Comparable<Student>{
    int rollno;
    String name;
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public int compareTo(Student s){
        return this.rollno-s.rollno;
    }
    public String toString(){
        return rollno+" "+name;
    }
}
class Demo{
    public static void main(String[] args){
         ArrayList<Student> al=new ArrayList<>();
         al.add(new Student(103,"Logu"));
         al.add(new Student(104,"Senthil"));
         al.add(new Student(101,"Sanjay"));
         al.add(new Student(105,"Chitra"));
         al.add(new Student(102,"Muni"));
         Collections.sort(al);
         System.out.println(al);
    }
}


class Employee implements Comparable<Employee>{
    int id;
    int salary;
    Employee(int id,int salary){
        this.id=id;
        this.salary=salary;
    }
    public String toString(){
        return id+" "+salary;
    }
    public int compareTo(Employee e){
        return e.salary-this.salary;
    }
}
class Demo1{
    public static void main(String[] args){
        ArrayList<Employee> al1=new ArrayList<>();
        al1.add(new Employee(103,20000));
        al1.add(new Employee(101,25000));
        al1.add(new Employee(105,10000));
        al1.add(new Employee(108,40000));
        al1.add(new Employee(104,30000));
        Collections.sort(al1);
        System.out.println(al1);
    }
}