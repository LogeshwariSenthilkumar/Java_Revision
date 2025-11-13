class Book{
    String title;
    String author;
    int price;
    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }
    public static void main(String[] args){
        Book b1=new Book("Harry Potter","J. K. Rowling",1300);
        b1.display();
    }
}

class Employee{
    int id;
    String name;
    double salary;
    Employee(){
        this.id=0;
        this.name=null;
        this.salary=0.0;
    }
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.display();
        Employee e2=new Employee(55,"Logu",50000);
        e2.display();
    }
}