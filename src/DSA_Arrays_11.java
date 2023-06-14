public class DSA_Arrays_11 {
    public static void rearrange( int []arr,int n){
        int [] temp = new int[n];
        for(int i = 0;i<n;i++){
            temp[i]= arr[arr[i]];
        }
        for (int i = 0;i<n;i++){
            System.out.print(temp[i]+" ");
            System.out.print(arr[i]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[]arr={4,0,2,1,3};
        int n = arr.length;
        rearrange(arr, n);
    }
}
