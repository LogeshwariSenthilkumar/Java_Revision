import java.io.*;
import java.util.Scanner;
class Demo{
    public static void main(String[] args) throws IOException{
        FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data.txt");
        BufferedOutputStream bous=new BufferedOutputStream(fous);
        String str="Buffered OutputStream Example";
        byte[] strs=str.getBytes();
        bous.write(strs);
        bous.close();
        fous.close();
        System.out.println("Success");
    }
}

class Demo1{
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data.txt");
        int a;
        String str2="";
        while((a=fis.read())!=-1){
             str2+=(char)a;
        }
        FileOutputStream fous2=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data2.txt");
        BufferedOutputStream bous2=new BufferedOutputStream(fous2);
        byte[] strs2=str2.getBytes();
        bous2.write(strs2);
        bous2.close();
        fous2.close();
        System.out.println("Success");
    }
}