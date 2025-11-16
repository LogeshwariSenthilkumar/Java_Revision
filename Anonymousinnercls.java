abstract class Animal{
    abstract void sound();
}
class Main{
    public static void main(String[] args){
        Animal a=new Animal(){
            void sound(){
                System.out.println("Sound method");
            }
        };
        a.sound();
    }
}

interface Button{
    void click();
}
class Main2{
    public static void main(String[] args){
        Button b=new Button(){
           public void click(){
            System.out.println("The Button is clicked");
           }
        };
        b.click();
    }
}