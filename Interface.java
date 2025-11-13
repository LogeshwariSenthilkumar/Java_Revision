interface Playable {
    void play();
}
class Football implements Playable{
    public void play(){
        System.out.println("Playing Football");
    }
}
class Cricket implements Playable{
    public void play(){
        System.out.println("Playing Cricket");
    }
}
class Main{
    public static void main(String[] args){
        Football f=new Football();
        f.play();
        Cricket c=new Cricket();
        c.play();
    }
}


interface Printable{
    void show();
}
interface Showable{
    void show();
}
class Result implements Printable,Showable{
    public void show(){
        System.out.println("Result show Mtd");
    }
    public static void main(String[] args){
        Result r=new Result();
        r.show();
    }
}