package array;

import java.util.Scanner;

public class stricklygreater {
    public static int  stricklygreaternumber(int[]arr ,int x){
    int count = 0;
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i]>x) {
                count++;
            }
            
           
        }
        return count;
       
    }
     public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        System.out.println("enter a size of array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter "+n+ " element");
       arrayinput obj= new arrayinput();
        obj.input(arr);
        System.out.println("enter a target ");
        int x =sc.nextInt();
       int ans = stricklygreaternumber(arr,x);
       System.out.println("the strictly greater number than " +x+ " are " +ans);
       
     }
}
