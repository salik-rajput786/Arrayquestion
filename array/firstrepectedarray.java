package array;

import java.util.Scanner;

public class firstrepectedarray {
    public static int  firstrepected(int []arr){
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {   
            if (arr[i]==arr[j]) {
              return arr[i];
            }
        }
    }
        return -1;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array : ");

        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + " element");
        arrayinput obj = new arrayinput();
        obj.input(arr);
        System.out.println("the first repected array is "+firstrepected(arr));
}
}
