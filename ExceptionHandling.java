import java.util.Scanner;
class Demo{
    public static void main(String[] args){
        int a=10;
        int b=0;
        try{
            int c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Completed");
    }
}

class Demo2{
    public static void main(String[] args){
        int[] arr={3,4,5};
        try{
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Completed");
    }
}

class Demo3{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Two numbers");
       int a1=sc.nextInt();
       int b1=sc.nextInt();
       if(b1==0){
        try{
            int c1=a1/b1;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
       }
       else{
        int d=a1/b1;
        System.out.println(d);
       }
       System.out.println("Completed");
    }
}

class Demo4{
    public static void main(String[] args) {
        String str = "abd";  

        try {
            int num = Integer.parseInt(str); 
            System.out.println("Converted Number: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("Completed");
    }
}

class Demo5{
    public static void main(String[] args){
        try{
            // int c=10/0;
            int[] arr={4,6,7};
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}


class Demo6{
    public static void main(String[] args){
        try{
            // String str2=null;
            // System.out.println(str2.toLowerCase());
            String str3="abc";
            int num2=Integer.parseInt(str3);
            System.out.println(num2);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}

class Demo7{
    public static void main(String[] args){
        try{
            try{
                int cc=10/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            int[] arr3={2,3};
            System.out.println(arr3[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}

class Demo8{
    public static void main(String[] args){
        int a=10;
        int b=10;
        try{
            int c=a/b;
            System.exit(0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Closing");
        }
        System.out.println("Completed");
    }
}

class Demo9{
    public static void main(String[] args){
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=sc2.nextInt();
        if(number<0){
            throw new ArithmeticException();
        }
        else{
            System.out.println("Positive Number");
        }
    }
}

class Demo10{
    void division(int a,int b) throws ArithmeticException{
        int dd=a/b;
        System.out.println(dd);
    }
    public static void main(String[] args){
        Scanner sc3=new Scanner(System.in);
        System.out.println("Enter the two Numbers");
        int number1=sc3.nextInt();
         int number2=sc3.nextInt();
         Demo10 demo=new Demo10();
         try{
             demo.division(number1,number2);
         }
         catch(ArithmeticException e){
            System.out.println(e);
         }
        
         System.out.println("Completed");
    }
}

