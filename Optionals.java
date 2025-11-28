import java.util.*;
class Demo{
    public static Optional<String> getName(){
        return Optional.ofNullable("Logu");
    }
    public static void main(String[] args){
        Optional<String> name=Demo.getName();
        name.ifPresent(val->System.out.println("UserName found"));
        String res=name.orElse("UserName not Found");
        System.out.println(res);

    }
}

class Demo1{
    public static void main(String[] args){
        Optional<String> str=Optional.of("Hello");
        if(str.isPresent()){
            int len=str.map((strs)->strs.length()).get();
            System.out.println(len);
        }
        
    }
}