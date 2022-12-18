import java.util.Scanner;

public class Main {

    static boolean isPalindrom(String word) {
        String secondHalfReversed = "";
        String secondHalf = word.substring(word.length() / 2 + 1, word.length());
        String firstHalf = word.substring(0, word.length() / 2);
        // reverse second half so it can match with first one
        for (int i = secondHalf.length()-1; i >= 0 ; i--) {
            secondHalfReversed += secondHalf.charAt(i);
        }
        if (firstHalf.equals(secondHalfReversed)) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        // kapak, yapay, yatay, teget

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        System.out.println(isPalindrom(scan.nextLine()));



    }
}