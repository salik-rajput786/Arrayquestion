package array;

import java.util.Scanner;

public class lastnumber {
    public static int findlastnumber(int[]arr,int x){
       int  lastnumber= -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                   lastnumber=i;
            }
            
        }
        return lastnumber;
    }
     public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        System.out.println("enter a size of array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array element of array ");
       arrayinput obj= new arrayinput();
        obj.input(arr);
        System.out.println("enter a target ");
        int x =sc.nextInt();
        int ans = findlastnumber(arr,x);
        System.out.println("the last number of the give array is "+ans);
     }
    
}
