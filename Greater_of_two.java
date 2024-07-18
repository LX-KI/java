/**
 * Greater_of_two
 */
import java.util.*;
public class Greater_of_two {

    int Greater(int a, int b){
        if (a>b){
            return a ;
        }
        else{return b;}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b =sc.nextInt();
        Greater_of_two gOf_two= new Greater_of_two();
    System.out.println(gOf_two.Greater(a, b));        

    }
}