import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        IntStream.range(1,100).forEachOrdered(s -> {
            if (s % 3 == 0 && s % 5 == 0){
                System.out.print("FizzBuzz");
            }else if (s % 3 == 0){
                System.out.print("Fizz");
            }else if (s % 5 == 0){
                System.out.print("Buzz");
            }else {
                System.out.print(s);
            }
        });
    }
}
