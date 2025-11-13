class Employee{
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
    public static void main(String[] args){
        Employee e=new Employee(55,"Logu");
        e.display();
    }
}

class Student{
    String name;
    Student(String name){
       this();
       System.out.println("Parameter Constructor");
    }
    Student(){
        System.out.println("No Argument Constructor");
    }
    public static void main(String[] args){
        Student s=new Student("Logu");
    }

}