package array;

import java.util.Scanner;

public class tragetsumofthreenumber {
    public static int sumtraget(int[] arr, int traget) {

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int j2 = i + 2; j2 < arr.length; j2++) {

                    if (arr[i] + arr[j]+arr[j2] == traget) {
                        ans++;
                    }
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
        System.out.println("enter the traget to find in array");
        int k = sc.nextInt();
        int ans = sumtraget(arr, k);
        System.out.println(ans);
    }

}
