package array;

import java.util.Scanner;

public class sortedarray {
  public static boolean issorted(int[] arr) {
    boolean cheeck = true;

    for (int i = 1; i < arr.length; i++) {

      if (arr[i] < arr[i - 1] ) {
        cheeck = false;

        break;

      }

    }
    return cheeck;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a size of array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter " + n + " element");
    arrayinput obj = new arrayinput();
    obj.input(arr);
    System.out.println("array is sorted " + issorted(arr));
  }
}
