package Conditionals.src;

public class Main {
    public static void main(String[] args) {
        int num = 20;
        if (num < 20) {
            System.out.println("Sayı " + num + "'den küçüktür");
        } else if (num > 20) {
            System.out.println("Sayı " + num + "'den büyüktür");
        } else {
            System.out.println("Sayı " + num + "'ye eşittir");
        }
    }
}
