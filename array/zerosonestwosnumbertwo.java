package array;
// method 2  to sove this question
// this method also called dutch flag algroithm to solve sort 0 , 1  and 2 
public class zerosonestwosnumbertwo {
    public static void swap(int arr[] , int a, int b){
     int temp =arr[a];
     arr[a]=arr[b];
     arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0,2,1,0 };
        int n = arr.length;
        int mid = 0;
        int low= 0;
        int hi = n-1;
        while (mid<=hi) {
            if (arr[mid]==0) {
                swap(arr, mid, low);
                mid++; 
                low++;
            }
            else if (arr[mid]==1) {
                mid++;
            }
            else {
                swap(arr, mid, hi);
                hi--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
