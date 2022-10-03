public class Main {
    public static void main(String[] args) {
        int number = 97;
        int remainder = 0;
        boolean isPrimeNumber = true;

        if (number == 1 || number == 0) {
            isPrimeNumber = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == remainder) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }

        if (number < 0) {
            System.out.println("Please enter a valid number");
        } else {
            if (isPrimeNumber) {
                System.out.println("Number is a Prime Number");
            } else {
                System.out.println("Number is not a Prime Number");
            }
        }
    }
}