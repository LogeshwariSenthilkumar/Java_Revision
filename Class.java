class Student{
    String name="Logu";
    int rollNo=55;
    int marks=90;
    public static void main(String[] args){
        Student s1=new Student();
        System.out.println("Name : "+s1.name);
        System.out.println("RollNo : "+s1.rollNo);
        System.out.println("Marks : "+s1.marks);
    }
}

class Rectangle{
    int length=20;
    int width=30;
    void calculateArea(){
        System.out.println("Area : "+(length*width));
    }
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        r1.calculateArea();
    }
}