package Recurtion;

public class fibonacci {

    public static void print(int term, int a, int b, int i) {

        if (term == 0) {
            return;
        }

        int sum = a + b;
        System.out.print(i + " ");

        System.out.println(sum);

        print(term - 1, b, sum, i+1);
    }

    public static void main(String[] args) {

        int term = 20;
        int i = 1;
        int a = 0;
        int b = 1;

        print(term, a, b, i);
    }
}

