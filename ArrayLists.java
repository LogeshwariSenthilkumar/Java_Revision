import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(30);
        al.add(40);
        al.add(10);
        al.add(5);
        al.add(20);
        Integer min=al.get(0);
        Integer max=al.get(0);
        for(int i=0;i<al.size();i++){
            if(max>al.get(i)){
                max=al.get(i);
            }
            else if(min<al.get(i))
            {
                min=al.get(i);
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}


class Demo1{
    public static void main(String[] args){
        ArrayList<String> al2=new ArrayList<>();
        al2.add("Logu");
        al2.add("Chitra");
        al2.add("Senthil");
        al2.add("Logu");
        al2.add("Chitra");
        System.out.println(al2);
        ArrayList<String> unique=new ArrayList<>();
        for(String str:al2){
            if(!unique.contains(str)){
                unique.add(str);
            }
        }
        System.out.println(unique);
    }
}