package Recurtion;

public class TowerOfHanoi {

    static int step = 1;

    public static void towerofhanoi( int n,String src,String hel,String des ){
        if(n==1){
            System.out.println(step + " transfer disk " + n + " " + "from " + src + "to " +des);
            step++;
            return ;
        } 
        towerofhanoi( n-1,src,des,hel );
        System.out.println(step + " transfer disk " + n  +" "+ "from " + src + "to" + des);
        step++;


        towerofhanoi(n-1,hel,src,des );
    }
    public static void main(String[] args) {
        
        int n = 3;
     
        towerofhanoi(n ," S "," H "," D " );
    }
    
}
