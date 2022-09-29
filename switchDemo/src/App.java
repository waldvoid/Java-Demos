package switchDemo.src;

public class App {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A': System.out.println("Awesome!"); break;
            case 'B': System.out.println("Nice!"); break;
            case 'C': System.out.println("Not Bad"); break;
            case 'D': System.out.println("Pass"); break;
            case 'F': System.out.println("Failed"); break;
            default: System.out.println("N/A"); break;
        }
    }
}
