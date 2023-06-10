public class DSA_Arrays_7 {
    public static int [] negToLast(int[] arr, int n){
        int []temp= new int[n];
        int j =0;
        for(int i =0;i<n;i++){
            if(arr[i]>0){
                temp[j++]=arr[i];
            }
        }
        if(j==n||j==0){
            return arr;
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[j++]=arr[i];
            }
        }
        for(int i =0;i<n;i++){
            arr[i]=temp[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {1,54,959,-4,-5,844,-45,-48};
        int n = arr.length;
        arr = negToLast(arr,n);
        for(int i =0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
