package array;

import java.util.Scanner;

public class rotatearraybykstep {
    public static int [] rotate(int arr[] , int k ){
        int n = arr.length;
     int ans[] = new int[n];
     int j= 0;
     k = k%n;
       for (int i = n-k; i <n;i++) {
          ans[j++]=arr[i];
       }
       for(int i = 0;i<n-k;i++){
        ans[j++]=arr[i];
        
       }
       return ans ;
        }
        public static void input(int arr[]){
               for (int i = 0; i < arr.length; i++) {
                 System.out.print(arr[i] +" ");
                   
               }
               System.out.println();
       }
    
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        System.out.println("enter a size of array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array element of array ");
       for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
       }
        System.out.println("enter the nuber hoe much you want yo rotae arry ");
        int k = sc.nextInt();
        System.out.println("the ogrinal array is ");
        input(arr);
        
        System.out.println("after aotate array is");
       int ans[] =  rotate(arr, k);
       input(ans);
    }
}

