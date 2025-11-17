import java.io.*;
import java.util.Scanner;
class Demo{
    public static void main(String[] args) throws IOException{
        File f=new File("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\file1.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        int a;
        while((a=br.read())!=-1){
            System.out.print((char)a);
        }
    }
}

class Demo1{
    public static void main(String[] args) throws IOException{
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\file1.txt");
        FileReader fr1=new FileReader(f1);
        BufferedReader br1=new BufferedReader(fr1);
        int a1;
        int vowels_count=0;
        while((a1=br1.read())!=-1){
            char ch=(char)a1;
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                vowels_count++;
            }
        }
        System.out.println("Vowels Count: "+vowels_count);
    }
}