public class Main {
    public static void main(String[] args) {

        String[] students = new String[3];
        students[0] = "Bella";
        students[1] = "Jack";
        students[2] = "Daniel";
        for (int i = 0; i < students.length ; i++) {
            System.out.println("Student " + (i + 1) + " is " + students[i]);

        }

        for (String student : students) {
            System.out.println("I've already told you it's "+ student);
        }

    }
}