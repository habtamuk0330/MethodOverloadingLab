/*
 * Question 4 (f): Corrected Variable Scope program
 *
 * In the original program, "result" was declared inside the if block,
 * so it did not exist outside that block. Here it is declared in main()
 * before the if statement, so it is in scope for the whole method.
 */
public class VariableScope {

    // Calculates result = number * 2 and displays both variables
    public static void main(String[] args) {
        int number = 10;
        int result = 0;   // declared in main() so it is visible outside the if block

        if (number > 5) {
            result = number * 2;   // assign (not re-declare) the variable
            System.out.println("Result: " + result);
        }

        System.out.println("Number: " + number);
        System.out.println("Result: " + result);
    }
}
