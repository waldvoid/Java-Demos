public class Main {
    public static void main(String[] args) {
        int num1 = 220;
        int sumNum1 = 0;
        int num2 = 284;
        int sumNum2 = 0;

            // postive friendly numbers
        if (num1 > 0) {
            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    sumNum1 += i;
                }
            }
            for (int i = 1; i < num2; i++) {
                if (num2 % i == 0) {
                    sumNum2 += i;
                }
            }
            // negative friendly numbers
        } else {
            for (int i = -1; i > num1; i--) {
                if (num1 % i == 0) {
                    sumNum1 += i;
                }
            }
            for (int i = -1; i > num2; i--) {
                if (num2 % i == 0) {
                    sumNum2 += i;
                }
            }
        }
        //print out
        if (sumNum1 == num2 && sumNum2 == num1) {
            System.out.println(num1 + " and " + num2 + " are friendly numbers");
        } else {
            System.out.println(num1 + " and " + num2 + " are not friendly numbers");
        }

    }
}