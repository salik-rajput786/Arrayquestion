package array;

import java.util.Scanner;

class main{
    public void  maxfound(int [] arr){
        int ans =0;
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans ) {
                ans=arr[i];
            }
         }
         System.out.println(ans);
       
    }
    
 }
public class maxarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a size of array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
       // System.out.println("enter array element of array ");
       arrayinput obj1= new arrayinput();
       main obj = new main();
             obj.maxfound(arr);
             obj1 .input(arr);
         
        }
      
    }
 
