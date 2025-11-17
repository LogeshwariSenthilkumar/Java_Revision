import java.io.*;
class Demo{
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data.txt");
         FileInputStream fis1=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data1.txt");
         SequenceInputStream sis=new SequenceInputStream(fis,fis1);
        int a;
        while((a=sis.read())!=-1){
            System.out.print((char)a);
        }
    }
}

class Demo1{
    public static void main(String[] args) throws IOException{
        FileInputStream fis2=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data.txt");
         FileInputStream fis3=new FileInputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data1.txt");
         SequenceInputStream sis1=new SequenceInputStream(fis2,fis3);
          FileOutputStream fous=new FileOutputStream("C:\\Users\\LOGESHWARISENTHIL\\Desktop\\JavaFiles\\data3.txt");
        int a2;
        while((a2=sis1.read())!=-1){
            fous.write((char)a2);
        }
        fous.close();
    }
}