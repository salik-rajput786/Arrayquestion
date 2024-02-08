package array;



import java.util.Arrays;
import java.util.Scanner;
public class smallestandlargestarray {
    public int[] smallestandlargest(int [] arr ){
        Arrays.sort(arr);
        int ans[] = {arr[0], arr[arr.length-1]};
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
    smallestandlargestarray objs = new smallestandlargestarray();
      int [] ans = objs.smallestandlargest(arr);
      System.out.println("the smallest number is "+ans[0]);
      System.out.println("the greatest number isb "+ans[1]);
  }
}
