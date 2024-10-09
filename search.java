
import java.util.*;

public class search {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int rows = in.nextInt();
        int cols = in.nextInt();
        int[][] search = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                search[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the number you want to search");
        int x = in.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (search[i][j] == x)
                    System.out.println("the position of x is " + rows + "," + cols);
            }
        }

    }

}
