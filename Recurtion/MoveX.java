package Recurtion;

public class MoveX {

    public static void movex(String str, int index, char target, String newString, int count){
        if(index==str.length()){
           for (int i = 0; i < count; i++) {
                newString = newString + target;
            }

            System.out.println(newString);
            return;

        }

        char currentChar = str.charAt(index);

        if (currentChar == target) {
            count++;
        } else {
            newString += currentChar;
        }
        
        

        movex(str, index + 1, target, newString, count);
       

    }

    public static void main(String[] args) {


        String str ="axbcxxd";
        char target = 'x';



       movex(str,0,target,"",0);
        
    }
    
}
