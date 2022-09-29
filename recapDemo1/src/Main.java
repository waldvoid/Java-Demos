package recapDemo1.src;

public class Main {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 24;
        int num3 = 25;

        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largest number is " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Largest number is " + num3);
        } else if (num1 == num2 && num1 > num3) {
            System.out.println("Largest number is both " + num1 + " and " + num2);
        } else if (num2 == num3 && num2 > num1) {
            System.out.println("Largest number is both " + num2 + " and " + num3);
        } else if (num1 == num3 && num1 > num2) {
            System.out.println("Largest number is both " + num1 + " and " + num3);
        } else {
            System.out.println("Largest number is both " + num1 + " and " + num2 + " and " + num3);
        }
        
    }
}
