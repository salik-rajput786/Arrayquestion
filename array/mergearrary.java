package array;

import java.util.Scanner;

public class mergearrary {

    public static void main(String[] args) {

        int a[] = { 11, 33, 42, 62 };
        int b[] = { 26, 54, 69, 81, 94 };
        int c[] = new int[a.length + b.length];
        // int i = a.length-1;
        // int j= b.length;
        // int k =c.length-1;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;

            } else {
                c[k] = b[j];
                j++;
            }
            k++;
            if (i == a.length) {
                while (j < b.length) {
                    c[k] = b[j];
                    j++;
                    k++;
                }

            }
            if (j == b.length) {
                while (i < a.length) {
                    c[k] = a[i];
                    i++;
                    k++;
                }

            }
        }
        for (int ele : c) {
            System.out.print(ele + " ");
        }

    }
}
