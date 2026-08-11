

public class BubbleSort {
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println( arr[i] + " ");
        }
    }
    public static void main(String [] args){
        int arr[] = {12,4,1,7,8};


        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {

                if(arr[j]>arr[j+1])
                {
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;

                }
            }
         
        }

        printarr(arr);
       
    }
    
}
