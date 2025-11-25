import java.util.*;
class Demo{
    public static void main(String[] args){
        LinkedHashMap<String,Integer> l=new LinkedHashMap<>();
        l.put("Pencil",10);
        l.put("Pen",50);
        l.put("Book",400);
        l.put("Eraser",10);
        l.put("Papers",50);
        System.out.println(l);
        l.replace("Pencil",20);
        System.out.println(l);
    }
}

