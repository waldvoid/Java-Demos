public class Main {
    public static void main(String[] args) {

        pushMessage(String.valueOf(add(1, 5)));
        int result = div(15, 5);
        pushMessage("Java is beautiful");
        System.out.println(result);
        int result2 = subs(2, 5, 7, -55, 23, 252);
        System.out.println(result2);
    }
    public static int add (int num1, int num2) {
        return num1 + num2;
    }

    public static int subs (int num1, int num2) {
        return num1 - num2;
    }
    public static int subs (int... nums) {
        int total = 0;
        for (int number : nums) {
            total -= number;
        }
        return total;
    }
    public static int div (int num1, int num2) {
        return num1 / num2;
    }
    public static void pushMessage(String message) {
        System.out.println(message + " is what I need to say!");
    }
}