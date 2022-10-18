public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        System.out.println(employee.firstName);
        customerManager.luckyCustomer("Ahmet");
        employeeManager.findEmployeeOfMonth();
    }
}