
/**
 * pr1
 */
// import java.util.*;
//import java.util.*;
//public class pr1 {
/** printstatements
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
/**variables
 * public static void main(String[] args) {
 * int a = 223; // variable
 * System.out.println(a);
 * }
 * }
 */
/**scanner
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
/**Conditional statements ex1
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
/**Conditional statements ex2
 * 
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
/*  SWITCH _MONTH
 * import java.util.*;
 * class Pr2{
 * public static void main(String[]args){
 * Scanner sc= new Scanner(System.in);{
 * System.out.println("enter the number of the month");
 * int month=sc.nextInt();
 * switch(month){
 * case 1 :System.out.println("jan");
 * break;
 * case 2 :System.out.println("feb");
 * break;
 * case 3 :System.out.println("mar");
 * break;
 * case 4 :System.out.println("april");
 * break;
 * case 5 :System.out.println("may");
 * break;
 * case 6 :System.out.println("june");
 * break;
 * case 7 :System.out.println("july");
 * break;
 * case 8 :System.out.println("aug");
 * break;
 * case 9 :System.out.println("sep");
 * break;
 * case 10 :System.out.println("oct");
 * break;
 * case 11 :System.out.println("Nov");
 * break;
 * case 12 :System.out.println("dec");
 * break;
 * default :System.out.println("invalid numb");
 * break;
 * }
 * }
 * }
 * }
 * 
 * 
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
/**LOOPS
 * 
 * 
 * public static void main(String[] args) {
 * 
 * for (int i = 0; i <= 10; i++) {
 * System.out.println(i);
 * }
 * }
 */
/** While loop
 * public static void main(String[] args) {
 * int i = 0;
 * while (i <= 10) {
 * System.out.println(i);
 * i++;
 * }
 * }
 */
/*PRINT THE SUM OF N NATURAL NO.
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int sum = 0;
 * for (int i = 0; i <= n; i++) {
 * sum = sum + i;
 * }
 * System.out.println(sum);
 * }
 * }
 */
/** print the table of a no , input by the user
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * for (int i = 1; i <= 10; i++) {
 * System.out.println(n + " * " + i + " = " + (n * i));
 * }
 * 
 * }
 */
/**solid rectangle
 * public static void main(String[] args) {
 * int n=4;
 * int m=5;
 * 
 * for(int i=1;i<=n;i++){
 * for(int j=1;j<=m;j++){
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * }
 * }
 */
/*hollow rectangle
 * public static void main(String[] args) {
 * int n = 4;
 * int m = 5;
 * for (int i = 1; i <= n; i++) {
 * for (int j = 1; j <= m; j++) {
 * if (i == 1 || j == 1 || i == 4 || j == 5) {
 * System.out.print("*");
 * } else {
 * System.out.print(" ");
 * }
 * }
 * System.out.println();
 * 
 * }
 * }
 */
/* * half pyramid
 * public static void main(String[] args) {
 * int n = 4;
 * 
 * for (int i = n; i >= 1; i--) { //reverse this loop for the inverted pyramid//
 * for (int j = 1; j <= i; j++) {
 * System.out.print("*");
 * }
 * System.out.println("");
 * }
 * }
 */
/*Floyd's triangle
 * public static void main(String[] args) {
 * int n=5;
 * int num=1;
 * for(int i=1;i<=n;i++){
 * for(int j=1;j<=i;j++){
 * System.out.print(num + " ");
 * num++; }
 * System.out.println();
 * }
 */
/*0-1 pyramid
 * 
 * public static void main(String[] args) {
 * 
 * 
 * int n=5;
 * for (int i=1;i<=n;i++){
 * for (int j=1;j<=i;j++){
 * int sum = i + j;
 * if (sum % 2==0){
 * System.out.print("1");
 * }
 * else{
 * System.out.print("0");
 * }
 * }
 * System.out.println("");
 * }
 * }
 */
/**
 * hw
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * int input;
 * 
 * do {
 * int marks = sc.nextInt();
 * if (marks >= 90 && marks <= 100) {
 * System.out.println("This is Good");
 * } else if (marks >= 60 && marks <= 89) {
 * System.out.println("This is also Good");
 * } else if (marks >= 0 && marks <= 59) {
 * System.out.println("This is Good as well");
 * } else {
 * System.out.println("Invalid");
 * }
 * 
 * System.out.println("Want to continue ? (yes(1) or no(0))");
 * input = sc.nextInt();
 * 
 * } while (input == 1);
 * }
 * }
 */
// import java.util.Scanner;

// class exercise {
// double average(int a, int b, int c) {
// double sum = (a + b + c) / 3;
// return sum;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the first number:");
// int a = sc.nextInt();
// System.out.println("Enter the second number:");
// int b = sc.nextInt();
// System.out.println("Enter the third number:");
// int c = sc.nextInt();
// exercise ex = new exercise();
// System.out.println("average of three numbers is:");
// System.out.println(ex.average(a, b, c));
// sc.close();
// }
// }
// classes and objects \
// comes with states and behaviour//

// public class printer {
//     public void print(int s) {
//         System.out.println(s);
//     }

//     public static void main(String[] args) {
//         printer p = new printer();
//         p.print(10.6);
//     }

// }

// import javax.sound.midi.Soundbank;

/**
 * printer
 */
// public class printer {

//      final void aba() {
//         System.out.println("aaa");

//     }
// }

//  class Innerprinter extends printer {

//     public void aba() {
//         System.out.println("aaaaaaa");
//     }

// }
//   class Innerprinter_1 extends Innerprinter {

    
// }

// cls example

   







