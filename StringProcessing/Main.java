import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //valueOf(); method for converting
    static String characterToString(char[] chars) {
        String charsToString = String.valueOf(chars);
        return charsToString;
    }

    // toCharArray(); method for reverse converting
    static char[] stringToCharacter(String string) {
        char[] characters = string.toCharArray();
        return characters;
    }

    // method 2 with split + space - you can use this to split string sentences too
    static String stringToCharacterMethodTwo(String string) {
        String[] characters = string.split(" "); // you return string array, I sys out'd for demonstration
        for (String chara : characters) {
            return chara;
        }
        return "";
    }


    // palindrome scanner-checker
    static String isPalindromeScanner() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] wordChars = word.toCharArray();
        StringBuilder wordAsReverseString = new StringBuilder();
        for (int i = wordChars.length - 1; i >= 0; i--) {
            wordAsReverseString.append(wordChars[i]);
        }
        if (wordAsReverseString.toString().equals(word)) {
            return "yes";
        } else {
            return "no";
        }
    }

        // word char scanner - doubler
        static String characterScannerDoubler() {
            Scanner scanner1 = new Scanner(System.in);
            String scannedWord = scanner1.nextLine();
            char[] charsOfWord = scannedWord.toCharArray();
            StringBuilder doubledWord = new StringBuilder();
            for (char c : charsOfWord) {
                doubledWord.append(c + "" + c);
            }
            return doubledWord.toString();
        }

        static String wordMidTrimmer() {
            Scanner scanner2 = new Scanner(System.in);
            String scannedWord2 = scanner2.nextLine();
            StringBuilder trimmedWord = new StringBuilder(scannedWord2);

            if (trimmedWord.length() % 2 == 0) {
                trimmedWord.delete(trimmedWord.length() / 2 - 1, trimmedWord.length() / 2 + 1 );
            } else {
                trimmedWord.delete(trimmedWord.length() / 2, trimmedWord.length() / 2 + 1 );
            }
                return trimmedWord.toString();
        }

    static String longestWord() {
        Scanner scanner3 = new Scanner(System.in);
        String scannedWord3 = scanner3.nextLine();
        String[] splittedWords = scannedWord3.split(" ");
        int storedValue = 0;
        String longestWord = "";
        for (String s: splittedWords) {
            if (storedValue < s.length()) {
                storedValue = s.length();
                longestWord = s;
            }
        } return longestWord;



    }


    static char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F' };
    static String alphabet = "ABCDEF";


    public static void main(String[] args) {
        System.out.println(characterToString(chars));
        System.out.println(stringToCharacter(alphabet));
        System.out.println(stringToCharacterMethodTwo(alphabet));
        System.out.println(isPalindromeScanner());
        System.out.println(characterScannerDoubler());
        System.out.println(wordMidTrimmer());
        System.out.println(longestWord());
        }


}


