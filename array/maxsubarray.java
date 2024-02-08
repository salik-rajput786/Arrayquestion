package array;

import java.util.Scanner;

public class maxsubarray {
     public static void maxsubarr(int arr[]) {
      int currsum =0;
      int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int star = i;
            for (int j = i; j < arr.length; j++) {
                int ends = j;
               currsum =0;

                for (int k = star; k <=ends; k++) {
                   currsum+=arr[k];
                }
                
                System.out.println(currsum);
                if (maxsum<currsum) {
                    maxsum=currsum;
                }
            }
            System.out.println();
            }
          System.out.println("max sum =" + maxsum);
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
        System.out.println();
        maxsubarr(arr);

    }
    
}
