import java.util.HashMap;

public class GreedIsGood {
    public static void main(String[] args) {
        System.out.println(greedy(new int[]{1,1,1,3,1}));
    }

    public static int greedy(int[] dice) {
        int sum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            hashMap.put(i + 1, 0);
        }
        for (int die : dice) {
            hashMap.put(die, hashMap.get(die) + 1);
        }
        if (hashMap.get(1) > 2) {
            sum += 1000;
        } else if (hashMap.get(2) > 2) {
            sum += 200;
        } else if (hashMap.get(3) > 2) {
            sum += 300;
        } else if (hashMap.get(4) > 2) {
            sum += 400;
        } else if (hashMap.get(5) > 2) {
            sum += 500;
        } else if (hashMap.get(6) > 2) {
            sum += 600;
        }
        if (hashMap.get(1) > 3) {
            sum += 100 * (hashMap.get(1)-3);
        }else if (hashMap.get(1) < 3){
            sum += 100 * hashMap.get(1);
        }
        if (hashMap.get(5) > 3) {
            sum += 50 * (hashMap.get(5)-3);
        }else if (hashMap.get(5) < 3){
            sum += 50 * hashMap.get(5);
        }
        System.out.println("BØØØØ!!!!");

        return sum;
    }
}
