/**
 * Problem Set 4.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet4 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();

        // comment out or uncomment as needed

        //ps.sum();
        //ps.reverse();
        ps.digits();
        //ps.average();
        //ps.prime();
        //ps.fibonacci();
        //ps.factors();
        //ps.mario();
        //ps.luigi();
        //ps.credit();

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     *
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */

    public void sum() {
        System.out.print("\nLower Bound: ");
        long lowerBound = in.nextLong();
        System.out.print("Upper Bound: ");
        long upperBound = in.nextLong();
        long sum = 0;
        do {
            System.out.print("Lower Bound: ");
            lowerBound = in.nextLong();
            System.out.print("Upper Bound: ");
            upperBound = in.nextLong();
        } while(lowerBound > upperBound);
        for(long i = lowerBound; i <= upperBound; i ++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.printf("\n%,d.", sum);

    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */

    public void reverse() {
        long positiveInteger = 0;
        do {
            System.out.print("Positive Integer: ");
            positiveInteger = in.nextLong();
        } while(positiveInteger <= 0);
        int lastDigit;
        while(positiveInteger > 10) {
            lastDigit = (int) (positiveInteger % 10);
            System.out.printf("%d, ", lastDigit);
            positiveInteger = (long) Math.floor(positiveInteger / 10);
        }
        System.out.printf("%d.", positiveInteger);
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */

    public void digits() {
        long positiveInteger = 0;
        System.out.println("");
        do {
            System.out.print("Positive integer: ");
            positiveInteger = in.nextLong();
        } while(positiveInteger <= 0);
        int lastDigit = (int) (positiveInteger % 10);;
        int sum = 0;
        while(positiveInteger != 0) {
            if(lastDigit % 2 == 1) {
                sum += lastDigit;
            }
            lastDigit = (int) (positiveInteger % 10);
            positiveInteger = (long) Math.floor(positiveInteger / 10);
        }
        System.out.printf("\n%d. ", sum);
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */

    public void average() {

    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */

    public void prime() {

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */

    public void fibonacci() {

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a positive integer. What are its factors?
     */

    public void factors() {

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */

    public void mario() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */

    public void luigi() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */

    public void credit() {

    }
}
