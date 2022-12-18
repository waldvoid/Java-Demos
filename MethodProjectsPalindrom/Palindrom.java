package MethodProjectsPalindrom;

public class Palindrom {

    static boolean isPalindrom(int num) {
        int tempNum, reverseNum = 0, remainder;
        tempNum = num;
        while (tempNum != 0) {
            remainder = tempNum % 10;
            reverseNum = reverseNum * 10 + remainder;
            tempNum /= 10;


        } if (num == reverseNum) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        // ortadan ikiye böldüğünde tersi kendine eşit olan sayılara denir
        // örnek: 123321, 121

        // Algoritması aslında tersten sayıyı oluşturmak üzerine
        // 121 % 10 = 1, reverseNum = 1, 121 / 10 = 12,1 >> 12
        // 12 % 10 = 2, reverseNum = reverseNum * 10 + 2 = 12, 12 / 10 = 1
        // 1 / 10 = 1, reverseNum = reverseNum * 10 + 1 = 121 >> Sayı Polindromdur.

        // 1331 % 10 = 1, reverseNum = 1, 1331 / 10 = 133,1 >> 133
        // 133 % 10 = 3, reverseNum = reverseNum * 10 + 3 = 13, 13 / 10 = 1
        // 1 / 10 = 1, reverseNum = reverseNum * 10 + 1 = 1331  >> Sayı Polindromdur.
        System.out.println(isPalindrom(1321));
    }
}
