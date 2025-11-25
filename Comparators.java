import java.util.*;
class Student{
    int rollno;
    String name;
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public String toString(){
        return rollno+" "+name;
    }
}
class nameSort implements Comparator<Student>{
   public int compare(Student s1,Student s2){
    return s1.name.compareTo(s2.name);
   }
}
class Demo{
    public static void main(String[] args){
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(103,"Logu"));
        al.add(new Student(101,"Janani"));
        al.add(new Student(102,"Chitra"));
        al.add(new Student(105,"Senthil"));
        al.add(new Student(104,"Sanjay"));
        Collections.sort(al,new nameSort());
        System.out.println(al);
    }
}


class Products{
    int id;
    int price;
    int rating;
    Products(int id,int price,int rating){
        this.id=id;
        this.price=price;
        this.rating=rating;
    }
    public String toString(){
        return price+" "+rating+" "+id;
    }
}
class PriceAsc implements Comparator<Products>{
    public int compare(Products p1,Products p2){
        return p1.price-p2.price;
    }
}
class RatingDsc implements Comparator<Products>{
    public int compare(Products p1,Products p2){
        return p2.rating-p1.rating;
    }
}
class Demo1{
    public static void main(String[] args){
        ArrayList<Products> al1=new ArrayList<>();
        al1.add(new Products(102,300,3));
        al1.add(new Products(101,200,1));
        al1.add(new Products(105,500,2));
        al1.add(new Products(106,100,4));
        al1.add(new Products(104,600,5));
        System.out.println(al1);
        Collections.sort(al1,new PriceAsc());
        System.out.println(al1);
        Collections.sort(al1,new RatingDsc());
        System.out.println(al1);

    }
}