 //print numbers 5 to 1

package Recurtion;

public class basicQue1 {

   

    public static void printNumb(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }
    public static void main(String[] args) {
        int n = 1;

        printNumb(n);
        
    }
    
}
    

