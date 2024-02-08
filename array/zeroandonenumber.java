package array;

import method.odd;

public class zeroandonenumber {
    //second method of solve this question 
   public static void zeroandone(int arr[]){
      int i =0 , j =arr.length-1;
       while (i<j) {
        if(arr[i]==0) i++;
       else if (arr[j]==1) j--;
        else  if (arr[i]==1 && arr[j]==0) {
            arr[i]=0;
            arr[j]=1;
            i++;
            j--;
        }
            
        
        
       }
    }
    public static void main(String[] args) {
        // 
        int[] arr={0,0,0,0,1,1,1,0};
         int n =arr.length;

        //method 1 to sove this question 
    //    int noofzero = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i]==0) {
    //             noofzero++;
    //         }
    //     }
    //         for (int j = 0; j < arr.length; j++) {
    //             if (j<noofzero) {
    //                 arr[j]=0;
    //             }
    //             else arr[j]=1;
    //         }    
    //    for (int i : arr) {
    //     System.out.print(i+" ");
    //    }
    //     System.out.println();
       zeroandone(arr);
       for (int i : arr) {
        System.out.print(i+" ");
        
       }
       System.out.println();
    }
}
