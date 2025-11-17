import java.io.*;
import java.util.Scanner;
class Demo{
    public static void main(String[] args) throws IOException{
        File f=new File("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\file1.txt");
        f.createNewFile();
        FileWriter fw=new FileWriter(f);
        fw.write("Java FileWriter Example");
        fw.close();
        System.out.println("Success");
    }
}

class Demo1{
    public static void main(String[] args) throws IOException{
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\file2.txt");
        f1.createNewFile();
        FileWriter fw1=new FileWriter(f1);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Paragraph");
        String para=sc.nextLine();
        fw1.write(para);
        fw1.close();
        System.out.println("Success");
    }
}