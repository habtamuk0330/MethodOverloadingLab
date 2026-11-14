/*
 * Question 1: Ambiguous method overloading
 *
 * This file intentionally does NOT compile. It shows that the call f(1, 2)
 * is ambiguous when these two overloaded methods both exist.
 *
 * Compiler error:
 *   error: reference to f is ambiguous
 *     both method f(int,double) in Question1 and method f(double,int) in Question1 match
 */
public class Question1 {

    // Version 1: first parameter int, second parameter double
    public static void f(int x, double y) {
        System.out.println("f(int, double)");
    }

    // Version 2: first parameter double, second parameter int
    public static void f(double x, int y) {
        System.out.println("f(double, int)");
    }

    public static void main(String[] args) {
        f(1, 2);   // ERROR: ambiguous - neither method is a better match
    }
}
