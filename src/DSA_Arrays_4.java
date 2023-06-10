public class DSA_Arrays_4 {
    public static void rotateArray(int[]arr, int k,int n){
        int check =0;
        while(check<k){
            int x = arr[n-1];
            for (int i = arr.length-1; i > 0; i--)
                arr[i] = arr[i-1];
            arr[0] = x;
            k++;
        }

    }
    public static void main(String[] args) {
        int[]arr= {1,2,3,4,5};
        int k = 1;
        int n = arr.length;
        rotateArray(arr,k,n);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
