package array;

import java.util.Scanner;

public class findarrayindex {
    public static void index(int arr[], int x){
        
        for (int i = 0; i < arr.length; i++) {
            if (x==arr[i]) {
                System.out.print("the given number is of index "+i);
            }
        }
    } 
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        System.out.println("enter a size of array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array element of array ");
       arrayinput obj= new arrayinput();
        obj.input(arr);

        System.out.println("enter the traget number ");
        int x =sc.nextInt();
       index(arr, x);
    }
    
}
