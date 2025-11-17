import java.io.*;
import java.util.Scanner;
class Demo{
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data.txt");
        int a;
        int count=0;
        while((a=fis.read())!=-1){
            System.out.print((char)a);
            count++;
        }
        System.out.println("\nHow Many Bytes: "+count);
    }
}


