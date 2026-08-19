package Recurtion;

public class power {
    public static int calp(int x,int n) {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        int xpowernm1 = calp(x,n-1);
        int xpowern = x * xpowernm1;
        return xpowern;

        
    }
    public static void main(String[] args) {
       
        int x=2;
        int n=7;
        int ans = calp(x,n);
        System.out.println(ans);
    }
    
}
