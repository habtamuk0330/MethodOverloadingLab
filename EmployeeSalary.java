/*
 * Question 3: Employee Salary Calculation Using Method Overloading
 *
 * The EmployeeSalary class has three methods all named calculateSalary().
 * Each one handles a different category of worker, and Java picks the
 * right one based on the number, types, and order of the arguments.
 */
public class EmployeeSalary {

    // Permanent employee: returns the fixed annual salary
    public double calculateSalary(double annualSalary) {
        return annualSalary;
    }

    // Hourly employee: returns gross weekly pay (hourly rate x hours worked)
    public double calculateSalary(double hourlyRate, int hoursWorked) {
        return hourlyRate * hoursWorked;
    }

    // Consultant: returns total payment (assignments completed x fee per assignment)
    public double calculateSalary(int completedAssignments, double feePerAssignment) {
        return completedAssignments * feePerAssignment;
    }

    // Creates an EmployeeSalary object and calls each overloaded method
    public static void main(String[] args) {
        // 1. Create an object of the EmployeeSalary class
        EmployeeSalary emp = new EmployeeSalary();

        // 2. Permanent employee: annual salary of $65,000
        double permanentPay = emp.calculateSalary(65000.0);

        // 3. Hourly employee: $25.50 per hour, 40 hours worked
        double hourlyPay = emp.calculateSalary(25.50, 40);

        // 4. Consultant: 5 assignments at $350 each
        double consultantPay = emp.calculateSalary(5, 350.0);

        // 5. Display the earnings for each category
        System.out.printf("Permanent employee annual salary: $%,.2f%n", permanentPay);
        System.out.printf("Hourly employee gross weekly salary: $%,.2f%n", hourlyPay);
        System.out.printf("Consultant total payment: $%,.2f%n", consultantPay);
    }
}
