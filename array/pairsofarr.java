package array;
import java.util.*;
public class pairsofarr {
    public static void pair(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }

        //int arr[] ={4,2,3,1,5};
     
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enterthe size of array ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("enter " + n + " element ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
               pair(arr);       
    
    }
}

