import java.util.function.Supplier;
import java.util.Random;
class Demo{
    public static void main(String[] args){
        Supplier<Integer> randomnum=()->new Random().nextInt(10000);
        System.out.println(randomnum.get());
    }
}


class Demo1{
    public static void main(String[] args){
        Supplier<Long> times=()->System.currentTimeMillis();
        System.out.println(times.get());
    }
}