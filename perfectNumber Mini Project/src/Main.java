public class Main {
    public static void main(String[] args) {
        int number = -28;
        int sum = 0;

        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = -1; i > number; i--) {
                if (number % i == 0) {
                    sum += i;
                }
            }
        }
        if (number == 0) {
            System.out.println(number + " is not a perfect number");
        } else {
            if (sum == number) {
                System.out.println(number + " is a perfect number");
            } else {
                System.out.println(number + " is not a perfect number");
            }
        }

    }
}