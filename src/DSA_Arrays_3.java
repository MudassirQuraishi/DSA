public class DSA_Arrays_3 {
    /* Method 1
    public static int missingElement(int [] arr,int n){
        int diff= Math.abs(arr[0]-arr[1]);
        for(int i =0;i<n-1;i++){
            if(Math.abs(arr[i]-arr[i+1])!=diff){
                return (arr[i]+diff);
            }
        }
        return 0;
    }
    */
    public static int progression(int []arr, int n) {
        int diff = (arr[n - 1] - arr[0]) / n;
        return missingElement(arr, 0, n - 1, diff);
    }

    public static int missingElement(int []arr, int low, int high, int diff) {
        if (high <= low)
            return Integer.MAX_VALUE;
        int mid = low + (high - low) / 2;

        if (arr[mid + 1] - arr[mid] != diff)
            return (arr[mid] + diff);

        if (mid > 0 && arr[mid] -
                arr[mid - 1] != diff)
            return (arr[mid - 1] + diff);

        if (arr[mid] == arr[0] + mid * diff)
            return missingElement(arr, mid + 1,
                    high, diff);

        return missingElement(arr, low, mid - 1, diff);
    }
    public static void main (String[] args) {
        int []arr = {2, 4, 6, 8, 10, 14};
        int n = arr.length;
        System.out.println(progression(arr, n));
    }
}
