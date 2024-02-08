package array;

import java.util.Scanner;

public class subarray {
    public static void subarr(int arr[]) {
    
        for (int i = 0; i < arr.length; i++) {
            int star = i;
            for (int j = i; j < arr.length; j++) {
                int ends = j;

                for (int k = star; k <=ends; k++) {
                   
                    System.out.print(arr[k]);
                   
                }
               
                System.out.println();
            }
           System.out.println();
        }
    }

    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enterthe size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + " element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        subarr(arr);

    }
}
