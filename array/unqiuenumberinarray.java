package array;

import java.util.Scanner;

import PracticesQuesionofPattern.elventhquestion;

public class unqiuenumberinarray {
    public static int unqiuerepetednumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
               
            }
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                 ans=arr[i];
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
        int ans = unqiuerepetednumber(arr);
        System.out.println("this number  " + ans + " is  not repeted in array ");
    }
}
