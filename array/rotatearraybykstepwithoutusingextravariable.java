package array;

import java.util.Scanner;

public class rotatearraybykstepwithoutusingextravariable {
    public static void reverse(int []arr, int i , int j){
        // i=0;
        // j=arr.length-1;
        while (i<j) {
         swap(arr,i,j);
        
              i++;
              j--;
        }

    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void rotaearry(int arr[] , int k){
        int n =arr.length;
        k=k%n;
        reverse(arr,0, n-k-1 );
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void input(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter "+n+" elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter k element ");
        int k = sc.nextInt();
        System.out.println("the original array is : ");
        input(arr);
        rotaearry(arr, k);
        System.out.println("after the rotate array is : ");
       input(arr);
    }
}
