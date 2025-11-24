import java.util.*;
class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 Numbers:");
        Stack<Integer> s=new Stack<>();
        for(int i=1;i<=5;i++){
            s.push(sc.nextInt());
        }
        System.out.println(s);
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}

class Demo1{
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc1.nextLine();
        Stack<Character> stk=new Stack<>();
         boolean isBalanced=true;
        for(int i1=0;i1<str.length();i1++){
            Character ch=str.charAt(i1);
            if(ch=='(' || ch=='{' ||ch=='['){
                stk.push(ch);
                continue;
            }
            if(ch==')' || ch=='}' ||ch==']'){
                if(stk.empty()){
                    isBalanced=false;
                    break;
                }
            }
            char top=stk.pop();
            if(ch==')' && top!='(' || ch==']' && top!='[' || ch=='}' && top!='{'){
                isBalanced=false;
                break;
            }
        }
        if(isBalanced && stk.empty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("UnBalanced");
        }
    }
}