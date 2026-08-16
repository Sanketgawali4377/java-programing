//print factorial of a number n
package Recurtion;

public class Factorial {
    public static int print(int n) {

        

            if(n==1){
                return 1;
            }

            int fact = print(n-1);
            int cal_fact = n*fact;
            return cal_fact;
        
    }
    public static void main(String[] args) {
        int n = 5;

       

        int ans = print(n);
        System.out.println(ans);
    }

    
}
