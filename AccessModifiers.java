class Person{
    public String name="Logu";
    private int age=22;
    protected String address="Namakkal";
    String email="logu@gmail.com";
}
class Main{
    public static void main(String[] args){
        Person p=new Person();
        System.out.println(p.name);
        System.out.println(p.address);
        System.out.println(p.email);
    }
}