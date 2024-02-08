package array;

public class zerosonestwosnumber {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0,2,1,0 };
        int n = arr.length;
        int noofzero = 0;
        int noofone = 0;
       

        // method 1 to sove this question
        // int noofzero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 ) {
                noofzero++;
               
            }
                    if(arr[i]==1){
                noofone++;
            }
        }
        //this was by four pass 
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 1) {
        //         noofone++;
        //     }
        // }
        //    for (int i = 0; i < noofzero; i++) {
        //     arr[i]=0;
        //    }
        //    for (int i = noofzero; i < n; i++) {
        //     arr[i]=1;
        //    }
        //    for (int i = noofzero+noofone; i < n; i++) {
        //     arr[i]=2;
        //    }


         //this was by two pass
          for (int i = 0; i < n; i++) {
            if (noofone>i) {
                arr[i]=0;
            }
            else if (i<noofone+noofzero) {
                arr[i]=1;
            }
            else 
            {
                arr[i]=2;
            }
            
          }
       

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
