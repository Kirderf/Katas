public class MultiplicationTable {
    public static void main(String[] args) {
        multiplicationTable(3);
    }

    public static int[][] multiplicationTable(int n) {
        int[][] list = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list[i][j] = (i + 1) * (j + 1);
            }
        }
        return list;
    }
}
