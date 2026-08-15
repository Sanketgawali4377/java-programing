//print sum of first n natural numbers

package Recurtion;

public class basicQue2{

public static void printsum(int n , int sum,int i) {
  
        if(i == n){
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printsum( n, sum,i+1);
        System.out.println(i);
 
}
public static void main(String[] args){
     printsum( 5 , 0, 1);
 
 
}
}