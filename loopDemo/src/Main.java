public class Main {
    public static void main (String[] args) {
        // for
        for (int i = 0; i < 10 ; i++) {
            System.out.print(" Try for " + i);
        }
        System.out.println( "\n" + "Completed");

        //while
        int a = 0;
        while (a < 10) {
            System.out.print(" Try while " + a);
            a+=2;
        }
        System.out.println( "\n" + "Completed");

        //do while
        a = 10;
        do {
            System.out.print(" Try do while " + a);
            a+=2;
        } while (a < 10);
    }
}
