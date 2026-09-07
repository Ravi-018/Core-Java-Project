//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Ravi", 1, 50000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Gopi", 2, 120, 150);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();

        System.out.println("Removing Employee: ");
        payrollSystem.removeEmployee(2);

        System.out.println("Remaining Employee: ");
        payrollSystem.displayEmployees();
    }
}