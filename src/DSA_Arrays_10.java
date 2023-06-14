public class DSA_Arrays_10 {
    public static boolean checkTriplet(int[] arr, int n) {
        // code here
        int [] temp = new int[n];
        for(int i = 0;i<n;i++){
            temp[i]= arr[i]*arr[i];
        }
        int right =0;
        for(int i =0;i<n;i++){
            for(int j =i;j<n-1;j++){
                right = (i*i)+(j*j);
            }
            for(int j=0;j<n;j++){
                if(right==temp[j]){
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {3,8,5};
        int n = arr.length;
        System.out.println(checkTriplet(arr,n));
    }
}
