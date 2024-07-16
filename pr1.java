
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
    /**
     * Conditional statements ex2
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter the value of a:");
     * int a = sc.nextInt();
     * System.out.println("Enter the value of b:");
     * int b = sc.nextInt();
     * if (a == b) {
     * System.out.println("a is equal to b");
     * } else if (a < b) {
     * System.out.println("a is less than b");
     * } else {
     * System.out.println("a is greater than b");
     * 
     * }
     * 
     * sc.close();
     * }
     * }
     */
    /**
     * switch statements
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter the value of a:");
     * int a = sc.nextInt();
     * System.out.println("Enter the value of b:");
     * int b = sc.nextInt();
     * System.out.println("Choose an operation:");
     * System.out.println("1: + (Addition)");
     * System.out.println("2: - (Subtraction)");
     * System.out.println("3: * (Multiplication)");
     * System.out.println("4: / (Division)");
     * System.out.println("5: % (Modulo)");
     * int choice = sc.nextInt();
     * switch (choice) {
     * case 1:
     * System.out.println("result is :" + (a + b));
     * break;
     * case 2:
     * System.out.println("result is :" + (a - b));
     * break;
     * case 3:
     * System.out.println("result is :" + (a * b));
     * break;
     * case 4:
     * System.out.println("result is :" + (a / b));
     * break;
     * case 5:
     * System.out.println("result is :" + (a % b));
     * break;
     * default:
     * System.out.println("Invalid choice");
     * }
     * sc.close();
     * }
     * }
     */

    /**
     * LOOPS
     * 
     * 
     * public static void main(String[] args) {
     * 
     * for (int i = 0; i <= 10; i++) {
     * System.out.println(i);
     * }
     * }
     */

    /**
     * While loop
     * public static void main(String[] args) {
     * int i = 0;
     * while (i <= 10) {
     * System.out.println(i);
     * i++;
     * }
     * }
     */

    // PRINT THE SUM OF N NATURAL NO.

   /*
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
} */ 
   // print the table of a no , input by the user

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for (int i = 1; i <= 10; i++) {
           System.out.println(n + " * " + i + " = " + (n * i));
       }

   }
}