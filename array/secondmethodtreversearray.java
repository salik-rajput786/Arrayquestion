package array;

import java.util.Scanner;

public class secondmethodtreversearray {
    public static void swaparray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swaparray(arr, i, j);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 4, 3 };
        reverse(arr);
        System.out.println("the rotate array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
