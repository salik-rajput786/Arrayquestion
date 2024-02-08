package array;

import java.util.Scanner;

public class repetednuberinarray {
     public static int repetednuber(int[]arr){
        
      int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) { 
            if (arr[i]==arr[j]) {
               ans++;
        } 
        }
       
    }
    return ans;
  }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array : ");
    
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + " element");
        arrayinput obj = new arrayinput();
        obj.input(arr);
       int ans= repetednuber(arr);
       System.out.println("there are "+ans+ " number are repeted in array ");
      }
  }
