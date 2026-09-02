package Recurtion;

public class First_Last_Occurence {

    public static int first = -1;
    public static int last = -1;


    public static void count(String str,int index,char element){
        if(index == str.length()){

            System.out.println(first);
            System.out.println(last);
            return;

        } 
        char currentChar = str.charAt(index);


        if(currentChar == element){
            if (first==-1) {
                first = index;
                
            }else{
                last = index;
            }
        }

        count(str, index+1, 'b');
        }

    
    public static void main(String[] args) {
        
        String str ="gfgdgkdjvjbvbbfbj";

        count(str,0,'b');

    }
    
}
