import java.util.Scanner;

public class exercise {
    double average(int a, int b, int c) {
        double sum = (a + b + c) / 3;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        exercise ex = new exercise();
        System.out.println("average of three numbers is:");
        System.out.println(ex.average(a, b, c));
        sc.close();
    }
}
