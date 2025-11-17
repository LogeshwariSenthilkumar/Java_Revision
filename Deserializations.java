import java.io.*;
class Demo{
    
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\file5.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student[] ob={
            (Student)ois.readObject(),
            (Student)ois.readObject()
        };
        for(Student s:ob){
            System.out.println(s.toString());
        }
    }
}

class Demo1{ 
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        FileInputStream fis1=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\file6.txt");
        ObjectInputStream ois1=new ObjectInputStream(fis1);
        Employee[] ob1={
            (Employee)ois1.readObject(),
            (Employee)ois1.readObject(),
            (Employee)ois1.readObject()
        };
        for(Employee e:ob1){
            System.out.println(e.toString());
        }
    }
}