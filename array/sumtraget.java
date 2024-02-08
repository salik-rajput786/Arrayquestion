package array;

import java.util.Scanner;

public class sumtraget {
    public static int traget(int[]arr,int traget){
        
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) { 
            if (arr[i]+arr[j]==traget) {
                ans++;
            }
        } 
        }
        return ans;
    }
      public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a size of array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter " + n + " element");
    arrayinput obj = new arrayinput();
    obj.input(arr);
    System.out.println("enter the traget to find in array");
    int k = sc.nextInt();
   int ans= traget(arr, k);
   System.out.println(ans);
      }
}
