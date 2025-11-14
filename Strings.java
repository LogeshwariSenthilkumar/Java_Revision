import java.util.Scanner;
class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println("Reverse String : "+reverse);
    }
}

class Demo1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str1=sc.nextLine().toLowerCase();
        String reverse1="";
        for(int i=str1.length()-1;i>=0;i--){
            reverse1+=str1.charAt(i);
        }
        if(reverse1.equals(str1)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}

class Demo2{
    public static void main(String[] args){
        String str2="Logeshwari";
        System.out.println(str2.length());
        System.out.println(str2.substring(3));
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str2.concat(" Senthilkumar"));
    }
}

class Demo3{
    public static void main(String[] args){
        String str3="Logeshwari";
        int vowels=0;
        int consonants=0;
        for(int i=0;i<str3.length();i++){
            if(str3.charAt(i)=='a'|| str3.charAt(i)=='e' || str3.charAt(i)=='i'|| str3.charAt(i)=='o' || str3.charAt(i)=='u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Vowels Count: "+vowels);
        System.out.println("Consonants Count: "+consonants);
    }
}

class Demo4{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Logeshwari");
        sb.append(" Senthilkumar");
        System.out.println(sb);
        sb.delete(11,18);
        System.out.println(sb);
        sb.insert(11,"Senthil");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());

    }
}

class Demo5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str4=sc.nextLine();
        StringBuffer sb1=new StringBuffer(str4);
        String s=sb1.reverse().toString().toUpperCase();
        System.out.println(s);
        
    }
}


class Demo6{
    public static void main(String[] args){
        StringBuilder sb3=new StringBuilder("Logeshwari");
        sb3.append(" Senthilkumar");
        System.out.println(sb3);
        sb3.replace(11,18,"Logeshwari");
        System.out.println(sb3);

        sb3.deleteCharAt(11);
        System.out.println(sb3);
        sb3.reverse();
        System.out.println(sb3);

    }
}

