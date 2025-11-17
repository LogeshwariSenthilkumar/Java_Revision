import java.io.*;
import java.util.Scanner;
class Demo{
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        int a;
        while((a=bis.read())!=-1){
            System.out.print((char)a);
        }
    }
}

class Demo1{
    public static void main(String[] args) throws IOException{
        FileInputStream fis1=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data.txt");
        BufferedInputStream bis1=new BufferedInputStream(fis1);
        int a1;
        int vowels_count=0;
        while((a1=bis1.read())!=-1){
            char b=(char)a1;
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
                vowels_count++;
            }
        }
        System.out.println("Vowels Count: "+vowels_count);
    }
}