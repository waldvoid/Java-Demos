public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 7, 9, 0};
        int findNumber = 5;
        boolean numberFound = false;
        for (int i = 0; i < numbers.length ; i++) {
            if (findNumber == numbers[i]) {
               numberFound = true;
               System.out.println(numbers[i] + " is the number you are looking for");
               break;
            }
        }

        if (!numberFound) {
            System.out.println(" We couldn't find the number");
        }

    }
}