public class Main {
    public static void main(String[] args) {

        double[] myList = {3.4, 3.2, 5.6};
        double sum = 0;
        double max = 0;
        for (double num : myList) {
            System.out.println(num);
            sum += num;
        }
        System.out.println("Sum is " + sum);

        max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }


        System.out.println("Max is " + max);
    }
}