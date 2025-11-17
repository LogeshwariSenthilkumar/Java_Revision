import java.io.*;
import java.util.Scanner;
class Demo{
    public static void main(String[] args) throws IOException{
        File f=new File("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\file1.txt");
        FileReader fr=new FileReader(f);
        int a;
        while((a=fr.read())!=-1){
            System.out.print((char)a);
        }
    }
}


class Demo1{
    public static void main(String[] args) throws IOException{
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\file2.txt");
        FileReader fr1=new FileReader(f1);
        int a1;
        String para="";
        int c_count=0;
        int lineCount=1;
     
        while((a1=fr1.read())!=-1){
            if(a1=='\n'){
                lineCount++;
            }
            c_count++;
            para+=(char)a1;
        }
        String[] words=para.trim().split("\\s+");
        System.out.println("\n Words Count: "+(words.length));
        System.out.println("\n No of Lines Count: "+(lineCount));
        System.out.println("\n Character Count: "+(c_count));

    }
}
