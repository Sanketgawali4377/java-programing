//Write a program to find if a number is a power of 2 or not.


import java.util.*;

public class Que1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a power of 2");
        }
    }
}