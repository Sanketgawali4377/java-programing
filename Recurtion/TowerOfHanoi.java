package Recurtion;

public class TowerOfHanoi {

    public static void towerofhanoi(int n,String src,String hel,String des ){
        if(n==1){
            System.out.println("transfer disk " + n + " " + "from " + src + "to " +des);
            return ;
        } 
        towerofhanoi(n-1,src,des,hel );
        System.out.println("transfer disk " + n  +" "+ "from " + src + "to" + des);
        towerofhanoi(n-1,hel,src,des );
    }
    public static void main(String[] args) {
        
        int n = 3;
        



        towerofhanoi(n ," S "," H "," D " );
    }
    
}
