package array;

public class mergearrarytwo {
    public static void main(String[] args) {
        
    
    int a[] = { 11, 33, 42, 62,78 , 92, 98 };
    int b[] = { 26, 54, 69, 81, 94 };
    int c[] = new int[a.length + b.length];
    int i = a.length-1;
    int j= b.length-1;
    int k =c.length-1;
    while (i >=0 && j >=0 ) {
        if (a[i] >= b[j]) {
            c[k] = a[i];
            i--;

        } else {
            c[k] = b[j];
            j--;
        }
        k--;
        if (i == -1) {
            while (j > -1 ) {
                c[k] = b[j];
                j--;
                k--;
            }

         }
        if (j == -1) {
            while (i > -1) {
                c[k] = a[i];
                i--;
                k--;
            }

        }
    }
    for (int ele : c) {
        System.out.print(ele + " ");
    }

}

}