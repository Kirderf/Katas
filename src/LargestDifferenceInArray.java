public class LargestDifferenceInArray {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] numbers = {2, 3, 11, 7, 9, 5, 1, 3, 5,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,67,3,32,3,3,11,3,41,4,2,4,23,42,4,4,34,4,2,34,2,42,4,24,2,4,24,33,3,3,3,4};
        int smallestNumber = numbers[0];
        int maxDiff = Integer.MIN_VALUE;
        for (int number : numbers) {
            int diff = 0;
            if (number > smallestNumber) {
                diff = number - smallestNumber;
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }else {
                smallestNumber = number;
            }
        }
        long stopTime = System.nanoTime();
        System.out.println(stopTime-startTime);
        System.out.println(maxDiff);

    }

}
