/*
 * Question 2: Calculator Program Using Method Overloading
 *
 * The Calculator class has three methods all named add(). Java tells
 * them apart by their parameter lists (number and data types of parameters).
 */
public class Calculator {

    // Adds two integers and returns their sum
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Adds three integers and returns their sum
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Adds two decimal (double) numbers and returns their sum
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Creates a Calculator object and calls each overloaded add() method
    public static void main(String[] args) {
        // 1. Create an object of the Calculator class
        Calculator calc = new Calculator();

        // 2. Call add(int, int)
        int sum1 = calc.add(10, 20);

        // 3. Call add(int, int, int)
        int sum2 = calc.add(10, 20, 30);

        // 4. Call add(double, double)
        double sum3 = calc.add(10.5, 20.5);

        // 5. Display the results
        System.out.println("Sum of two integers (10 + 20): " + sum1);
        System.out.println("Sum of three integers (10 + 20 + 30): " + sum2);
        System.out.println("Sum of two doubles (10.5 + 20.5): " + sum3);
    }
}
