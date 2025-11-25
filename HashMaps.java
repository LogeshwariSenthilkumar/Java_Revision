import java.util.*;
class Demo{
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(101,"Logu");
        hm.put(102,"Senthil");
        hm.put(103,"Sanjay");
        hm.put(104,"Chitra");
        hm.put(105,"Janani");
        System.out.println(hm);
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}

class Demo1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String sentence=sc.nextLine();
        String[] words=sentence.toLowerCase().split(" ");
        HashMap<String,Integer> h=new HashMap<>();
        for(String word:words){
            if(h.containsKey(word)){
                h.put(word,h.get(word)+1);
            }
            else{
                h.put(word,1);
            }
        }
        for(Map.Entry map:h.entrySet()){
            System.out.println(map.getKey()+":"+map.getValue());
        }
    }
}