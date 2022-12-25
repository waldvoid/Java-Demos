

import java.util.Scanner;
class Main {
    // Concatenating multiple strings and removing any digits inside of them
    class ConcatenateStringsProblem {

        public static String concatenateStringsWithoutDigits(String[] strings) {
            StringBuilder concatenatedStr = new StringBuilder();
            for (String str : strings) {
                concatenatedStr.append(str);
            }
            for (int i = 0; i < concatenatedStr.length(); i++) {
                if (Character.isDigit(concatenatedStr.charAt(i))) {
                    concatenatedStr.delete(i, i + 1);
                }
            }
            return concatenatedStr.toString();

        }
    }

    // Console out alphabet
    static class EnglishAlphabet {
        public static String createEnglishAlphabet() {
            StringBuilder stringBuilder = new StringBuilder();
            for (char character = 'A'; character <= 'Z'; ++character) {
                stringBuilder.append(character);
                stringBuilder.append(" ");
            }
            stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = ConcatenateStringsProblem.concatenateStringsWithoutDigits(strings);
        System.out.println(result);
        System.out.println(EnglishAlphabet.createEnglishAlphabet());
    }

}
