
/**
 * pr1
 */
import java.util.*;

public class pr1 {
    /**
     * printstatements
     * public static void main(String[] args) {
     * // System.out.println("hello World");
     * // System.out.println("hello wWorld");
     * System.out.print("*\n"); // use \n to print the next terms on the new line
     * System.out.println("**"); // use println to print the next terms on new line
     * System.out.println("***");
     * System.out.println("****");
     * System.out.println("*****");
     * System.out.print("******"); // use basic print statement to just print on the
     * samr line
     * }
     * }
     */
    /**
     * variables
     * public static void main(String[] args) {
     * int a = 223; // variable
     * System.out.println(a);
     * }
     * }
     */
    /**
     * scanner
     * 
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("enter the valur of a:");
     * int a = sc.nextInt();
     * System.out.println("enter the valur od b:");
     * int b = sc.nextInt();
     * int sum = a + b;
     * System.out.println("sum of a and b is:" + sum);
     * sc.close();
     * }
     * }
     **/
    /**
     * Conditional statements ex1
     * public static void main (String[] args)
     * {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter your age:");
     * int age = sc.nextInt();
     * if (age>18) {
     * System.out.println("you are eligible to vote");
     * }
     * else {System.out.println("your are not an adult");
     * }
     * 
     * sc.close();
     * }
     * }
     */
    /** Conditional statements ex2 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than b");

        }

        sc.close();
    }
}