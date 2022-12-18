import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please Enter 5 number to get average");
        for (int num: nums) {
            num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum / nums.length);

    }
}