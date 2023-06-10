class Pair {
    int min;
    int max;
    Pair(int min,int max){
        this.min=min;
        this.max=max;
    }

}
public class DSA_Arrays_5 {
//    public static void getMinMax(int [] arr, int n){
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for(int i =0;i<n-1;i++){
//            if (arr[i]<min){
//                min = arr[i];
//            }
//            if (arr[i]>max){
//                max= arr[i];
//            }
//        }
//        System.out.format("Min is %d\nMax is %d",min,max);
//    }

    public static Pair getMinMax(int[] arr, int n){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n-1;i++){
            if (arr[i]< min){
                min = arr[i];
            }
            if (arr[i]>max){
                max= arr[i];
            }
        }
        return new Pair(min,max);
    }
    public static void main(String[] args) {
        int [] arr= {23,231,123,1231,2414,12,11,42};
        int n = arr.length;
        Pair result = getMinMax(arr,n);
        System.out.println(result.min);
        System.out.println(result.max);
    }
}
