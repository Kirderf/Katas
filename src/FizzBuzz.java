public class FizzBuzz {
    private static int counter = 1;

    public static void main(String[] args) {
        while (counter <= 100){
            if (counter % 3 == 0 && counter % 5 == 0){
                System.out.print("FizzBuzz");
            }else if (counter % 3 == 0){
                System.out.print("Fizz");
            }else if (counter % 5 == 0){
                System.out.print("Buzz");
            }else {
                System.out.print(counter);
            }
            System.out.print(", ");
            counter++;
        }
    }
}
