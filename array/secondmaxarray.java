package array;

import java.util.Scanner;

public class secondmaxarray {
    public static  int  finddmax(int []arr){
       // first method to find  second max number from array 
     int max = Integer.MIN_VALUE;
   
     for (int i = 0; i < arr.length; i++) {
        if (arr[i]>max ) {
           max=arr[i];
        }
     }
     int max1 = Integer.MIN_VALUE;
     for (int i = 0; i < arr.length; i++) {
        if (arr[i]>max1 && arr[i]!=max ) {
           max1=arr[i];
        }
     }
     return max1;
   }
     // second method to find  second max number from array 
     
   //  public static int secondmax(int arr[]){
   //   int mx = finddmax(arr);
   //   for (int i = 0; i < arr.length; i++) {
   //    if (arr[i]==mx) {
   //       arr[i]=Integer.MIN_VALUE;
          
   //    }
   //  }
   //  int secondmax = finddmax(arr);
   //  return secondmax;
   // }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array : ");

        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + " element");
        arrayinput obj = new arrayinput();
        obj.input(arr);

         System.out.println("the second greatest number is "+finddmax(arr));
}
}