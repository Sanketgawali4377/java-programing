package Recurtion;

public class RevarseString {


    public static void string(String str ,int index){
        if(index == 0){
            System.out.print(str.charAt(index));
            return ;
        }
        System.out.print(str.charAt(index));

        string(str,index-1);
    }   
    public static void main(String[] args) {

        String str = "sanket";
        int index = str.length();

        string(str,str.length()-1);
    }
}    
