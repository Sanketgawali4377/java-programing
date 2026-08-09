

public class BitBasics {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        // Bitwise AND
        System.out.println("AND: " + (a & b));

        // Bitwise OR
        System.out.println("OR: " + (a | b));

        // Bitwise XOR
        System.out.println("XOR: " + (a ^ b));

        // Bitwise NOT
        System.out.println("NOT: " + (~a));

        // Left Shift
        System.out.println("Left Shift: " + (a << 1));

        // Right Shift
        System.out.println("Right Shift: " + (a >> 1));

        // Check even or odd using bit manipulation
        int n = 7;

        if ((n & 1) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }
}