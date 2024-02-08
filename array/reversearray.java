package array;

import java.util.Scanner;
    
public class reversearray {
    public static int[] reverse1(int[]arr){
        int n = arr.length;
        int ans[] =new int[n];
        int  j=0;
        for (int i = n-1; i >=0; i--) {
            ans[j++] = arr[i];
        }
        
        return ans;
    }
    public static void input(int arr[]){
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] +" ");
            
        }
        System.out.println();
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a size of array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array element of array ");
       for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
       }

        int ans[] = reverse1(arr);
        System.out.println("the rotate array is  ");
        input(ans);
       
    
    }
    
}
