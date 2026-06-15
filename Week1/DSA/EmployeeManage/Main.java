public class Main {

    public static void main(String[] args) {

        EmployeeManagementSystem system =
                new EmployeeManagementSystem(5);

        system.addEmployee(
                new Employee(101,
                        "Dinesh",
                        "Software Engineer",
                        60000));

        system.addEmployee(
                new Employee(102,
                        "Rahul",
                        "Tester",
                        45000));

        system.addEmployee(
                new Employee(103,
                        "Sneha",
                        "Manager",
                        85000));

        System.out.println("\nEmployee Records:");

        system.displayEmployees();

        System.out.println("\nSearching Employee ID 102:");

        Employee employee =
                system.searchEmployee(102);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee ID 102:");

        system.deleteEmployee(102);

        System.out.println("\nEmployee Records After Deletion:");

        system.displayEmployees();
    }
}