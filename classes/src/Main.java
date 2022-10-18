public class Main {
    public static void main(String[] args) {

        // create a new reference to bypass static and reference to the same heap allocation
        // these two customer managers locating the same heap address so first declaration is useless, but you may use the first piece for declaration.
        CustomerManager customerManager = new CustomerManager();
        // you may use >> CustomerManager customerManager; << in this case (same heap ref)
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.add();
        customerManager2.delete();
        customerManager.update();
    }
}