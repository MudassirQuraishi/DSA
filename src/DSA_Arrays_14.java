public class DSA_Arrays_14 {
    public static void tripletSum(int [] arr, int n){
        int result =0;
        for(int i =0;i<n-2;i++){
            int check =0;
            for(int j =i+1;j<n-1;j++){
                int prod=0;
                for(int k =j+1;k<n;k++){
                     prod = arr[i]*arr[j]*arr[k];
                }
                if(prod >check){
                    check =prod;
                }
                if(check>result){
                    result = check;
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {-3,-5,1,0,8,3,-2};
        int n = arr.length;
        tripletSum(arr, n);
    }
}
