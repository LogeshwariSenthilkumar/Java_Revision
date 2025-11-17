import java.io.*;
import java.util.Scanner;
class Demo{
    public static void main(String[] args) throws IOException{
        File f=new File("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\file4.txt");
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(fw);
        String str="I Like Java";
        bw.write(str);
        bw.close();
        fw.close();
        System.out.println("Success");
    }
}


class Demo1{
    public static void main(String[] args) throws IOException{
        File f1=new File("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\file4.txt");
        FileWriter fw1=new FileWriter(f1,true);
        BufferedWriter bw1=new BufferedWriter(fw1);
        bw1.append(" Programming.");
        bw1.close();
        fw1.close();
        System.out.println("Success");
    }
}