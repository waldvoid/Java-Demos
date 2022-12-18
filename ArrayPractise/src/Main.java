import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] newArray = new int[5];
        int[] newArray2 = {5,6,3,2,1};
        int[][] newMultiArray = { {2,3,5,1}, {4,5,2,1} };
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }
        for (int num : newArray) {
            System.out.println(num);
        }
        // kaç dimension varsa o kadar loop at
        for (int i = 0; i < newMultiArray.length ; i++) {
            for (int j= 0;  j < newMultiArray[i].length ; j++) {
                System.out.println(newMultiArray[i][j]);
            }
        }

    }
}