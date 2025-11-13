class Book{
Author a;
String b_name;
int b_id;
Book(Author a,String b_name,int b_id){
    this.a=a;
    this.b_name=b_name;
    this.b_id=b_id;
}
void display(){
   a.showAuthor();
   System.out.println("Book ID: "+b_id);
   System.out.println("Book Name: "+b_name);
}
}
class Author{
  String a_name;
  int a_id;
 Author(String a_name,int a_id){
    this.a_name=a_name;
    this.a_id=a_id;
 }
 void showAuthor(){
    System.out.println("Author Name: "+a_name);
    System.out.println("Author ID: "+a_id);
 }
}
class Main{
    public static void main(String[] args){
        Author a=new Author("J.K. Rowling",101);
        Book b=new Book(a,"Harry potter",1001);
        b.display();
    }
}

class Employee{
Address a;
String name;
int id;
Employee(int door_no,String street,String city,String name,int id){
  this.a=new Address(door_no,street,city);
  this.name=name;
  this.id=id;
}
void display(){
    System.out.println("Employee ID: "+id);
    System.out.println("Employee Name: "+name);
    a.displayAddress();
}
}
class Address{
    int door_no;
    String street;
    String city;
  Address(int door_no,String street,String ity){
    this.door_no=door_no;
    this.street=street;
    this.city=city;
  }
  void displayAddress(){
    System.out.println("-------Address-----");
    System.out.println("Door NO: "+door_no);
    System.out.println("Street: "+street);
    System.out.println("City: "+city);
  }
}
class Main2{
    public static void main(String[] args){
        Employee e=new Employee(78,"East Street","Namakkal","Logeshwari",55);
        e.display();
    }
}