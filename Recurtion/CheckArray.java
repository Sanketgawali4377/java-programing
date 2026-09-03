package Recurtion;

public class CheckArray {


    public static boolean checkarray(int arr[],int index){

        if(index == arr.length-1){
            return true;
        }

        if(arr[index]<arr[index+1]){
            return checkarray(arr,index+1);
        }
        else{
            return false;
        }


        
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,6,7,8};
        System.out.println(checkarray(arr, 0));
    }

}
