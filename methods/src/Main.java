public class Main {
    public static void main(String[] args) {
        findNumber();
    }
    public static void findNumber() {
        int[] numbers = {1, 2, 5, 7, 9, 0};
        int target = 5;
        boolean targetFound = false;
        int targetNumber = 0;

        for (int num : numbers) {
            if (num == target) {
                targetFound = true;
                targetNumber = num;
                break;
            }
        }
        pushMessage(targetNumber, targetFound);
    }
    public static void pushMessage(int targetNumber, boolean targetFound) {
        if (targetFound == true) {
            System.out.println("The number you are looking for is found and it's " + targetNumber);
        } else {
            System.out.println("We couldn't find any target number");
        }
    }
}