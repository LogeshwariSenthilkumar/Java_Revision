import java.io.*;
import java.util.Scanner;
class Demo{
    public static void main(String[] args) throws IOException{
        FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data.txt");
        String str="Hello Java";
        byte[] strs=str.getBytes();
        fous.write(strs);
        fous.close();
        System.out.println("Success");
    }
}

class Demo1{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str2=sc.nextLine();
        byte[] strs2=str2.getBytes();
        FileOutputStream fous2=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data1.txt");
        fous2.write(strs2);
        fous2.close();
        System.out.println("Successs");
        
    }
}
