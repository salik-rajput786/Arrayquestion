package array;

import java.util.Scanner;

public class sumofgivenarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum =0;
        System.out.println("enter array element of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            
        }
        System.out.println("the sum of given array is "+sum);
    }
    
}
