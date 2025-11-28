import java.time.*;
class Demo{
    public static void main(String[] args){
        LocalDateTime datetime=LocalDateTime.now();
        System.out.println(datetime);
        System.out.println(datetime.getDayOfWeek());
    }
}

class Demo1{
    public static void main(String[] args){
        LocalDate d=LocalDate.of(2004,11,16);
        LocalDate d2=LocalDate.now();
        Period p=Period.between(d,d2);
        System.out.println("Age: "+p.getYears());
    }
}