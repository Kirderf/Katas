import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StarSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userinput = scanner.nextInt();

        System.out.println(userinput);

        String[][] square = new String[userinput][userinput];
        for (int i = 0; i < userinput; i++) {
            square[0][i] = "*";
            square[i][0] = "*";
            square[userinput-1][i] = "*";
            square[i][userinput-1] = "*";
            if (i % 3 == 0 || i % 2 == 0 || i % 5 == 0){
                square[2][i] = "*";
                square[i][2] = "*";
                square[userinput-3][i] = "*";
                square[i][userinput-3] = "*";
            }

        }
        for (int z = 0; z < userinput; z++) {
            for (int i = 0; i < userinput; i++) {
                if (square[z][i] == null){
                    square[z][i] = "  ";
                    System.out.print("  ");
                } else {
                    System.out.print(square[z][i] + " ");
                }

            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(square));
    }
}